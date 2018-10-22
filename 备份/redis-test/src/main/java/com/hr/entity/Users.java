package com.hr.entity;

import java.io.Serializable;
import java.sql.Date;

public class Users implements Serializable{

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", ubirth=" + ubirth +
                '}';
    }

    private Integer uid;

    private String uname;

    private String upass;

    private Date ubirth;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass == null ? null : upass.trim();
    }

    public Date getUbirth() {
        return ubirth;
    }

    public void setUbirth(Date ubirth) {
        this.ubirth = ubirth;
    }
}