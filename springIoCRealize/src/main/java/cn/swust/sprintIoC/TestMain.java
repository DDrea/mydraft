package cn.swust.sprintIoC;

import cn.swust.sprintIoC.beanFactory.TestBeanFactory;
import cn.swust.sprintIoC.mpperImp.ServiceImp;

public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        for (int i = 0; i < 5; i++) {
            ServiceImp serviceImp = (ServiceImp)TestBeanFactory.getBeans("ServiceImp");
            serviceImp.doSomething();//业务实现
        }
//        ServiceImp sserviceImp = (ServiceImp)Class.forName("cn.swust.sprintIoC.mpperImp.ServiceImp").newInstance();
//        sserviceImp.doSomething();
    }
}
