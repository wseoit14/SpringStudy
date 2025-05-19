package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ImportResource(locations = "/config/mybatis-config.xml")
@ServletComponentScan
public class Example3Application {

	public static void main(String[] args) {
		SpringApplication.run(Example3Application.class, args);
	}

}
