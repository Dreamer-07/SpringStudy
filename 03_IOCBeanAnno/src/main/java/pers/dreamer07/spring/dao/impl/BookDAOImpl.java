package pers.dreamer07.spring.dao.impl;

import org.springframework.stereotype.Repository;
import pers.dreamer07.spring.dao.BookDAO;

/**
 * 使用注解完成属性注入 - @AutoWired和@Qualifier的使用
 * @author shkstart
 * @create 2020-08-25 10:23
 */
@Repository
public class BookDAOImpl implements BookDAO {
    @Override
    public void update() {
        System.out.println("BookDAO update...");
    }
}
