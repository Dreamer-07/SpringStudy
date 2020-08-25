package pers.dreamer07.spring.life;

import java.sql.SQLOutput;

/**
 * bean的生命周期
 * @author shkstart
 * @create 2020-08-24 20:32
 */
public class Order {

    private String oname;

    //无参构造器
    public Order() {
        System.out.println("第一步 调用对应的构造器");
    }

    //通过set完成依赖注入
    public void setOname(String oname) {
        System.out.println("第二步 调用对应属性的set方法");
        this.oname = oname;
    }

    //创建对应的初始化方法
    public void initMethod(){
        System.out.println("第三步 调用 bean 配置的初始化方法");
    }

    //创建对应的销毁方法
    public void destroyMethod(){
        System.out.println("第五步 调用 bean 配置的销毁方法");
    }
}