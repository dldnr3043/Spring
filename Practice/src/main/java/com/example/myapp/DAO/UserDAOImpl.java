package com.example.myapp.DAO;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.myapp.VO.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.example.myapp.userMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getTime");
	}
	@Override
	public void insertUser(UserVO userVO) {
		sqlSession.insert(namespace + ".insertUser", userVO);
	}
	@Override
	public UserVO readUser(String email) throws Exception {
		return sqlSession.selectOne(namespace + ".readUser", email);
	}
	@Override
	public UserVO readUserWithPW(String email, String userpw) throws Exception {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("email", email);
		parameter.put("userpw", userpw);
		
		return sqlSession.selectOne(namespace + ".readUserWithPW", parameter);
	}
}
