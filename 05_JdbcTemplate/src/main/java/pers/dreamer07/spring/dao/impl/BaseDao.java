package pers.dreamer07.spring.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * JdbcTemplate 的基本使用 - 底层Dao类
 * @author shkstart
 * @create 2020-08-27 8:48
 */
@Repository
public class BaseDao<E> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private Class<E> clazz;

    /*
    * 通过无参构造函数初始化Class<E>
    * 具体实现请看 JDBC
    * 这里之所以放在无参构造函数中是因为Spring在创建bean实例时，并不是通过子类对象调用的
    * 会导致Type type是Object类型，最后报错，
    * 但又不能返回静态代码块中(因为只执行一次)，所以放在无参构造函数中
    * 使Spring在创建bean实例时不会报错，当创建子类对象调用父类构造器时又能获取指定的泛型参数
    * */
    public BaseDao(){
        Type type = this.getClass().getGenericSuperclass();
        if(!type.getTypeName().contains("Object")){
            ParameterizedType pType = (ParameterizedType) type;
            Type[] types = pType.getActualTypeArguments();
            clazz = (Class<E>) types[0];
        }
    }

    /**
     * 针对 增删改 操作通用的方法
     * @param sql
     * @param args
     * @return
     */
    public int update(String sql,Object...args){
        return jdbcTemplate.update(sql,args);
    }

    /**
     * 查询特殊值，根据传入 clazz 参数类型，返回相对应的数据
     * @param sql
     * @param clazz
     * @param args
     * @param <T>
     * @return
     */
    public <T> T querySpecial(String sql,Class<T> clazz,Object...args){
        /*
        * public <T> T queryForObject(String sql, Class<T> requiredType,Object... args)
        *   第一个参数sql：sql语句
        *   第二个参数requiredType：返回值的数据类型
        *   第三个参数args：需要填充占位符的数据
        * */
        return jdbcTemplate.queryForObject(sql,clazz,args);
    };

    /**
     * 查询由一条记录封装的对象
     * @param sql
     * @param args
     * @return
     */
    public E query(String sql,Object...args){
        /*
        * <T> T queryForObject(String sql, RowMapper<T> rowMapper, Object... args)
         *   第一个参数sql：sql语句
         *   第三个参数rowMapper：和Apache-DBUtils中的ResultSetHandler类一样，根据查询结果的返回值类型，选择相对应的实现类
         *   第三个参数args：需要填充占位符的数据
        * */
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<E>(clazz),args);
    }

    /**
     * 查询所有记录封装的List集合
     * @param sql
     * @param args
     * @return
     */
    public List<E> queryList(String sql,Object...args){
        /*
        * public <T> List<T> query(String sql, RowMapper<T> rowMapper, @Nullable Object... args)
        *   第一个参数sql：sql语句
        *   第三个参数rowMapper：和Apache-DBUtils中的ResultSetHandler类一样，根据查询结果的返回值类型，选择相对应的实现类
        *   第三个参数args：需要填充占位符的数据
        * */
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<E>(clazz),args);
    }

    /**
     * 批量操作
     * @param sql
     * @param list
     */
    public void addBatch(String sql,List<Object[]> list){
        /*
        * public int[] batchUpdate(String sql, List<Object[]> batchArgs)
        *       第二个参数 batchArgs：保存需要添加的数据
        * */
        jdbcTemplate.batchUpdate(sql,list);
    }

}
