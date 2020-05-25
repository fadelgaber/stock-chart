package com.stockchart.stockchart;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ApiService {

    private final WebClient webClient;
    
    @Value("${api.key}")
    private String key;

	public ApiService(WebClient.Builder webClientBuilder) {
		this.webClient = webClientBuilder.baseUrl("https://www.alphavantage.co").build();
	}

	public Object get() {
		return this.webClient.get().uri("/query?function=TIME_SERIES_INTRADAY&symbol=IBM&interval=15min&apikey={key}",
				key)
						.retrieve().bodyToMono(Object.class).block();
	}

}