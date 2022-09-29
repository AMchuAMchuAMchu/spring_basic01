package com.itheima.cfg;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic01
 * BelongsPackage ==> com.itheima.cfg
 * Version ==> 1.0
 * CreateTime ==> 2022-09-29 13:03:13
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@PropertySource("classpath:jdbc.properties")
public class DruidDataSourceTest {

    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public Connection getDataSource() {

        DruidPooledConnection connection = null;

        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName(driverClassName);

        dataSource.setUrl(url);

        dataSource.setUsername(username);

        dataSource.setPassword(password);

        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return connection;
        }

    }

}
