package pers.dreamer07.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 完成注解开发
 * @author shkstart
 * @create 2020-08-28 11:28
 */
@Configuration //配置类
@ComponentScan(basePackages = "pers.dreamer07.spring.*") //开启注解扫描
@EnableTransactionManagement //开启事务注解
public class TxConfig {
    /*
    * 使用 @Bean 注解创建需要的 bean 实例
    * 该注解下的方法就是需要创建 bean 实例所对应的类型
    * 格式如下：
    *   @Bean
    *   public 类型 get类型(可以接受IOC容器已创建的bean实例){
    *       return xxxXxxx;
    *   }
    * */

    @Bean //数据库连接池
    public DruidDataSource getDruidDataSource(){
        FileReader fr = null;
        DruidDataSource druidDataSource = new DruidDataSource();
        try {
            //加载配置文件
            fr = new FileReader("src/main/resources/jdbc.properties");
            Properties prop = new Properties();
            prop.load(fr);

            //配置数据库连接池
            druidDataSource.setDriverClassName(prop.getProperty("emt.driverClassName"));
            druidDataSource.setUsername(prop.getProperty("emt.username"));
            druidDataSource.setPassword(prop.getProperty("emt.password"));
            druidDataSource.setUrl(prop.getProperty("emt.url"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return druidDataSource;
    }

    @Bean //JdbcTemplate
    /*
    * DruidDataSource dataSource - 根据类型可以从 IOC 容器中获取对应的 数据源
    * */
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean //事务管理器
    public TransactionManager getTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
