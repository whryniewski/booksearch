package pl.whr.booksearch.service.allegro;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class AllegroRequestInterceptor implements ClientHttpRequestInterceptor {

    private final String headerName = "Accept";
    private final String headerValue = "application/vnd.allegro.public.v1+json";

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().set(headerName, headerValue);
        return execution.execute(request, body);
    }
}