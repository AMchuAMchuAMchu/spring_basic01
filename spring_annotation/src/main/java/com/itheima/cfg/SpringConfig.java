package com.itheima.cfg;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.cfg
 * CreateTime==>2022-09-28 10:09:23
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@Configuration
@ComponentScan("com.itheima")
public class SpringConfig {

    public DataSource getDataSource(){

        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource.setUrl("jdbc:mysql://localhost:3306/anime_test01?serverTimezone=UTC");

        dataSource.setUsername("root");

        dataSource.setPassword("root");

        return dataSource;

    }

}
