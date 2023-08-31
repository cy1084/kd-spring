package com.game.team1.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.team1.mapper.UserInfoMapper;
import com.game.team1.vo.UserInfoVO;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoMapper uiMapper;
	
	public List<UserInfoVO> getUserInfos(UserInfoVO user){
		return uiMapper.selectUserInfos(user);
	}
	
	public UserInfoVO getUserInfo(int uiNum){
		return uiMapper.selectUserInfo(uiNum);
	}
	
	public int insertUserInfo(UserInfoVO user){
		return uiMapper.insertUserInfo(user);
	}
	
	public int updateUserInfo(UserInfoVO user){
		return uiMapper.updateUserInfo(user);
	}
	
	public int deleteUserInfo(int uiNum){
		return uiMapper.deleteUserInfo(uiNum);
	}
	
	public UserInfoVO login(UserInfoVO user){
		return uiMapper.selectUserInfoById(user);
	}
	
	
}
