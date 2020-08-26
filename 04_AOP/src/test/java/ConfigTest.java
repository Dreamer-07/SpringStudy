import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.dreamer07.spring.aopanno.User;
import pers.dreamer07.spring.config.SpringConfig;

/**
 * 完全注解开发Aop - 测试配置类
 * @author shkstart
 * @create 2020-08-26 16:45
 */
public class ConfigTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user", User.class);
        user.add();
    }

}
