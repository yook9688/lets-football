package com.ky.letsfootball;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/test")
	public String index() {
		return "�ݰ����ϴ� �׽�Ʈ ����!";
	}
	
	@GetMapping("/")
	public String main() {
		return "����ȭ���Դϴ�.";
	}
}
