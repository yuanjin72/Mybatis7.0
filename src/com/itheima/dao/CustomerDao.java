package com.itheima.dao;
import java.io.InputStream;
import java.util.List;

import com.itheima.Util.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.itheima.po.Customer;
/**
 * 入门程序测试类
 */
public class CustomerDao {
	/**
	 * 根据客户编号查询客户信息
	 */

	public Customer findCustomerById(Integer id) throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4、SqlSession执行映射文件中定义的SQL，并返回映射结果
		Customer customer = sqlSession.selectOne("com.itheima.mapper.CustomerMapper.findCustomerById", id);
		// 打印输出结果
		System.out.println(customer);
		// 5、关闭SqlSession
		sqlSession.close();
		return customer;
	}

	public List<Customer> findCustomerByName(String username) throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4、SqlSession执行映射文件中定义的SQL，并返回映射结果
		List<Customer> customers = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findCustomerByName", username);
		// 打印输出结果
		for(Customer c:customers){
			System.out.println(c);
		}
		// 5、关闭SqlSession
		sqlSession.close();
		return customers;
	}

	public void addCustomer(Customer customer) throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4、SqlSession执行映射文件中定义的SQL，并返回映射结果
		sqlSession.insert("com.itheima.mapper.CustomerMapper.addCustomer", customer);
		System.out.println(customer.getId());
		sqlSession.commit();
			// 5、关闭SqlSession
		sqlSession.close();
	}

	public void deleteCustomer(Customer customer) throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4、SqlSession执行映射文件中定义的SQL，并返回映射结果
		sqlSession.delete("com.itheima.mapper.CustomerMapper.deleteCustomer", customer);
		sqlSession.commit();
		// 5、关闭SqlSession
		sqlSession.close();
	}

	public int updateCustomer(Customer customer) throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4、SqlSession执行映射文件中定义的SQL，并返回映射结果
		int row = sqlSession.update("com.itheima.mapper.CustomerMapper.updateCustomer", customer);
		sqlSession.commit();
		// 5、关闭SqlSession
		sqlSession.close();
		return row;
	}

}
