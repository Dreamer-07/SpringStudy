package pers.dreamer07.testcode;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring5.coll_map.Book;
import pers.dreamer07.spring5.coll_map.Stu;

/**
 * 通过 xml 的方式注入集合属性 - 测试类
 * @author shkstart
 * @create 2020-08-24 10:41
 */
public class CollMapTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean4.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }

    @Test
    // 特殊2 - 将list集合注入提取出来
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean4.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
}
