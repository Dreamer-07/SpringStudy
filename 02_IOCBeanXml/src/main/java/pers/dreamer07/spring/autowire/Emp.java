package pers.dreamer07.spring.autowire;

/**
 * bean 的自动装配
 * @author shkstart
 * @create 2020-08-25 7:23
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
