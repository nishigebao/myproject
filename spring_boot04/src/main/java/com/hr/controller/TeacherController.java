package com.hr.controller;

import com.hr.entity.Teacher;
import com.hr.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
//@ResponseBody("/teacher")
@RestController
public class TeacherController {
    @Autowired
    private TeacherService ts;

    @RequestMapping("/selectAll")
    public List<Teacher> selectAll(){
        return ts.selectAll();
    }
}
