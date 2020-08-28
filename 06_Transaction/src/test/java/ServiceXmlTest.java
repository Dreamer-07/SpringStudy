import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring.service.AccountService;


/**
 * @author shkstart
 * @create 2020-08-28 10:57
 */
public class ServiceXmlTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean2.xml");
    AccountService accountService = context.getBean("accountService",AccountService.class);

    @Test
    public void text(){
        //用户A向用户B转账100块
        int i = accountService.transferMoney(1, 2, 100.0);
        if(i > 0){
            System.out.println("转账成功");
        }else{
            System.out.println("转账失败");
        }
    }
}
