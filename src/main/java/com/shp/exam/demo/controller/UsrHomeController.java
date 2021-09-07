package com.shp.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {
	// 전역변수로 하면 객체 죽기 전까지 살아있음
	private int count;
	
	// 초기화
	public UsrHomeController() {
		count = -1;
	}
		
	@RequestMapping("/usr/home/getCount")
	@ResponseBody
	public int getCount() {
		return count;
	}
	
	@RequestMapping("/usr/home/doSetCount")
	@ResponseBody
	public String doSetCount(int count) {
		this.count = count;
		return "count의 값이" + this.count + "(으)로 초기화 되었습니다.";
	}
}
