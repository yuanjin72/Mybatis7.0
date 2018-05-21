package com.itheima.controller;

import com.itheima.po.Customer;
import com.itheima.dao.CustomerDao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CustomerController {


    /*�����Ϣ*/
@RequestMapping(value = "/addCustomer")
    public String doAdd(Model model, Customer customer) throws Exception{

        CustomerDao  customerDao =new CustomerDao();
        customerDao.addCustomer(customer);
        model.addAttribute("msg","����ӣ�");
        return  "/add.jsp";
    }

    /*ɾ����Ϣ*/
    @RequestMapping(value="/delCustomer")
    public String delCustomer(Model model, Customer customer)throws Exception{
        CustomerDao  customerDao =new CustomerDao();
        customerDao.deleteCustomer(customer);
        model.addAttribute("msg","��ɾ��!");
        return "delete.jsp";
    }

    /*������Ϣ*/
    @RequestMapping(value="/updateCustomer")
    public String updateCustomer(Model model,Customer customer)throws Exception{
        CustomerDao  customerDao =new CustomerDao();
        customerDao.updateCustomer(customer);
        model.addAttribute("msg","���³ɹ�!");
        return "update.jsp";//${msg}


    }
    /*ͨ��ID��ѯ*/
    @RequestMapping(value="/findCustomerById")
    public String findCustomerByid(Model modle,Integer id)throws Exception{
        CustomerDao customerDao =new CustomerDao();
        Customer customer =  customerDao.findCustomerById(id);
        modle.addAttribute("customer",customer);
        return "index.jsp";
    }
    //ͨ��ID������ѯ
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
    /*ͨ��ɸѡ��ѯ��Ϣ*/
    @RequestMapping(value = "/findCustomerByNameOrJobs")
    public String findCustomerByNameOrJobs(Model model,Customer customer)throws Exception{
        CustomerDao customerDao =new CustomerDao();
        List<Customer> customers =  customerDao.findCustomerByNameOrJobs(customer);
        model.addAttribute("customer",customers);
        return "ok.jsp";

    }
   /* ��ѯ������Ϣ*/
    @RequestMapping(value = "/findCustomerByAll")
    public String findCustomerByAll(Model model,Customer customer)throws Exception{
        CustomerDao customerDao =new CustomerDao();
        List<Customer> customers =  customerDao.findCustomerByAll(customer);
        model.addAttribute("customer",customers);
        return "ok.jsp";

    }

}
