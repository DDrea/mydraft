package cn.swust.sprintIoC.mpperImp;

import cn.swust.sprintIoC.mapper.Service;

public class ServiceImp implements Service {
    private int serviceTask = 0;
    @Override
    public void doSomething() {
        serviceTask += 1;
        System.out.println("业务实现："+serviceTask);
    }
}
