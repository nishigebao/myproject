package com.hr.service;

import com.hr.entity.Student;

import java.util.List;

public interface StudentService {
    public int insert(Student stu);
    public int delete(int sid);
    public int update(Student stu);
    public Student selectById(int sid);
    public List<Student> selectAll();
}
