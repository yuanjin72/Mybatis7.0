package com.itheima.dao;

import com.itheima.Util.MybatisUtils;
import com.itheima.po.User;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 入门程序测试类
 */
public class UserDao {
	/**
	 * 根据客户编号查询客户信息
	 */

	

	public List<User> findUserAll() throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4、SqlSession执行映射文件中定义的SQL，并返回映射结果
		List<User> users = sqlSession.selectList("com.itheima.mapper.UserMapper.findUserAll");
		// 打印输出结果
		for(User c:users){
			System.out.println(c);
		}
		// 5、关闭SqlSession
		sqlSession.close();
		return users;
	}

	
	

}
