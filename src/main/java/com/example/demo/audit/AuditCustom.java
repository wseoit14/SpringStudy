package com.example.demo.audit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AuditCustom {
	AuditType type() default AuditType.ADMIN;
	AuditCrud crud() default AuditCrud.SELECT;
}
