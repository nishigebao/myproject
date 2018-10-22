package com.hr.service.impl;

import com.hr.entity.Teacher;
import com.hr.mapper.TeacherMapper;
import com.hr.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherMapper tm;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Teacher> selectAll() {
        return tm.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(Integer tid) {
        return 0;
    }

    @Override
    public int insert(Teacher record) {
        return 0;
    }

    @Override
    public int insertSelective(Teacher record) {
        return 0;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Teacher selectByPrimaryKey(Integer tid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Teacher record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Teacher record) {
        return 0;
    }
}
