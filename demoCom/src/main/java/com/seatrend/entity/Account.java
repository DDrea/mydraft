package com.seatrend.entity;

public class Account {
    private Integer aid;
    private String name;


    public Account(Integer aid, String name) {
        this.aid = aid;
        this.name = name;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
