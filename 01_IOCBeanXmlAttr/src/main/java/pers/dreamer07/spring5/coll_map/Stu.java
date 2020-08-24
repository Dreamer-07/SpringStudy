package pers.dreamer07.spring5.coll_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 通过 xml 的方式注入集合属性
 * @author shkstart
 * @create 2020-08-24 10:31
 */
public class Stu {
    //创建对应的四种集合类型属性
    private String[] arr; //数组
    private List<String> list; //list集合
    private Set<String> set; //set集合
    private Map<String,Object> map; //map集合

    private List<Course> courses; //集合元素为Course对象类型的List集合

    //创建对应的set方法

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "arr=" + Arrays.toString(arr) +
                "\nlist=" + list +
                "\nset=" + set +
                "\nmap=" + map +
                "\ncourses=" + courses +
                '}';
    }
}
