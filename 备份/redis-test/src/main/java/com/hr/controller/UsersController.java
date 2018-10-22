package com.hr.controller;

import com.hr.entity.Users;
import com.hr.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService us;
    @RequestMapping("/selectAll")
    public String selectAll(HttpServletRequest request){
        request.setAttribute("list",us.selectAll());
        return "index";
    }

    @RequestMapping("/insert")
    public ModelAndView insert(Users u){
        System.out.println(u);
        int id = us.insert(u);
        System.out.println("id: "+id);
        return new ModelAndView("redirect:selectAll");
    }
}
