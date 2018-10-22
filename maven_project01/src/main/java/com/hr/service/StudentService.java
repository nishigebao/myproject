package com.hr.service;

import com.hr.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAll();

    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
