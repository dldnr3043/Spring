package com.example.myapp.DAO;

import com.example.myapp.VO.UserVO;

public interface UserDAO {
	public String getTime();	// db 현재 시간 체크하는 기능
	public void insertUser(UserVO userVO);	// user table에 insert
	public UserVO readUser(String email) throws Exception;	// email로 user 찾기
	public UserVO readUserWithPW(String email, String userpw) throws Exception; // email && userpw로 user 찾기
}
