package com.seatrend.entity;

public class FruitOrder {
    private Integer oid;//primary key
    private Integer fid;
    private Integer aid;
    private Integer amount;
    private Integer pricePerKilo;

    public FruitOrder() {
    }
    @Override
    public String toString() {
        return "FruitOrder{" +
                "oid=" + oid +
                ", fid=" + fid +
                ", aid=" + aid +
                ", amount=" + amount +
                ", pricePerKilo=" + pricePerKilo +
                '}';
    }

    public FruitOrder(Integer oid, Integer fid, Integer aid, Integer amount, Integer pricePerKilo) {
        this.oid = oid;
        this.fid = fid;
        this.aid = aid;
        this.amount = amount;
        this.pricePerKilo = pricePerKilo;
    }

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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPricePerKilo() {
        return pricePerKilo;
    }

    public void setPricePerKilo(Integer pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }
}
