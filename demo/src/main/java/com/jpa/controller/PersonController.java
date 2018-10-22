package com.jpa.controller;

import com.jpa.entity.Person;
import com.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository pr;

    @RequestMapping("/findAll")
    public List<Person> findAll(){
//        return pr.findAll();
        return pr.findDynamic2(1,"张三");
    }

    @RequestMapping("/save")
    public void save() throws ParseException {
        Person p = new Person();
        p.setPid(1);
        p.setPname("张三");
        p.setBirth(Date.valueOf("1999-01-01"));
        p.setJoin_time(new SimpleDateFormat("yyyy-MM-dd").parse("1999-01-01"));
        pr.save(p);
    }
}
