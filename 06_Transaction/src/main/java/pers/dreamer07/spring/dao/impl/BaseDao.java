package pers.dreamer07.spring.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 数据库事务操作 - 封装了操作数据库的基本方法
 * @author shkstart
 * @create 2020-08-27 19:28
 */
@Repository
public class BaseDao<E> {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Class<E> clazz;

    public BaseDao() {
        Type type = this.getClass().getGenericSuperclass();
        if(!type.getTypeName().contains("Object")){
            ParameterizedType pType = (ParameterizedType) type;
            Type[] types = pType.getActualTypeArguments();
            clazz = (Class<E>) types[0];
        }
    }

    /**
     * 负责增删改数据的操作
     * @param sql
     * @param args
     * @return
     */
    public int update(String sql,Object...args){
        return jdbcTemplate.update(sql,args);
    }

    /**
     * 查询一条记录
     * @param sql
     * @param args
     * @return
     */
    public E query(String sql,Object...args){
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<E>(clazz),args);
    }
}
