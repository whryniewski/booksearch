package pl.whr.booksearch.service.allegro.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.web.client.RestTemplate;
import pl.whr.booksearch.service.allegro.AllegroRequestInterceptor;

import java.util.List;

@Configuration
public class AllegroBookPriceRetrieverConfiguration {

    @Bean
    @ConfigurationProperties("allegro")
    protected ClientCredentialsResourceDetails oAuthDetails() {
        return new ClientCredentialsResourceDetails();
    }

    @Bean
    @Qualifier("allegro")
    protected RestTemplate restTemplate() {
        RestTemplate rt = new OAuth2RestTemplate(oAuthDetails());
        rt.setInterceptors(List.of(new AllegroRequestInterceptor()));
        return rt;
    }
}
