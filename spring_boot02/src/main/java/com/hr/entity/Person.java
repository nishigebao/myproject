package com.hr.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "person")
@Component
public class Person {
    private int id;
    private String name;
    private boolean marry;
    private Date birth;
    private java.util.Date join;

    private Dog dog;

    private List<String> list;
    private Map<String,Dog> map;

    //alt+shift+s
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marry=" + marry +
                ", birth=" + birth +
                ", join=" + join +
                ", dog=" + dog +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, Dog> getMap() {
        return map;
    }

    public void setMap(Map<String, Dog> map) {
        this.map = map;
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

    public boolean isMarry() {
        return marry;
    }

    public void setMarry(boolean marry) {
        this.marry = marry;
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

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
