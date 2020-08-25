package pers.dreamer07.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 完全注解开发 - 配置类
 * @author shkstart
 * @create 2020-08-25 11:03
 */
//1. 添加Configuration表示为配置类
@Configuration
//2. 开启注解扫描
@ComponentScan(basePackages = {"pers.dreamer07.spring"})
public class SpringConfig {
}
