package com.xy.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configBean {//@Configuration -- spring  applicationContext.xmL

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
