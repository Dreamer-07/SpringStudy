import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring.bean.User;
import pers.dreamer07.spring.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * JdbcTemplate基本使用 - 测试类
 * @author shkstart
 * @create 2020-08-27 9:21
 */
public class ServiceTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean1.xml");
    UserService userService = context.getBean("userService", UserService.class);

    @Test //测试添加方法
    public void testAdd(){
        int line = userService.add(new User(null, "EMT!!", "dasuki"));
        System.out.println(line);
    }

    @Test //测试修改方法
    public void testUpdate(){
        int line =userService.updateUser(new User(1,"EMT!!","dasuki"));
        System.out.println(line);
    }

    @Test //测试查询特殊值的方法
    public void testQueryCount(){
        int count = userService.queryCount();
        System.out.println("一共有" + count + "条记录");
    }

    @Test //测试删除方法
    public void testDelete(){
        int line = userService.deleteUserById(1);
        System.out.println(line);
    }

    @Test //查询一个具体的User对象
    public void testQueryUser(){
        User user = userService.queryUserById(1);
        System.out.println(user);
    }

    @Test //查询表中的所有记录
    public void testQueryAll(){
        List<User> userList = userService.queryAll();
        System.out.println(userList);
    }

    @Test //批量添加
    public void testAddBatch(){
        //将需要填充到sql语句的占位符的数据保存到数组中
        Object[] vals1 = new Object[]{"EMM!!","OKK"};
        Object[] vals2 = new Object[]{"EMP!!","OKK"};
        Object[] vals3 = new Object[]{"EMH!!","OKK"};

        //将数组保存到List集合中
        ArrayList<Object[]> list = new ArrayList<>();
        list.add(vals1);
        list.add(vals2);
        list.add(vals3);

        //调用方法
        userService.addUserBatch(list);
    }





}
