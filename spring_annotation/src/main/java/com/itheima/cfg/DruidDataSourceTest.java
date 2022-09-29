package com.itheima.cfg;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
public class DruidDataSourceTest {

    @Bean
    public Connection getDataSource() {

        DruidPooledConnection connection = null;

        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource.setUrl("jdbc:mysql://localhost:3306/anime_test01?serverTimezone=UTC");

        dataSource.setUsername("root");

        dataSource.setPassword("root");

        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return connection;
        }

    }

}
