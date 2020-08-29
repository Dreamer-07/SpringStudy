import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.dreamer07.spring.bean.Account;

/**
 * Spring5 核心容器支持函数式风格 GenericApplicationContext() - 测试
 * @author shkstart
 * @create 2020-08-29 9:17
 */
public class GenAppTest {

    @Test //Spring5 中使用函数式编程
    public void testLog4j2(){
        //1. 创建 GenericApplicationContext 对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2. 调用 context 的方法将对象注册给 Spring 管理
        context.refresh();
        /*
        * context.registerBean("account", Account.class,() -> new Account());
        *   第一个参数 beanName = 代表在 SpirngIOC 容器中的id
        *   第二个参数 beanClass = 对应的 Class 实例
        *   第三个参数 supplier = 支持 lambda 表达式
        * */
        context.registerBean("account", Account.class,() -> new Account());
        //3. 获取在 Spring 中注册的对象
        Account account = context.getBean("account", Account.class);
        System.out.println(account);
    }

}
