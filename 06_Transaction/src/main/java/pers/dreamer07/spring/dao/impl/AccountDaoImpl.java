package pers.dreamer07.spring.dao.impl;

import org.springframework.stereotype.Repository;
import pers.dreamer07.spring.bean.Account;
import pers.dreamer07.spring.dao.AccountDao;

/**
 * 数据库事务操作 - 操作Account表规范的实现类
 * @author shkstart
 * @create 2020-08-27 19:35
 */
@Repository
public class AccountDaoImpl extends BaseDao<Account> implements AccountDao {

    @Override
    public int updatePrice(Integer id, Double price) {
        String sql = "UPDATE account SET price = ? WHERE id = ?";
        return update(sql,price,id);
    }

}
