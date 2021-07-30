package com.seatrend.controller;

import com.seatrend.entity.FruitOrder;
import com.seatrend.service.FruitOrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/fruitOrder/")
public class FruitOrderController {
    @Resource
    FruitOrderService fruitOrderService;

    @RequestMapping("/deleteFruitOrderByOid/{oid}")
    String deleteFruitOrderByOid(@PathVariable("oid") Integer oid){
        fruitOrderService.deleteFruitOrderByOid(oid);
        return "success";
    }
    @RequestMapping("updateFruitOrderByOid")
    String updateFruitOrderByOid(@RequestParam(value = "oid") Integer oid,
                                 @RequestParam(value = "aid", required = false) Integer aid,
                                 @RequestParam(value = "fid", required = false) Integer fid,
                                 @RequestParam(value = "amount", required = false) Integer amount,
                                 @RequestParam(value = "pricePerKilo", required = false) Integer pricePerKilo){
        FruitOrder fruitOrder = new FruitOrder();
        fruitOrder.setPricePerKilo(pricePerKilo);
        fruitOrder.setAmount(amount);
        fruitOrder.setAid(aid);
        fruitOrder.setOid(oid);
        fruitOrder.setFid(fid);
        System.out.println(fruitOrder);
        fruitOrderService.updateFruitOrderByOid(fruitOrder);
        return "updateFruitOrderByOid success!";
    }
    @RequestMapping("findByOid/{oid}")
    FruitOrder findByOid(@PathVariable("oid") Integer oid){
        return fruitOrderService.findByOid(oid);
    }
    @RequestMapping("findByFid/{fid}")
    List<FruitOrder> findByFid(@PathVariable("fid")Integer fid) {
        return fruitOrderService.findByFid(fid);
    }
    @RequestMapping("findByAid/{aid}")
    List<FruitOrder> findByAid(@PathVariable("aid")Integer aid) {
        return fruitOrderService.findByAid(aid);
    }
    @RequestMapping("findByAmount/{amount}")
    List<FruitOrder> findByAmount(@PathVariable("amount")Integer amount){
        return fruitOrderService.findByAmount(amount);
    }
    @RequestMapping("/addFruitOrder")
    String addFruitOrder(
                         @RequestParam("aid") Integer aid,
                         @RequestParam("fid") Integer fid,
                         @RequestParam("amount") Integer amount,
                         @RequestParam("pricePerKilo") Integer pricePerKilo){
        FruitOrder fruitOrder = new FruitOrder();
        fruitOrder.setAid(aid);
        fruitOrder.setFid(fid);
        fruitOrder.setAmount(amount);
        fruitOrder.setPricePerKilo(pricePerKilo);
        try{
            fruitOrderService.addFruitOrder(fruitOrder);
        }catch (SQLException e){
            System.out.println("出现问题咯:"+e);
        }
        return "success!";
    }
}
