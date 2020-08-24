package pers.dreamer07.testcode;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring5.bean.Emp;
import pers.dreamer07.spring5.service.UserService;

/**
 * 通过 xml 的方式通过两种不同的形式注入bean - 测试类
 * @author shkstart
 * @create 2020-08-24 8:55
 */
public class BeanTest {

    /*注入外部bean*/
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean3.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    /* 注入内部bean */
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    /*级联赋值 - 注入外部bean时，通过外部bean完成对其属性的赋值*/
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp); //Emp{name='Jack', gender='男', dept=Dept{dname='级联赋值1'}}
    }

    /*级联赋值 - 注入外部bean时，在内部完成对其属性的赋值*/
    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp); //Emp{name='Jack', gender='男', dept=Dept{dname='OHHH'}}
    }
}
