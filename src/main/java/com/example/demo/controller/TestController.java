package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.audit.AuditCustom;
import com.example.demo.error.CustomError;

@Controller
public class TestController {
	
	@GetMapping(value = "/")
	@AuditCustom
	public String index(@RequestParam Map<String, String> map) throws CustomError {
//		throw new CustomError("Hello Spring");
		return "index";
	}

	@GetMapping(value = "/asdf")
	@AuditCustom
	public String index2(@RequestParam Map<String, String> map) throws CustomError {
		throw new CustomError("Hello Spring");
//		return "index";
	}
}
