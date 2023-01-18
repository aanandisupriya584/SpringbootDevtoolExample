package com.springDevTools;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		int a=98;
		int b=67;
		
		return "test: "+(a+b);
	

}
}
