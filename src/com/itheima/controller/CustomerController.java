package com.itheima.controller;

import com.itheima.po.Customer;
import com.itheima.dao.CustomerDao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CustomerController {

@RequestMapping(value = "/addCustomer")
    public String doAdd(Customer customer) throws Exception{

        CustomerDao  customerDao =new CustomerDao();
        customerDao.addCustomer(customer);
        return  "/index.jsp";
    }

    //shanchu
    @RequestMapping(value="/delCustomer")
    public String delCustomer(Customer customer)throws Exception{
        CustomerDao  customerDao =new CustomerDao();
        customerDao.deleteCustomer(customer);
        return "ok.jsp";
    }

    //uopdate
    @RequestMapping(value="/updateCustomer")
    public String updCustomer(Model model,Customer customer)throws Exception{
        CustomerDao  customerDao =new CustomerDao();
        int row = customerDao.updateCustomer(customer);

        return "ok.jsp";//${msg}

    }
    //id get Customer
    @RequestMapping(value="/findCustomerById")
    public String findCustomerByid(Model modle,Integer id)throws Exception{
        CustomerDao customerDao =new CustomerDao();
        Customer customer =  customerDao.findCustomerById(id);
        modle.addAttribute("customer",customer);
        return "ok.jsp";
    }

    //username get Customers
    @RequestMapping(value = "/findCustomerByName")
    public String findCustomerByName(Model model,String username)throws Exception{
        CustomerDao customerDao =new CustomerDao();
        List<Customer> customers =  customerDao.findCustomerByName(username);
        model.addAttribute("customer",customers);
        return "ok.jsp";

    }

}
