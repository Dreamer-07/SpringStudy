import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.dreamer07.spring.service.AccountService;

/**
 * Spring 整合Junit4
 * @author shkstart
 * @create 2020-08-29 12:47
 */
@RunWith(SpringJUnit4ClassRunner.class) //指定单元测试框架版本
@ContextConfiguration("classpath:META-INF/bean1.xml") //加载配置文件
public class Junit4Test {

    @Autowired //自动注入 service
    private AccountService accountService;

    @Test //设计测试方法
    public void test(){
        int i = accountService.transferMoney(1, 2, 100.0);
        System.out.println(i);
    }

}
