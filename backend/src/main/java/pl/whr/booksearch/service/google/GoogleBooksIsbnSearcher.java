package pl.whr.booksearch.service.google;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.books.Books;
import com.google.api.services.books.BooksRequestInitializer;
import com.google.api.services.books.model.Volume;
import com.google.api.services.books.model.Volumes;
import pl.whr.booksearch.model.Book;
import pl.whr.booksearch.service.BookRetriever;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class GoogleBooksIsbnSearcher implements BookRetriever {
    private static final Logger LOG = LoggerFactory.getLogger(GoogleBooksIsbnSearcher.class);

    private final String APPNAME = "BOOKEO";
    private final String apiKey = "AIzaSyBqoq_bGMnSpQ4ih1DrcqnB_o1GQJqyw7s";

    // TODO: shouldn't book title be replaced by what google api gives us?
    public Collection<Book> findByTitle(String title) {
        LOG.info("Looking for book with title: " + title);
        try {
            Set<String> isbns = findIsbns(title);
            LOG.info("Following ISBN-s found: " + isbns);
            return isbns.stream().map(isbn -> new Book(title, isbn)).collect(Collectors.toList());
        } catch (Exception ex) {
            ex.printStackTrace();
            LOG.error("Couldn't find identifiers for book: " + title + ": " + ex.getMessage());
            return List.of(new Book(title, ""));
        }
    }

    private Set<String> findIsbns(String title) throws GeneralSecurityException, IOException {
        final JacksonFactory jsonFactory = JacksonFactory.getDefaultInstance();
        final Books books = new Books.Builder(GoogleNetHttpTransport.newTrustedTransport(), jsonFactory, null)
                .setApplicationName(APPNAME)
                .setGoogleClientRequestInitializer(new BooksRequestInitializer(apiKey))
                .build();
        Volumes volumes = books.volumes().list(title).execute();

        return volumes.getItems().stream()
                .map(this::getIsbnsFromVolume)
                .flatMap(Function.identity())
                .collect(Collectors.toSet());
    }

    private Stream<String> getIsbnsFromVolume(Volume volume) {
        final List<Volume.VolumeInfo.IndustryIdentifiers> industryIdentifiers = volume.getVolumeInfo().getIndustryIdentifiers();
        if (industryIdentifiers == null) {
            return Stream.of();
        } else {
            return volume.getVolumeInfo().getIndustryIdentifiers().stream().filter(identifier ->
                    identifier.getType().contains("ISBN")).map(Volume.VolumeInfo.IndustryIdentifiers::getIdentifier);
        }
    }

    // TODO: replace with integration test
    public static void main(String args[]) {
        GoogleBooksIsbnSearcher client = new GoogleBooksIsbnSearcher();
        try {
            System.out.println(client.findByTitle("costam"));
            //System.out.println(client.search("fdsafdsasfdas"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
