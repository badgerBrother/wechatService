package com.badgerBrother.wechatService.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {
    @Value("${rest.ReadTimeout}")
    private int readTimeout;
    @Value("${rest.ConnectTimeout}")
    private int connectionTimeout;
	@Bean
	public SimpleClientHttpRequestFactory httpClientFactory() {
	       SimpleClientHttpRequestFactory httpRequestFactory = new SimpleClientHttpRequestFactory();
	       httpRequestFactory.setReadTimeout(readTimeout);
	       httpRequestFactory.setConnectTimeout(connectionTimeout);
	       return httpRequestFactory;
	}
	 
     @Bean
     public RestTemplate restTemplate(SimpleClientHttpRequestFactory httpClientFactory) {
         RestTemplate restTemplate = new RestTemplate(httpClientFactory);
         return restTemplate;
	  }
}
