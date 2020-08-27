package pers.dreamer07.spring.dao.impl;

import org.springframework.stereotype.Repository;
import pers.dreamer07.spring.bean.User;
import pers.dreamer07.spring.dao.UserDao;

import java.util.List;

/**
 * JdbcTemplate 的基本使用 - 操作User表的规范的实现
 * @author shkstart
 * @create 2020-08-27 9:03
 */
@Repository
public class UserDaoImpl extends BaseDao<User> implements UserDao {

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Override
    public int add(User user) {
        String sql = "INSERT INTO user(name,status) VALUES(?,?)";
        return update(sql,user.getName(),user.getStatus());
    }

    /**
     * 根据提供的User信息修改对应的数据
     * @param user
     * @return
     */
    @Override
    public int updateUser(User user) {
        String sql = "UPDATE user SET name = ?,status = ? WHERE id = ?";
        return update(sql,user.getName(),user.getStatus(),user.getId());
    }

    /**
     * 根据id删除表中的数据
     * @param id
     * @return
     */
    @Override
    public int deleteById(Integer id) {
        String sql = "DELETE FROM user WHERE id = ?";
        return update(sql,id);
    }

    /**
     * 查询表中的所有记录个数
     * @return
     */
    @Override
    public Integer queryCount() {
        String sql = "SELECT COUNT(*) FROM user";
        return querySpecial(sql,Integer.class);
    }

    /**
     * 根据id查询表中的一条记录
     * @param id
     * @return
     */
    @Override
    public User queryUserById(Integer id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return query(sql,id);
    }

    /**
     * 查询表中的所有记录
     * @return
     */
    @Override
    public List<User> queryAllUserList() {
        String sql = "SELECT * FROM user";
        return queryList(sql);
    }

    /**
     * 批量添加记录
     * @param list
     */
    @Override
    public void addUserBatch(List<Object[]> list) {
        String sql = "INSERT INTO user(name,status) VALUES(?,?)";
        addBatch(sql,list);
    }


}
