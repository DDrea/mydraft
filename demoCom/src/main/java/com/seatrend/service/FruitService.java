package com.seatrend.service;

import com.seatrend.entity.Fruit;
import com.seatrend.mapper.FruitMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class FruitService {
    @Resource
    FruitMapper fruitMapper;
    public Fruit findById(Integer fid){
        return fruitMapper.findById(fid);
    }
}
