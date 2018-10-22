package com.hr.entity;

public class Dog {
    private int did;
    private String dname;

    @Override
    public String toString() {
        return "Dog{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
