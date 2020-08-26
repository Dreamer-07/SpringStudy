package pers.dreamer07.spring.proxy;

/**
 * 动态代理 - 实现类
 * @author shkstart
 * @create 2020-08-26 11:39
 */
public class UserDAOImpl implements UserDAO{
    @Override
    public int update(int id, int value) {
        return id + value;
    }

    @Override
    public String queryNameById(int id) {
        return id + " EMT!!";
    }
}
