package pers.dreamer07.spring.aopanno;

import org.springframework.stereotype.Component;

/**
 * Aop操作(基于AspectJ注解) - 被增强类
 * @author shkstart
 * @create 2020-08-26 15:10
 */
@Component //创建bean实例
public class User {
    public void add(){
//        int i = 1 / 0;
        System.out.println("User add...");
    }
}
