package com.stockchart.stockchart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@SpringBootApplication
public class StockChartApplication {

	@Autowired
	private ApiService caller;
	
	@GetMapping("/data")
	public Object getData(){
		//return key;
		return caller.get();
	}
	public static void main(String[] args) {
		SpringApplication.run(StockChartApplication.class, args);
	}

}
