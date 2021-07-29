package com.seatrend.controller;

import com.seatrend.entity.Fruit;
import com.seatrend.service.FruitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

//@Controller
@RequestMapping("/fruit/")
@RestController//相当于当前控制类下所有的方法都加上@ResponseBody
public class FruitController {
    @Resource
    FruitService fruitService;

    //听说这是RestFul风格?
    @RequestMapping("/findById/{fid}")
    //@ResponseBody
    Fruit findById(@PathVariable() Integer fid ){
        return fruitService.findById(fid);
    }

    @RequestMapping("/findByName/{name}")
    //@ResponseBody
    List<Fruit> findByName(@PathVariable("name") String name){
        return fruitService.findByName(name);
    }
    //直接在取url上的值作为参数传入方法
    //local host:8080/fruit/addFruit?name=猕猴桃&price=31
    @RequestMapping("/addFruit")
    Fruit addFruit(
            @RequestParam(value = "name")String name,
            @RequestParam(value = "price")Integer price){
        fruitService.addFruit(new Fruit(1, name, price));
        return findByName(name).get(0);
    }
    @RequestMapping("/updateByName")
    Fruit updateByName(@RequestParam("name") String name,@RequestParam("price") Integer price){
        Fruit fruit = new Fruit(name, price);
        fruitService.updateByName(fruit);
        return findByName(name).get(0);
    }
}
