package pers.dreamer07.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * 数据库事务操作 - 规定操作account表的规范
 * @author shkstart
 * @create 2020-08-27 19:27
 */

public interface AccountDao {
    //根据账户id修改对应的金额
    public int updatePrice(Integer id,Double price);
}
