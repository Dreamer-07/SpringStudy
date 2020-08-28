import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring.service.AccountService;

import java.math.BigDecimal;

/**
 *  数据库事务操作 - 测试类
 * @author shkstart
 * @create 2020-08-27 19:50
 */
public class ServiceTest {


    @Test
    public void testTransferMoney(){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean1.xml");
        AccountService accountService = context.getBean("accountService",AccountService.class);
        //用户A向用户B转账100块
        int i = accountService.transferMoney(1, 2, 100.0);
        if(i > 0){
            System.out.println("转账成功");
        }else{
            System.out.println("转账失败");
        }
    }

}
