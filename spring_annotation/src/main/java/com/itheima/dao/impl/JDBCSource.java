package com.itheima.dao.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic01
 * BelongsPackage ==> com.itheima.dao.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-09-29 09:51:34
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Repository
@Configuration
@PropertySource("classpath:jdbc.properties")
public class JDBCSource {

    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    public void test(){
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }


}
