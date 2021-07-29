package com.seatrend.mapper;

import com.seatrend.entity.Fruit;

import java.util.List;

public interface FruitMapper {
    void addFruit(Fruit fruit);
    void deleteById(Integer fid);
    void deleteByName(String name);
    void updateById(Fruit fruit);
    void updateByName(Fruit fruit);
    Fruit findById(Integer fid);
    List<Fruit> FindByName(String name);
}
