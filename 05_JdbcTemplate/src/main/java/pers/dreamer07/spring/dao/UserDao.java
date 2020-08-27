package pers.dreamer07.spring.dao;

import pers.dreamer07.spring.bean.User;

import java.util.List;


/**
 * JdbcTemplate 的基本使用 - 操作User表的规范
 * @author shkstart
 * @create 2020-08-27 9:03
 */
public interface UserDao {

    //添加方法
    int add(User user);

    //修改方法
    int updateUser(User user);

    //删除方法
    int deleteById(Integer id);

    //查询总记录数
    Integer queryCount();

    //根据id查询一条记录
    User queryUserById(Integer id);

    //查询所有记录
    List<User> queryAllUserList();

    //批量添加
    void addUserBatch(List<Object[]> list);
}
