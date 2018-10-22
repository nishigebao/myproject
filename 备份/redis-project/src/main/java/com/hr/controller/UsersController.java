package com.hr.controller;

import com.hr.entity.Users;
import com.hr.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService us;

    @RequestMapping("/selectAll")
    public String selectAll(HttpServletRequest request){
        List<Users> list = us.selectAll();
        request.setAttribute("list",list);
        return "list";
    }

    @RequestMapping("/login")
    public String login(HttpSession session , String uname, String upass){
        Users u = us.login(uname,upass);
        System.out.println(u);
        if(u!=null){
            session.setAttribute("u",u);
        }
        return "index";
    }
}
