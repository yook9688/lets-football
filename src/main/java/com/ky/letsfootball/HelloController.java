package com.ky.letsfootball;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/test")
	public String index() {
		return "반갑습니다 테스트 성공!";
	}
	
	@GetMapping("/")
	public String main() {
		return "메인화면입니다.";
	}
}
