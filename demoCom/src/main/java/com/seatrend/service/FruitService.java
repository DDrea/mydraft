package com.seatrend.service;

import com.seatrend.entity.Fruit;
import com.seatrend.mapper.FruitMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FruitService {
    @Resource
    FruitMapper fruitMapper;
    public Fruit findById(Integer fid){
        return fruitMapper.findById(fid);
    }

    public void addFruit(Fruit fruit){
        fruitMapper.addFruit(fruit);
    }
    public List<Fruit> findByName(String name) {
        return  fruitMapper.findByName(name);
    }
    public void updateByName(Fruit fruit){
        fruitMapper.updateByName(fruit);
    }
}
