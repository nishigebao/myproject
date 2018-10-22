package com.hr.controller;

import com.hr.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {
    @RequestMapping("/selectById")
    public String selectById(Map<String,Object> map,int id) throws ParseException {
//        Student stu = new Student(
//                1,
//                "张三丰",
//                Date.valueOf("1999-01-01"),
//                new SimpleDateFormat("yyyy-MM-dd").parse("1999-01-01"),
//                "男",
//                new String[]{"学习","游戏","美食"}
//        );
        for(Student stu: list1){
            if(stu.getId()==id){
                map.put("stu",stu);
                break;
            }
        }

        return "/student";
    }

    List<Student> list1;

    @RequestMapping("/selectAll")
    public String selectAll(Map<String,Object> map) throws ParseException {
        List<Student> list = new ArrayList<Student>();
        Student stu1 = new Student(
                1,
                "张三丰",
                Date.valueOf("1999-01-01"),
                new SimpleDateFormat("yyyy-MM-dd").parse("1999-01-01"),
                "男",
                new String[]{"学习","游戏","美食"}
        );
        Student stu2 = new Student(
                2,
                "李世民",
                Date.valueOf("1999-01-01"),
                new SimpleDateFormat("yyyy-MM-dd").parse("1999-01-01"),
                "男",
                new String[]{"学习","游戏"}
        );
        Student stu3 = new Student(
                3,
                "杨贵妃",
                Date.valueOf("1999-01-01"),
                new SimpleDateFormat("yyyy-MM-dd").parse("1999-01-01"),
                "女",
                new String[]{"游戏","美食"}
        );
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        list1 = list;
        map.put("list",list);
        return  "/list";
    }

    @RequestMapping("/preUpdate")
    public String preUpdate(Map<String,Object> map,int id) throws ParseException {
        for(Student stu: list1){
            if(stu.getId()==id){
                map.put("stu",stu);
                break;
            }
        }
        return "/update";
    }

    @RequestMapping("/scope")
    public String scope(HttpServletRequest request, HttpSession session){
        request.setAttribute("name","张学友");
        session.setAttribute("sex","男");
        session.getServletContext().setAttribute("age",30);
        return "/scope";
    }
}
