# Spring Study
- Filter
	- extends Filter (jakarta.Filter)
	- @WebFilter("/") param : path
	- SpringBootApplication.java -> @ServletComponentScan 등록 -> 그래야 필터 사용 가능

---


- Interceptor
	- implements HandlerInterceptor	
	- override 구현 
	
	- preHandle			: 컨트롤러 진입 전
	
	- postHandle			: 컨트롤러 진입 후 뷰 랜더링 작업 전 ※ ExceptionHandler 구현 시 postHandle 사용 불가
	
	- afterCompletion	: 뷰 랜더링 이후 작업


-----


- Listener
	- implements ServletContextListener
	- 첫 애플리케이션 구동 시 동작

	
---


- CustomInterface
	- AuditType		: Admin,User 구분
	- AuditCrud		: SELECT, UPDATE, INSERT, DELETE 구분
	- AuditEvent		: ApplicationEvent 상속 받은 클래스로 이후 publisher 인자 값으로 활용(무조건 ApplicationEvent를 상속받은 클래스 여야 한다.)
	- AuditCustom
		- @Interface 사용
		- @Retention(RetentionPolicy.RUNTIME) : 런타임 시 동작
		- @Target(ElementType.METHOD) 			 : 메서드에서 처리
		
	- AuditEventPublisher
		- ApplicationEventPublisher를 주입받아 publishEvent 호출로 인자값에 ApplicationEvent를 상속받은 클래스 적용
		- @Component 적용 : 스프링에서 AOP를 동작하므로 빈으로 등록되어야 한다.
		- @Aspect 적용
		
	- ApplicationEventListener
		- @Component 사용
		- @EventListenr 사용, 메서드의 인자값으로 ApplicationEvent를 상속받은 클래스를 적어야 한다.
		
	- Controller 적용
		- @AuditCustom 적용
		
	- 동작 순서
		- Controller -> ApplicationEventPublisher(Spring AOP) -> ApplicationEventListener