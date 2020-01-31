package com.palace.bowling_prj.service;

import javax.servlet.http.HttpServletResponse;

import com.palace.bowling_prj_dto.UserDTO;

public interface UserService {
	
	public void userJoin(UserDTO uDto) throws Exception;
	public UserDTO loadUser(String getaId) throws Exception;
	public void updatePw(HttpServletResponse response, UserDTO uDto) throws Exception;
	public void changeUserPw(String encode, String userId) throws Exception;
}