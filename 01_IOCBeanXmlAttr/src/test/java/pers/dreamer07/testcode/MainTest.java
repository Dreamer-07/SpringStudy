package pers.dreamer07.testcode;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import pers.dreamer07.spring5.code.Main;

import java.applet.AppletContext;

/**
 * Spring - 入门案例 - 测试类
 * @author shkstart
 * @create 2020-08-21 20:10
 */
public class MainTest {

    @Test
    public void test1(){
        /*
        * 1. 加载 spring 配合文件
        *       ClassPathXmlApplicationContext - 参考编译后 classes文件夹 的路径
        *       FileSystemXmlApplicationContext - 参考 当前工程/模块 路径
        * */
//        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean1.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/META-INF/bean1.xml");

        //2.读取配置文件中创建的对象
        Main main = context.getBean("main", Main.class);

        //3. 调用方法
        main.getEMT();
    }

}
