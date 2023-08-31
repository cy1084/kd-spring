package com.game.team1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.team1.service.UserInfoService;
import com.game.team1.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin("*")
@Slf4j
public class UserInfoController {
	@Autowired
	private UserInfoService uiService;
	
	@GetMapping("/user-infos")
	public List<UserInfoVO> getUserInfos(UserInfoVO user){
		return uiService.getUserInfos(user);
		//uiNum으로 검색되지만 한 개가 검색돼도 복수
	}
	
	@GetMapping("/user-infos/{uiNum}")
	public UserInfoVO getUserInfo(@PathVariable int uiNum) {
		return uiService.getUserInfo(uiNum);
		//uiNum으로 검색되지만 단수, 무조건 1개 이하
	}
	
	@PostMapping("/user-infos")
	public int insertUserInfo(UserInfoVO user) {
		return uiService.insertUserInfo(user);
	}
	
	@PutMapping("/user-infos")
	public int updateUserInfo(UserInfoVO user) {
		return uiService.updateUserInfo(user);
	}
	
	@DeleteMapping("/user-infos")
	public int deleteUserInfo(@PathVariable int uiNum) {
		return uiService.deleteUserInfo(uiNum);
	}
	
	@PostMapping("/login")
	public UserInfoVO login(UserInfoVO user) {
		return uiService.login(user);
	}
}
