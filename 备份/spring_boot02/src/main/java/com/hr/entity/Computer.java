package com.hr.entity;

import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int cid;
    private String name;

    public Computer() {
    }

    public Computer(int cid, String name) {
        this.cid = cid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
