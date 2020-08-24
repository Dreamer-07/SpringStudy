package pers.dreamer07.spring5.bean;

/**
 * 注入内部 bean - 部门类
 * @author shkstart
 * @create 2020-08-24 9:12
 */
public class Dept {
    private String dname; //部门名

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
