package com.game.team1.mapper;

import java.util.List;
import java.util.Map;

import com.game.team1.vo.UserInfoVO;

public interface UserInfoMapper {
	List<UserInfoVO> selectUserInfos(UserInfoVO user);

	UserInfoVO selectUserInfo(int uiNum);

	int insertUserInfo(UserInfoVO user);

	int updateUserInfo(UserInfoVO user);

	int deleteUserInfo(int uiNum);
	
	UserInfoVO selectUserInfoById(UserInfoVO user);

}
