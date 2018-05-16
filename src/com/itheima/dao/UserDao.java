package com.itheima.dao;

import com.itheima.Util.MybatisUtils;
import com.itheima.po.User;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * ���ų��������
 */
public class UserDao {
	/**
	 * ���ݿͻ���Ų�ѯ�ͻ���Ϣ
	 */

	

	public List<User> findUserAll() throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4��SqlSessionִ��ӳ���ļ��ж����SQL��������ӳ����
		List<User> users = sqlSession.selectList("com.itheima.mapper.UserMapper.findUserAll");
		// ��ӡ������
		for(User c:users){
			System.out.println(c);
		}
		// 5���ر�SqlSession
		sqlSession.close();
		return users;
	}

	
	

}
