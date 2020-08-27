package pers.dreamer07.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.dreamer07.spring.bean.User;
import pers.dreamer07.spring.dao.UserDao;

import java.util.List;

/**
 * JdbcTemplate的基本使用 - Service类
 * @author shkstart
 * @create 2020-08-27 9:07
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public int add(User user){
        return userDao.add(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }


    public int deleteUserById(Integer id) {
        return userDao.deleteById(id);
    }

    public int queryCount() {
        Integer count = userDao.queryCount();
        if(count == null){
            return 0;
        }
        return count;
    }

    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }

    public List<User> queryAll(){
        return userDao.queryAllUserList();
    }

    public void addUserBatch(List<Object[]> list){
        userDao.addUserBatch(list);
    }
}
