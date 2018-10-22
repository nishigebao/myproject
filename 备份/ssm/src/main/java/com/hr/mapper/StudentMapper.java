package com.hr.mapper;

import com.hr.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Insert("insert into student values(null,#{sname},#{sbirth})")
    @Options(useGeneratedKeys = true,keyProperty = "sid")
    public int insert(Student stu);
    @Delete("delete from student where sid=#{sid}")
    public int delete(int sid);
    @Update("update student set sname=#{sname},sbirth=#{sbirth} where sid=#{sid}")
    public int update(Student stu);
    @Select("select * from student where sid=#{sid}")
    public Student selectById(int sid);
    @Select("select * from student")
    public List<Student> selectAll();
}
