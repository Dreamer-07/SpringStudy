package pers.dreamer07.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring.service.BookService;
import pers.dreamer07.spring.service.UserService;

import java.applet.AppletContext;

/**
 * 对应service包下的测试
 * @author shkstart
 * @create 2020-08-25 9:24
 */
public class ServiceTest {

    @Test //使用注解的方式完成对象创建
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean1.xml");
        //第一个值为配置bean实例时注解的value值(就是之前xml中bean标签的id属性)
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test //使用注解完成属性注入
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.add();
    }
}
