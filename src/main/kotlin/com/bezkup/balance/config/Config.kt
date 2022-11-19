package com.bezkup.balance.config

import org.springdoc.core.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

class Config {
    @Configuration
    class SwaggerConfig {
        @Bean
        fun publicApi(): GroupedOpenApi {
            return GroupedOpenApi.builder()
                .group("apis")
                .pathsToMatch("/*")
                .build()
        }
    }
}