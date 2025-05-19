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
