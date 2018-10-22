package com.hr.service.impl;

import com.hr.entity.Student;
import com.hr.mapper.StudentMapper;
import com.hr.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ss1")
@Transactional(propagation = Propagation.REQUIRED)
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper sm;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Student> selectAll() {
        return sm.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return sm.deleteByPrimaryKey(sid);
    }

    @Override
    public int insert(Student record) {
        return sm.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return 0;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Student selectByPrimaryKey(Integer sid) {
        return sm.selectByPrimaryKey(sid);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return sm.updateByPrimaryKey(record);
    }
}
