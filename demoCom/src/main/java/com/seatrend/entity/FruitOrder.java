package com.seatrend.entity;

public class FruitOrder {
    private Integer oid;//primary key
    private Integer fid;
    private Integer aid;
    private String amount;
    private Integer pricePerKilo;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Integer getPricePerKilo() {
        return pricePerKilo;
    }

    public void setPricePerKilo(Integer pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }
}
