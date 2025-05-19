package com.example.demo.audit;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;
@Getter
public class AuditEvent extends ApplicationEvent{
	private AuditType type;
	private AuditCrud crud;
	public AuditEvent(Object source, AuditType type, AuditCrud crud) {
		super(source);
		this.type = type;
		this.crud = crud;
	}

}
