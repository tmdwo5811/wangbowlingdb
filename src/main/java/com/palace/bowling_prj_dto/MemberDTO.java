package com.palace.bowling_prj_dto;

public class MemberDTO {
	String userId;
	String userPw;
	String userEmail;
	String memName;
	int memNo;
	
	public MemberDTO(String userId,String userPw, String userEmail, String memName, int memNo) {
		// TODO Auto-generated constructor stub
		this.userId=userId;
		this.userPw=userPw;
		this.userEmail=userEmail;
		this.memName=memName;
		this.memNo=memNo;
	}
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public String getUserEmail() {
		return userEmail;
	}

	public String getMemName() {
		return memName;
	}
	
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	
}
