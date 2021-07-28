package cn.swust.sprintIoC.beanFactory;

import cn.swust.sprintIoC.mapper.Service;
import cn.swust.sprintIoC.mpperImp.ServiceImp;
import javafx.beans.binding.ObjectExpression;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class TestBeanFactory {
    private static Map<String, Object> container;//用一个map来装这些bean

    //实现bean容器
    static{
        try {
            //工厂一次性需要创建的bean的信息
            Properties properties = new Properties();
            //加载配置文件中的内容 bean名字和 他的全限定名称
            //注意，这里要使用配置文件的Path from SourceRoot
            InputStream in = TestBeanFactory.class.getClassLoader().getResourceAsStream("cn/swust/sprintIoC/beanFactory/testBeanInfo.properties");
            //加载到properties中称为key-value形式  名字-全限定名称
            properties.load(in);
            //依次读取，并创建，并放入容器
            Enumeration<Object> keys = properties.keys();
            container = new HashMap<>();
            while (keys.hasMoreElements()) {
                Object objectName = keys.nextElement();
                Object object = Class.forName((String) properties.get(objectName)).newInstance();
                container.put((String) objectName, object);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化错误");
        }

    }

    //使用静态类来实现从容器中取出 bean
    public static Object getBeans(String beanName) {
        return container.getOrDefault(beanName, null);
    }
}
