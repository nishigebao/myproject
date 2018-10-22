package com.hr.controller;

import com.hr.entity.Student;
import com.hr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    @Qualifier("ss1")
    private StudentService ss;

    @RequestMapping("/selectAll")
    public String selectAll(ModelMap map){
       List<Student> list = ss.selectAll();
       map.put("list",list);
       return "/index.jsp";
    }
}
