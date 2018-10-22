package com.hr.mapper;

import com.hr.entity.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    @Select("select * from student")
    List<Student> selectAll();

    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}