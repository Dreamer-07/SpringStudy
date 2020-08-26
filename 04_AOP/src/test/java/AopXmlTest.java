import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring.aopxml.Book;

/**
 * Aop操作(基于xml) - 测试类
 * @author shkstart
 * @create 2020-08-26 16:40
 */
public class AopXmlTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
