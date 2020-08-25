package pers.dreamer07.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import pers.dreamer07.spring.factorybean.Person;

/**
 * FactoryBean 工厂Bean的使用 - 测试类
 * @author shkstart
 * @create 2020-08-24 17:44
 */
public class FactroyBeanTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean1.xml");
        //配置的是 MyBean 类但可以使用 Person 类的对象来接收
        Person person = context.getBean("myBean", Person.class);
        System.out.println(person);
    }
}
