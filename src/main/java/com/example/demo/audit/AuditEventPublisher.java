package com.example.demo.audit;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Aspect
public class AuditEventPublisher {
	private final ApplicationEventPublisher applicationEventPublisher;
	
	@After("@annotation(auditCustom)")
	public void publish(JoinPoint joinPoint, AuditCustom custom) {
		applicationEventPublisher.publishEvent(new AuditEvent(applicationEventPublisher, custom.type(), custom.crud()));
	}
}
