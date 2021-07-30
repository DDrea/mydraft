package com.seatrend.service;

import com.seatrend.entity.FruitOrder;
import com.seatrend.mapper.FruitOrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@Service
public class FruitOrderService {
    @Resource
    FruitOrderMapper fruitOrderMapper;

    public void addFruitOrder(FruitOrder  fruitOrder)throws SQLException {
        fruitOrderMapper.addFruitOrder(fruitOrder);
    }
    public void deleteFruitOrderByOid(Integer oid){
        fruitOrderMapper.deleteFruitOrderByOid(oid);
    }

    public void updateFruitOrderByOid(FruitOrder fruitOrder){
        fruitOrderMapper.updateFruitOrderByOid(fruitOrder);
    }
    public FruitOrder findByOid(Integer oid){
        return fruitOrderMapper.findByOid(oid);
    }
    public List<FruitOrder> findByFid(Integer fid) {
        return fruitOrderMapper.findByFid(fid);
    }
    public List<FruitOrder> findByAid(Integer aid) {
        return fruitOrderMapper.findByAid(aid);

    }
    public List<FruitOrder> findByAmount(Integer amount){
        return fruitOrderMapper.findByAmount(amount);
    }
}
