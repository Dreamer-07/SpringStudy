package pers.dreamer07.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring.autowire.Emp;

/**
 * 自动装配 - 测试类
 * @author shkstart
 * @create 2020-08-25 7:28
 */
public class AutoWireTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    };
}
