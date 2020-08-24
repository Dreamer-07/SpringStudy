package pers.dreamer07.testcode;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring5.code.Book;

/**
 * 通过 xml 的方式注入属性 - 测试类
 * @author shkstart
 * @create 2020-08-22 17:33
 */
public class BookTest {

    @Test
    public void testDI(){
        //1. 使用IOC容器读取配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean2.xml");
        //2. 根据IOC容器读取的配置文件，创建对象
        Book book = context.getBean("book",Book.class);
        //3. 观察控制台的输出
        System.out.println(book);
    }
}
