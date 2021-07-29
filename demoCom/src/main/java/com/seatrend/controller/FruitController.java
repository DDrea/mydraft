package com.seatrend.controller;

import com.seatrend.entity.Fruit;
import com.seatrend.service.FruitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
//@RestController相当于当前控制类下所有的方法都加上@ResponseBody
public class FruitController {
    @Resource
    FruitService fruitService;
    @RequestMapping("/fruit/{fid}")
    @ResponseBody
    Fruit findById(@PathVariable() Integer fid ){
        return fruitService.findById(fid);
    }
}
