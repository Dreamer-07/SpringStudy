import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring.aopanno.User;

/**
 * Aop操作(基于AspectJ注解) - 测试类
 * @author shkstart
 * @create 2020-08-26 15:44
 */
public class AopAnnoTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

}
