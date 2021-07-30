package com.seatrend.service;

import com.seatrend.entity.Account;
import com.seatrend.mapper.AccountMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@Service
public class AccountService {
    @Resource
    AccountMapper accountMapper;
    public void addAccount(Account account){
        accountMapper.addAccount(account);
    }
    public List<Account> findAccountByName(String name) throws SQLException {
        return accountMapper.findAccountByName(name);
    }
}
