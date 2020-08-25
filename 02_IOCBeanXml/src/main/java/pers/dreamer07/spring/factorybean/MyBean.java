package pers.dreamer07.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean 工厂Bean的使用
 * @author shkstart
 * @create 2020-08-24 17:40
 */
//1. 实现接口 FactoryBean<T>,T就是返回的数据类型
public class MyBean implements FactoryBean<Person> {

    //2. 主要执行方法
    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setName("EMT!!");
        return person;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

}
