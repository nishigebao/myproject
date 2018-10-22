package com.hr.entity;

import java.sql.Date;

public class Student {
    private int id;
    private String name;
    private Date birth;
    private java.util.Date join;
    private String sex;
    private String[] hobby;

    public Student() {
    }

    public Student(String name, Date birth, java.util.Date join, String sex, String[] hobby) {
        this.name = name;
        this.birth = birth;
        this.join = join;
        this.sex = sex;
        this.hobby = hobby;
    }

    public Student(int id, String name, Date birth, java.util.Date join, String sex, String[] hobby) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.join = join;
        this.sex = sex;
        this.hobby = hobby;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
}
