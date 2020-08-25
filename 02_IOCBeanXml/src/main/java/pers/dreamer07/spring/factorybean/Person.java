package pers.dreamer07.spring.factorybean;

/**
 * FactoryBean 工厂Bean的使用
 * @author shkstart
 * @create 2020-08-24 17:41
 */
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
