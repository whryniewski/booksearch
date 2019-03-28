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

	@Bean
	@ConfigurationProperties("allegro")
	protected ClientCredentialsResourceDetails oAuthDetails() {
		return new ClientCredentialsResourceDetails();
	}

	@Bean
	protected RestTemplate restTemplate() {
		RestTemplate rt = new OAuth2RestTemplate(oAuthDetails());
		rt.setInterceptors(List.of(new AllegroRequestInterceptor()));
		return rt;
	}

	@Bean
	@Qualifier("generic")
	protected RestTemplate genericRestTemplate() {
		return new RestTemplate();
	}

}
