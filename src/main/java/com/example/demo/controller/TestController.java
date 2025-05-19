package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.audit.AuditCustom;

@Controller
public class TestController {
	
	@GetMapping(value = "/")
	@AuditCustom
	public String index() {
		return "index";
	}
}
