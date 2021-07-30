package com.seatrend.mapper;

import com.seatrend.entity.FruitOrder;

import java.sql.SQLException;
import java.util.List;

public interface FruitOrderMapper {
    void addFruitOrder(FruitOrder fruitOrder)throws SQLException;
    void deleteFruitOrderByOid(Integer oid);
    void updateFruitOrderByOid(FruitOrder fruitOrder);
    FruitOrder findByOid(Integer oid);
    List<FruitOrder> findByFid(Integer fid);
    List<FruitOrder> findByAid(Integer aid);
    List<FruitOrder> findByAmount(Integer amount);
}
