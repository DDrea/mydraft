package com.seatrend.controller;

import com.seatrend.entity.Account;
import com.seatrend.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/account/")
public class AccountController {
    @Resource
    AccountService accountService;

    @RequestMapping("/findAccountByName")
    public List<Account> findAccountByName(@RequestParam String name){
        List<Account> accounts = null;
        try{
            accounts= accountService.findAccountByName(name);
        }catch(SQLException e){
            System.out.println("嘀嘀嘀嘀嘀嘀 sql问题");
        }
        return accounts;
    }
    @RequestMapping("/addAccount")
    public Account addAccount(@RequestParam("aid") Integer aid,
                              @RequestParam("name") String name) throws SQLException {
        Account account = new Account(aid, name);
        accountService.addAccount(account);
        return accountService.findAccountByName(name).get(0);
    }

}
