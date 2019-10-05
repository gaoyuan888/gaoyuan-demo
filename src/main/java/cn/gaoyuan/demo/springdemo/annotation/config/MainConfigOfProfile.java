package cn.gaoyuan.demo.springdemo.annotation.config;

import cn.gaoyuan.demo.springdemo.annotation.bean.Yellow;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/3 20:57
 * @desc
 */
@PropertySource("classpath:/dbconfig.properties")
//@Profile("devEnv")
@Configuration
public class MainConfigOfProfile implements EmbeddedValueResolverAware {

    private StringValueResolver stringValueResolver;

    @Value("${db.user}")
    private String user;

    private String driverClass;

    @Bean("yellow")
    @Profile("testEnv")
    public Yellow yellow() {
        return new Yellow();
    }


    @Bean("test")
//    @Profile("default")//默认default
    @Profile("testEnv")
    public DataSource test(@Value("${db.password}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/");
        driverClass = stringValueResolver.resolveStringValue("${db.driverClass}");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Bean("dev")
    @Profile("devEnv")
    public DataSource dev() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Bean("product")
    @Profile("productEnv")
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }


    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.stringValueResolver = resolver;
    }
}
