package com.hr.entity;

import java.sql.Date;

public class Student {
    private int sid;
    private String sname;
    private Date sbirth;

    public Student() {
    }

    public Student(String sname, Date sbirth) {
        this.sname = sname;
        this.sbirth = sbirth;
    }

    public Student(int sid) {
        this.sid = sid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getSbirth() {
        return sbirth;
    }

    public void setSbirth(Date sbirth) {
        this.sbirth = sbirth;
    }
}
