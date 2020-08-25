package pers.dreamer07.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.dreamer07.spring.life.Order;

/**
 * bean 的生命周期 - 测试类
 * @author shkstart
 * @create 2020-08-24 20:38
 */
public class LifeTest {

    @Test
    public void test(){
        //创建SpringIOC容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean3.xml");
        //获取对应的bean实例
        Order order = context.getBean("order", Order.class);
        System.out.println("第四步，获取bean实例");
        System.out.println(order);

        /* 调用close()方法关闭对应的SpringIOC容器
        *       - 由于 ApplicationContext 中并没有对应的close()方法
        *         所以需要强转子类 ClassPathXmlApplicationContext
        * */
        ((ClassPathXmlApplicationContext) context).close();
    }
}
