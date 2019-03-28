package pl.whr.booksearch.controller;

import pl.whr.booksearch.model.Offer;
import pl.whr.booksearch.service.BookOfferSearcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class BackendController {
    private static final Logger LOG = LoggerFactory.getLogger(BackendController.class);

    @Autowired
    BookOfferSearcher bookOfferSearcher;

    @RequestMapping(path = "/search", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody
    List<Offer> searchForBook (@RequestParam String title) {
        LOG.info("/search called for title: " + title);
        return bookOfferSearcher.findOffers(title);
    }

}
