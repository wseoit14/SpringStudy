package com.example.demo.audit;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AuditEventListener {
	@EventListener
	public void execute(AuditEvent auditEvent) {
		switch(auditEvent.getCrud().toString()) {
		case "SELECT":
			System.out.println(auditEvent.getCrud());
			break;
		}
	}
}
