package org.ass.orderservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(value = "org.ass.orderservice")
public class AppConfiguration {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
