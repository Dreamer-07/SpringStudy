package pers.dreamer07.spring.aopxml;

/**
 * Aop操作(基于xml) - 增强类
 * @author shkstart
 * @create 2020-08-26 16:34
 */
public class BookProxy {

    public void before(){
        System.out.println("前置通知的执行");
    }

}
