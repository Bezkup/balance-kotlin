package com.bezkup.balance

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.filter.CorsFilter

@SpringBootApplication
class BalanceApplication{
	@Bean
	fun corsFilter(): CorsFilter {
		val source = UrlBasedCorsConfigurationSource()
		val config = CorsConfiguration()
		config.allowedOrigins = listOf("*")
		config.allowedHeaders = listOf("Origin", "Content-Type", "Accept")
		config.allowedMethods = listOf("GET", "POST", "PUT", "DELETE", "OPTIONS")
		source.registerCorsConfiguration("/**", config)
		return CorsFilter(source)
	}
}

fun main(args: Array<String>) {
	runApplication<BalanceApplication>(*args)
}



