package pers.dreamer07.spring.proxy;

/**
 * 动态代理 - 接口
 * @author shkstart
 * @create 2020-08-26 11:39
 */
public interface UserDAO {
    public int update(int id,int value);

    public String queryNameById(int id);
}
