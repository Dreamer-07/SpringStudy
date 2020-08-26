package pers.dreamer07.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * 完全注解开发Aop - 配置类
 * @author shkstart
 * @create 2020-08-26 16:43
 */
@Configuration //标识配置类
@ComponentScan(basePackages = {"pers.dreamer07.spring"})  //注解扫描
@EnableAspectJAutoProxy(proxyTargetClass = true) //开启AspectJ生成代理对象
public class SpringConfig {
}
