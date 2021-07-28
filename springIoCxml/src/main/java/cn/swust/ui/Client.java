package cn.swust.ui;

import cn.swust.dao.AccountDao;
import cn.swust.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//模拟表现层，用于调用业务层
public class Client {

    /*
    * 获取spring的IoC核心容器，并根据id获取对象
    *
    * ApplicationContext的三个常用实现类
    *   ClassPathXmlApplicationContext：它可以加载类路径下的配置文件，读取其中的内容，来创建对象
    *   FileSystemApplicationContext：   它可以加载磁盘任意路径下的配置文件（必须有访问权限）
    *   AnnotationConfigApplicationContext：它是读取注解 创建容器的
    *
    * 核心容器引发的两个问题：延迟加载/立即加载
    *   ApplicationContext创建核心容器是，时使用的立即加载方式，在读取到配置文件后，就马上把对象创建出来了
    *   BeanFactory创建核心容器时，采用的延迟加载方式，在根据id获取对象的时候，才创建真正的对象
    *
    *
    * */
    public static void main(String[] args) {
        /*
        * ApplicationContext立即加载方式
        * */
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("J:\\allpro\\springIoC\\src\\main\\resources\\beans.xml");
        AccountDao accountDao = (AccountDao)context.getBean("accountDao");
        AccountService accountService = (AccountService)context.getBean("accountService");
        AccountDao accountDao2 = (AccountDao)context.getBean("accountDao");
        AccountService accountService2 = (AccountService)context.getBean("accountService");
        System.out.println("得到的accountService对象（他的实现类）是："+accountService);
        System.out.println("得到的accountService2对象（他的实现类）是："+accountService2);
        System.out.println("得到的accountDao对象（他的实现类）是："+accountDao);
        System.out.println("得到的accountDao2对象（他的实现类）是："+accountDao2);

        /*
        * BeanFactory延迟加载方式
        * */

        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        AccountService accountService1 = (AccountService)factory.getBean("accountService");
        System.out.println("使用beanFactory创建的："+accountService1);


    }
}
