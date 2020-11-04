package com.example.myapp.VO;

import java.sql.Date;

public class UserVO {
	private String email;
	private String userpw;
	private String username;
	private Date regDate;		// 등록 날짜
	private Date updatedDate;	// 갱신 날짜
	
	public UserVO() {}
	
	public UserVO(String email, String userpw, String username, Date regDate, Date updatedDate) {
		super();
		this.email = email;
		this.userpw = userpw;
		this.username = username;
		this.regDate = regDate;
		this.updatedDate = updatedDate;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "UserVO [email=" + email + ", userpw=" + userpw + ", username=" + username + ", regDate=" + regDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
}
