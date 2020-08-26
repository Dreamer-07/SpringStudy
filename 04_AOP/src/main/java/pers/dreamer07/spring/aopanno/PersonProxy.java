package pers.dreamer07.spring.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 设置多个增强类的优先级
 * @author shkstart
 * @create 2020-08-26 16:18
 */
@Component
@Aspect
@Order(1) //通过@Order设置的数值型数据，数据越小，优先级越高
public class PersonProxy {

    @Before(value = "execution(* pers.dreamer07.spring.aopanno.User.add(..))")
    public void before(){
        System.out.println("Person before");
    }
}
