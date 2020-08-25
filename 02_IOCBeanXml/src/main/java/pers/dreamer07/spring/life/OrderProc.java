package pers.dreamer07.spring.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean 后置处理器
 * @author shkstart
 * @create 2020-08-24 21:06
 */
//1. 实现BeanPostProcessor接口
public class OrderProc implements BeanPostProcessor {

    //2. 重写其中的两个方法
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("会在 bean 配置的初始化方法前执行");
        return bean; //返回bean
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("会在 bean 配置的初始化方法后执行");
        return bean; //返回bean
    }
}
