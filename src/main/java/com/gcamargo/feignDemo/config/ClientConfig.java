package com.gcamargo.feignDemo.config;

import com.gcamargo.feignDemo.config.client.CustomErrorDecoder;
import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@Configuration
public class ClientConfig {

    @Bean
    public ErrorDecoder errorDecoder(){
        return new CustomErrorDecoder();
    }

    @Bean
    public RequestInterceptor requestInterceptor(){
        return requestTemplate -> {
            requestTemplate.header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        };
    }
}
