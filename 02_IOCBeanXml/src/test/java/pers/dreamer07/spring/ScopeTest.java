package pers.dreamer07.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring.scope.Book;

/**
 * bean 的作用域 - 测试类
 * @author shkstart
 * @create 2020-08-24 19:54
 */
public class ScopeTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean2.xml");
        //实例1
        Book book1 = context.getBean("book", Book.class);
        //实例2
        Book book2 = context.getBean("book", Book.class);
        //查看两个对象的地址是否相同 - false
        System.out.println(book1);
        System.out.println(book2);
    }
}
