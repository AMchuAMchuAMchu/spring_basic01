package com.itheima.cfg;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


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
@Import({DruidDataSourceTest.class})
public class SpringConfig {


}
