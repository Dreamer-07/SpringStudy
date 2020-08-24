package pers.dreamer07.spring5.coll_map;

import java.util.List;

/**
 * 通过 xml 的方式注入集合属性 - 特殊2：将list集合注入部分提取出来
 * @author shkstart
 * @create 2020-08-24 12:07
 */
public class Book {
    List<String> names;

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Book{" +
                "names=" + names +
                '}';
    }
}
