package com.example.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.error.CustomError;

@ControllerAdvice
public class ErrorController {
	@ExceptionHandler(CustomError.class)
	public String error(CustomError customError) {
		System.out.println(customError.getMessage());
		return "error";
	}
}
