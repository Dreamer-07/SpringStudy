import org.junit.Test;
import pers.dreamer07.spring.proxy.ProxyFactory;
import pers.dreamer07.spring.proxy.UserDAO;
import pers.dreamer07.spring.proxy.UserDAOImpl;

/**
 * 动态代理 - 测试类
 * @author shkstart
 * @create 2020-08-26 11:41
 */
public class ProxyTest {
    @Test
    public void test(){
        //调用代理工厂获取增加后的代理类对象
        UserDAO userDAO = (UserDAO) ProxyFactory.getProxyInstance(new UserDAOImpl());
        //调用对应的方法
        int update = userDAO.update(20, 999);
        System.out.println(update);
    }
}
