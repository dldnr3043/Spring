package com.example.myapp;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.myapp.DAO.UserDAO;
import com.example.myapp.VO.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/*.xml" })
public class UserDAOTest {
	@Inject
	private UserDAO dao;

	@Test
	public void testTime() throws Exception {
		System.out.println("현재 시간 : " + dao.getTime());
	}

	/*@Test
	public void testInsertMember() throws Exception {
		UserVO vo = new UserVO();
		vo.setEmail("donguk3043@gmail.com");
		vo.setUserpw("testpw");
		vo.setUsername("testname");
		dao.insertUser(vo);
	}*/
	/*@Test
	public void testreadUser() throws Exception {
		System.out.println(dao.readUser("donguk3043@gmail.com"));
	}*/
	@Test
	public void testreadUserWithPW() throws Exception {
		System.out.println(dao.readUserWithPW("dldnr3043@naver.com", "testpw"));
	}
}
