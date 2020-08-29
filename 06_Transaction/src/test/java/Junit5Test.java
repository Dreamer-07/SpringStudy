import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import pers.dreamer07.spring.service.AccountService;

/**
 * Spring5 整合 Junit5 单元测试框架
 * @author shkstart
 * @create 2020-08-29 13:04
 */
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:META-INF/bean1.xml")
//使用 @SpringJunitConfig复合型注解替换以上两个
@SpringJUnitConfig(locations = "classpath:META-INF/bean1.xml")
public class Junit5Test {

    @Autowired
    private AccountService accountService;

    @Test //需要 org.junit.jupiter.api.Test; 包下的
    public void test(){
        int i = accountService.transferMoney(1, 2, 100.0);
        System.out.println(i);
    }
}
