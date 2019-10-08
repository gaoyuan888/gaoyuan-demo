package cn.gaoyuan.demo.springdemo.annotation.tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/5 10:05
 * @desc
 */
@ComponentScan("cn.gaoyuan.demo.springdemo.annotation.tx")
@Configuration
@EnableTransactionManagement
public class TxConfig {


    //注册事务管理器在容器中
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }


    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://106.13.51.95:3306/test");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        //这个会直接从容器中拿组件
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        这个方式不会重新创建一个datasource 这个是直接从容器中拿组件
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());

        return jdbcTemplate;
    }
}
