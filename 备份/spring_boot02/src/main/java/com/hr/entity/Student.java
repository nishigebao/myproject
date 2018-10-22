package com.hr.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "student")
public class Student {
    private int id;
    private String name;
    private boolean maryy;
    private Date birth;
    private java.util.Date join;

    private List<String> list;
    private Map<String,Object> map;
    private Computer computer;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maryy=" + maryy +
                ", birth=" + birth +
                ", join=" + join +
                ", list=" + list +
                ", map=" + map +
                ", computer=" + computer +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMaryy() {
        return maryy;
    }

    public void setMaryy(boolean maryy) {
        this.maryy = maryy;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public java.util.Date getJoin() {
        return join;
    }

    public void setJoin(java.util.Date join) {
        this.join = join;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
