package com.example.myapp.DAO;

import com.example.myapp.VO.UserVO;

public interface UserDAO {
	public String getTime();	// db ���� �ð� üũ�ϴ� ���
	public void insertUser(UserVO userVO);	// user table�� insert
	public UserVO readUser(String email) throws Exception;	// email�� user ã��
	public UserVO readUserWithPW(String email, String userpw) throws Exception; // email && userpw�� user ã��
}
