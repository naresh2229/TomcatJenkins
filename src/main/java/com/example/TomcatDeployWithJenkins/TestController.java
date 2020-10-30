package com.example.TomcatDeployWithJenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/checking")
	public String hello()
	{
		return "HelloWorld";
	}

}
