package com.game.team1.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


//화면으로 가려면 리턴 타입 void, string, modelandview 3개로 가능
@Controller
public class ViewsController {
	@RequestMapping(value="/views/**",method=RequestMethod.GET)
	public void page() {		
	}
	//void 는 url 패턴을 무조건 내가 써서 맞춰야 함
	
	@RequestMapping(value="/test2",method=RequestMethod.GET)
	public String page1() {
		return "views/page1";
	}
	//string은 들어오는 url과 호출하는 url을 다르게 해줄 수 있음 
	
	@RequestMapping(value="/test3",method=RequestMethod.GET)
	public ModelAndView page2() {
		ModelAndView mv=new ModelAndView("views/page2");
		return mv;
	}
	

}
