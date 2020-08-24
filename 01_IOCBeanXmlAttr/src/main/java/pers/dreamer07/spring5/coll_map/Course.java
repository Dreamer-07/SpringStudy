package pers.dreamer07.spring5.coll_map;

/**
 * 通过 xml 的方式注入集合属性 - 特殊1：集合元素的类型为对象类型
 * @author shkstart
 * @create 2020-08-24 11:52
 */
public class Course {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
