package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. Bootstraping class: 스프링 어플리케이션의 부트스트래핑 역할 
 * 2. 설정 클래스 역할: Configuration Class
 */
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/**
		 * SpringApplication.run(...)안에서 일어나는 일.
		 * 
		 * 1. Application Context, Spring Container 생성 작업.
		 * 2. Annotation Scanning(Component Scanning) + Configuration Class 통한
		 * 	  빈 생성, 등록 와이어링 작업.
		 * 3. 만약, WebApplication이라면 WebApplication 타입을 결정(Spring MVC, Reactive)
		 * 4. 만약, WebApplication이고 타입이 SpringMVC이면
		 * 	  - 내장(embeded) 서버(TomcatEmbededServiceServletContainer) 인스턴스 생성
		 * 	  - 서버 인스턴스 WebApplication 배포
		 * 	  - 서버 인스턴스 스타트
		 * 5. ApplicationRunner 인터페이스를 구현한 빈을 Application Context에서 찾아서 실행.   
		 */
		SpringApplication.run(HelloWorldApplication.class, args);

	}

}
