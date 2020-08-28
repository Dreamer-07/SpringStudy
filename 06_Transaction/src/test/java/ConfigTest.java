import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.dreamer07.spring.config.TxConfig;
import pers.dreamer07.spring.service.AccountService;

/**
 * 完全注解开发 - 测试类
 * @author shkstart
 * @create 2020-08-28 11:44
 */
public class ConfigTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.transferMoney(1,2,100.0);
    }

}
