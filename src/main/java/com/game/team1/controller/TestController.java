package com.game.team1.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin("*")
public class TestController {
	@RequestMapping(value="/test/**", method=RequestMethod.GET) //GetMapping과 같음
	public String test(){
		return "str"; //WEB-INF/test/str.jsp
	}
	
	@RequestMapping(value="/api/list", method=RequestMethod.GET)
	@ResponseBody 
	public List<String> getList(){
		List<String> list=new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		return list;
	}
	
	@GetMapping("api/users")
	@ResponseBody
	public List<Map<String,String>> getUsers(){
		List<Map<String,String>> users=new ArrayList<>();
		
		for(int i=1;i<11;i++) {
			Map<String,String> user=new HashMap<>();
			user.put("name", "홍길동");
			user.put("num", i+"");
			user.put("age", i+"");
			users.add(user);
		}
		return users;
	}
}
