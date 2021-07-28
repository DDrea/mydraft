package cn.swust.service.imp;

import cn.swust.service.AccountService;

public class AccountServiceImp implements AccountService {
    public AccountServiceImp() {
        System.out.println("正在使用构造函数创建AccountServiceImp");
    }

    public void saveAccount(){
        System.out.println("实现了一些数据相关操作");
    }
}
