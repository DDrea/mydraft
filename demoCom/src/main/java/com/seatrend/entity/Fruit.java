package com.seatrend.entity;

import org.springframework.lang.Nullable;

public class Fruit {
    private Integer fid ;
    private String name;
    private Integer price;

    public Fruit() {
    }

    public Fruit(Integer fid, String name, Integer price) {
        this.fid = fid;
        this.name = name;
        this.price = price;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
