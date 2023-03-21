package com.venky;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Mycontroller {
	@RequestMapping("/")
	public String home() {
		
		return "home";
	}
	@RequestMapping("/req1")
	public String result(@RequestParam int no,ModelMap m) {
		m.put("key1",no);
		//int a=Integer.valueOf(no);
		if(no%2==0) {
			m.put("key2", no+"is even Number");
		}
		else {
			m.put("key2", no+"is odd Number");
		}
		return "result";
	}
}
