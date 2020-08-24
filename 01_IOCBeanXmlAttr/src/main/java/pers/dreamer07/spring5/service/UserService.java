package pers.dreamer07.spring5.service;

import pers.dreamer07.spring5.dao.UserDAO;

/**
 * 通过 xml 的方式注入外部bean - service类
 * @author shkstart
 * @create 2020-08-23 16:14
 */
public class UserService {

    //提供对应的外部bean对象属性以及set方法
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(){
        System.out.println("service add...");
        userDAO.update();
    }
}
