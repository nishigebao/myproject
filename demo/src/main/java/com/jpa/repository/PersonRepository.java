package com.jpa.repository;

import com.jpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Integer>{
    @Query("select p from Person p where p.pid=?1 and p.pname=?2")
    public List<Person> findDynamic(int id,String name);

    @Query("select p from Person p where p.pid=:sid and p.pname=:sname")
    public List<Person> findDynamic2(@Param("sid") int id, @Param("sname") String name);
}
