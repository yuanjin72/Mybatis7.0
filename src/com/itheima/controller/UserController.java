package com.itheima.controller;

import com.itheima.dao.UserDao;
import com.itheima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    //username get Users
    @RequestMapping(value = "/findUserAll")
    public String findUserAll(Model model)throws Exception{
        UserDao userDao =new UserDao();
        List<User> users =  userDao.findUserAll();
        model.addAttribute("users",users);
        return "/ok.jsp";

    }

}
