package com.seatrend.mapper;

import com.seatrend.entity.Account;
import java.sql.SQLException;
import java.util.List;

public interface AccountMapper {
    void addAccount(Account account);
    List<Account> findAccountByName(String name)throws SQLException;
    void findById();
    void deleteByName();
    void deleteById();
}
