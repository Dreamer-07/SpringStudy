package pers.dreamer07.testcode;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring5.code.Book;

/**
 * 通过 xml 的方式注入空值和特殊值 - 测试类
 * @author shkstart
 * @create 2020-08-23 11:58
 */
public class BookOtherDataTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean3.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
}
