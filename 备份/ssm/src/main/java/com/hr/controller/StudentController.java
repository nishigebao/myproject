package com.hr.controller;

import com.hr.entity.Student;
import com.hr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService ss;

    @RequestMapping("/selectAll")
    public String selectAll(/*HttpServletRequest request,*/ Map<String,Object> map){
        List<Student> list = ss.selectAll();
        //request.setAttribute("list",list);
        map.put("list",list);
        return "list";
    }

    @RequestMapping("/selectById")
    public String selectById(Map<String,Object> map,int sid){
        Student stu = ss.selectById(sid);
        map.put("stu",stu);
        return "student";
    }

    @RequestMapping("/insert")
    public ModelAndView insert(Student stu){
        ss.insert(stu);
        return new ModelAndView("redirect:selectAll");
    }

    @RequestMapping("/delete")
    public ModelAndView delete(int sid){
        ss.delete(sid);
        return new ModelAndView("redirect:selectAll");
    }

    @RequestMapping("/update")
    public ModelAndView update(Student stu){
        ss.update(stu);
        return new ModelAndView("redirect:selectAll");
    }

}
