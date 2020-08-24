package pers.dreamer07.spring5.bean;

/**
 * 注入内部 bean - 员工类
 * @author shkstart
 * @create 2020-08-24 9:13
 */
public class Emp {
    private String name; //员工名
    private String gender; //性别
    private Dept dept; //对应的部门对象

    //创建对应的set方法

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
