package pl.whr.booksearch.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientConfiguration {
    @Bean
    @Qualifier("generic")
    protected RestTemplate genericRestTemplate() {
        return new RestTemplate();
    }
}
