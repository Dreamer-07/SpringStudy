package pers.dreamer07.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.dreamer07.spring.dao.AccountDao;

/**
 * 数据库事务操作 - 定义操作Account的业务逻辑
 * @author shkstart
 * @create 2020-08-27 19:38
 */
@Service
@Transactional //事务注解，为该类中的所有方法添加上事务
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 转账
     * @param uid 转账用户的id
     * @param tid 收账用户的id
     * @param money 转账金额
     * @return
     */
    public int transferMoney(Integer uid,Integer tid,Double money){
        //这里先写死为500，正常情况需要先获取
        accountDao.updatePrice(uid,500 - money);

        //模拟异常
//        int a = 10 / 0;

        int i = accountDao.updatePrice(tid, 500 + money);
        return i;
    };

}
