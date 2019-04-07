package pl.whr.booksearch;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import pl.whr.booksearch.model.Book;
import pl.whr.booksearch.model.Offer;
import pl.whr.booksearch.service.allegro.AllegroRequestInterceptor;
import pl.whr.booksearch.service.itbook.ItBookStorePriceRetriever;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class,
		DataSourceAutoConfiguration.class}
)
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}
