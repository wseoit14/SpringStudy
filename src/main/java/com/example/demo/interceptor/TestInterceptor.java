package com.example.demo.interceptor;

import java.util.Arrays;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TestInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle");
		HandlerMethod handlerMethod = (HandlerMethod)handler;
		Class<?> clazz = handlerMethod.getBeanType();
		
		System.out.println("컨트롤러 이름 : "+clazz);
		System.out.println(handlerMethod.getMethod());
		if(handlerMethod.hasMethodAnnotation(GetMapping.class)) {
			System.out.println("GetMapping");
			MethodParameter[] methodParameter = handlerMethod.getMethodParameters();
			System.out.println(methodParameter[0].getParameterType());
		}
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion");
	}

}
