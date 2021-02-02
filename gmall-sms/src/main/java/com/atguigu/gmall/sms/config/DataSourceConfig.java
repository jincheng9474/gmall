package com.atguigu.gmall.sms.config;

import com.zaxxer.hikari.HikariDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author : ZJC
 * @date : 2021/1/22 19:24
 * className : DataSourceConfig
 * package: com.atguigu.gmall.pms.config
 * version : 1.0
 * Description  配置数据源
 */
@Configuration
public class DataSourceConfig {
    /**
     * @Date 2021/1/22 19:25
     * @return
     * 需要将 DataSourceProxy 设置为主数据源，否则事务无法回滚
     */
    @Primary
    @Bean("dataSource")
    public DataSource dataSource(
            @Value("${spring.datasource.driver-class-name}")String driverClassName,
            @Value("${spring.datasource.url}")String url,
            @Value("${spring.datasource.username}")String username,
            @Value("${spring.datasource.password}")String password
    ){
        HikariDataSource hikariDataSource = new HikariDataSource();;
        hikariDataSource.setJdbcUrl(url);
        hikariDataSource.setDriverClassName(driverClassName);
        hikariDataSource.setUsername(username);
        hikariDataSource.setPassword(password);
        return new DataSourceProxy(hikariDataSource);
    }
}
