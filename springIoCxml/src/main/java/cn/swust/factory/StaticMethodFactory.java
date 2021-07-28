package cn.swust.factory;

import cn.swust.dao.AccountDao;
import cn.swust.dao.imp.AccountDaoImp;
import cn.swust.service.AccountService;
import cn.swust.service.imp.AccountServiceImp;

public class StaticMethodFactory {
    public static AccountService getAccountService(){
        return new AccountServiceImp();
    }
    public static AccountDao getAccountDao(){
        return new AccountDaoImp() ;
    }
}
