package com.itheima.controller;

import com.itheima.po.Customer;
import com.itheima.dao.CustomerDao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CustomerController {


    /*添加信息*/
@RequestMapping(value = "/addCustomer")
    public String doAdd(Model model, Customer customer) throws Exception{

        CustomerDao  customerDao =new CustomerDao();
        customerDao.addCustomer(customer);
        model.addAttribute("msg","以添加！");
        return  "/add.jsp";
    }

    /*删除信息*/
    @RequestMapping(value="/delCustomer")
    public String delCustomer(Model model, Customer customer)throws Exception{
        CustomerDao  customerDao =new CustomerDao();
        customerDao.deleteCustomer(customer);
        model.addAttribute("msg","以删除!");
        return "delete.jsp";
    }

    /*更新信息*/
    @RequestMapping(value="/updateCustomer")
    public String updateCustomer(Model model,Customer customer)throws Exception{
        CustomerDao  customerDao =new CustomerDao();
        customerDao.updateCustomer(customer);
        model.addAttribute("msg","更新成功!");
        return "update.jsp";//${msg}


    }
    /*通过ID查询*/
    @RequestMapping(value="/findCustomerById")
    public String findCustomerByid(Model modle,Integer id)throws Exception{
        CustomerDao customerDao =new CustomerDao();
        Customer customer =  customerDao.findCustomerById(id);
        modle.addAttribute("customer",customer);
        return "index.jsp";
    }
    //通过ID批量查询
   /* @RequestMapping(value="/findCustomerByIds")
    public String findCustomerByid(Model modle,Integer id)throws Exception{
        CustomerDao customerDao =new CustomerDao();
        Customer customer =  customerDao.findCustomerById(id);
        modle.addAttribute("customer",customer);
        return "index.jsp";
    }*/

  /*  //username get Customers
    @RequestMapping(value = "/findCustomerByName")
    public String findCustomerByName(Model model,String username)throws Exception{
        CustomerDao customerDao =new CustomerDao();
        List<Customer> customers =  customerDao.findCustomerByName(username);
        model.addAttribute("customer",customers);
        return "ok.jsp";
    }
*/
    /*通过筛选查询信息*/
    @RequestMapping(value = "/findCustomerByNameOrJobs")
    public String findCustomerByNameOrJobs(Model model,Customer customer)throws Exception{
        CustomerDao customerDao =new CustomerDao();
        List<Customer> customers =  customerDao.findCustomerByNameOrJobs(customer);
        model.addAttribute("customer",customers);
        return "ok.jsp";

    }
   /* 查询所有信息*/
    @RequestMapping(value = "/findCustomerByAll")
    public String findCustomerByAll(Model model,Customer customer)throws Exception{
        CustomerDao customerDao =new CustomerDao();
        List<Customer> customers =  customerDao.findCustomerByAll(customer);
        model.addAttribute("customer",customers);
        return "ok.jsp";

    }

}
