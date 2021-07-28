package cn.swust.sprintIoC;

import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesDraft {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.load(ReadPropertiesDraft.class.getClassLoader().getResourceAsStream("cn/swust/sprintIoC/beanFactory/testBeanInfo.properties"));
        System.out.println(pro.get(pro.keys().nextElement()));
    }
}