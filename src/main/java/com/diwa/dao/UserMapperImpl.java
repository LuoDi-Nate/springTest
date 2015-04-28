//package com.diwa.dao;
//
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.diwa.model.User;
//
//@Component
//public class UserMapperImpl implements UserMapper{
//	@Autowired
//	private SqlSessionFactory sessionFactory;
//	
//	public User findUserById(int id) {
//		SqlSession session = sessionFactory.openSession();
//		User user = (User)session.selectOne("findUserById", id);
//		return user;
//	}
//
//	public User insertUser(User user) {
//		SqlSession sqlSession = sessionFactory.openSession();
//		sqlSession.insert("insertUser", user);
//		return user;
//	}
//	
//}
