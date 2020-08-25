package pers.dreamer07.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.dreamer07.spring.config.SpringConfig;
import pers.dreamer07.spring.service.BookService;
import pers.dreamer07.spring.service.UserService;

/**
 * 完全注解开发 - 测试类
 * @author shkstart
 * @create 2020-08-25 11:08
 */
public class ConfigTest {
    @Test
    public void test(){
        //加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.add();
    }
}
