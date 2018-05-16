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
 * ���ų��������
 */
public class CustomerDao {
	/**
	 * ���ݿͻ���Ų�ѯ�ͻ���Ϣ
	 */

	public Customer findCustomerById(Integer id) throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4��SqlSessionִ��ӳ���ļ��ж����SQL��������ӳ����
		Customer customer = sqlSession.selectOne("com.itheima.mapper.CustomerMapper.findCustomerById", id);
		// ��ӡ������
		System.out.println(customer);
		// 5���ر�SqlSession
		sqlSession.close();
		return customer;
	}

	public List<Customer> findCustomerByName(String username) throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4��SqlSessionִ��ӳ���ļ��ж����SQL��������ӳ����
		List<Customer> customers = sqlSession.selectList("com.itheima.mapper.CustomerMapper.findCustomerByName", username);
		// ��ӡ������
		for(Customer c:customers){
			System.out.println(c);
		}
		// 5���ر�SqlSession
		sqlSession.close();
		return customers;
	}

	public void addCustomer(Customer customer) throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4��SqlSessionִ��ӳ���ļ��ж����SQL��������ӳ����
		sqlSession.insert("com.itheima.mapper.CustomerMapper.addCustomer", customer);
		System.out.println(customer.getId());
		sqlSession.commit();
			// 5���ر�SqlSession
		sqlSession.close();
	}

	public void deleteCustomer(Customer customer) throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4��SqlSessionִ��ӳ���ļ��ж����SQL��������ӳ����
		sqlSession.delete("com.itheima.mapper.CustomerMapper.deleteCustomer", customer);
		sqlSession.commit();
		// 5���ر�SqlSession
		sqlSession.close();
	}

	public int updateCustomer(Customer customer) throws Exception {
		SqlSession sqlSession = MybatisUtils.getSession();
		// 4��SqlSessionִ��ӳ���ļ��ж����SQL��������ӳ����
		int row = sqlSession.update("com.itheima.mapper.CustomerMapper.updateCustomer", customer);
		sqlSession.commit();
		// 5���ر�SqlSession
		sqlSession.close();
		return row;
	}

}
