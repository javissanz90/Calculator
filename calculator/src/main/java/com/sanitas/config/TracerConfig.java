package com.sanitas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.corp.calculator.TracerImpl;

@Configuration
public class TracerConfig {

	/**
     * Tracer bean
     * @return Tracer implementation
     *
     */
	@Bean
	public TracerImpl tracerAPI() {
		return new TracerImpl();
	}
}
