package pers.dreamer07.spring.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Aop操作(基于AspectJ注解) - 增强类
 * @author shkstart
 * @create 2020-08-26 14:45
 */
@Component //创建 bean 实例
@Aspect //代表为增强类
@Order(3) //通过@Order设置的数值型数据，数据越小，优先级越高
public class UserProxy {

    @Pointcut(value = "execution(* pers.dreamer07.spring.aopanno.User.add(..))") //提取公共的切入点
    public void pointName(){};

    /**
     * 设计一个方法为前置通知
     */
    @Before(value = "pointName()") //添加 前置通知的类型注解，再使用切入点表达式进行配置
    public void before(){
        System.out.println("前置通知");
    }

    //后置通知(在返回值后执行，抛出异常不执行)
    @AfterReturning(value = "pointName()")
    public void afterReturning(){
        System.out.println("后置通知");
    }

    //异常通知(抛出异常时执行)
    @AfterThrowing(value = "pointName()")
    public void afterThrowing(){
        System.out.println("异常通知");
    }

    //最终通知(原方法和环绕通知执行后执行，抛出异常执行)
    @After(value = "pointName()")
    public void after(){
        System.out.println("最终通知");
    }

    //环绕通知(原方法抛出异常后，该内部定义的后面的通知就不会执行)
    @Around(value = "pointName()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable { //需要在参数中获取ProceedingJoinPoint实例对象
        //在方法执行前执行 - 在前置通知前执行
        System.out.println("在方法执行前执行");

        //执行被增强的方法
        proceedingJoinPoint.proceed();

        //在方法执行后执行 - 在后置和最终通知前执行
        System.out.println("在方法执行后执行");
    }

}
