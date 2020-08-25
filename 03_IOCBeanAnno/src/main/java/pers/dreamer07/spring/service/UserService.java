package pers.dreamer07.spring.service;

import org.springframework.stereotype.Service;

/**
 * 使用注解完成对象创建
 * @author shkstart
 * @create 2020-08-25 9:19
 */
/*
* 1. 使用四个注解中的任意一个都可
* 2. 都可以指定value值，该value值就是 <bean id="..."></bean> 中的id属性
* 3. value的默认值为 当前类名 但是首字母小写
* */
@Service(value = "userService")
public class UserService {
    public void add(){
        System.out.println("service add()...");
    }
}
