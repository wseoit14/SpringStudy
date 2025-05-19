package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.filter.TestFilter;

import jakarta.servlet.Filter;

@Configuration
public class FilterConfig {
	@Bean
	FilterRegistrationBean<Filter> filterRegistrationBean(){
		FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
		bean.setFilter(new TestFilter());
		bean.addUrlPatterns("/");
		return bean;
	}
}
