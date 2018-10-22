package com.hr.service.impl;

import com.hr.entity.Student;
import com.hr.mapper.StudentMapper;
import com.hr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper sm;

    @Override
    public int insert(Student stu) {
        sm.insert(stu);
        return stu.getSid();
    }

    @Override
    public int delete(int sid) {
        return sm.delete(sid);
    }

    @Override
    public int update(Student stu) {
        return sm.update(stu);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Student selectById(int sid) {
        return sm.selectById(sid);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Student> selectAll() {
        return sm.selectAll();
    }
}
