package com.itheima.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.impl.AnimeCollectionDITestImpl;
import com.itheima.dao.impl.AnimeInfoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Map;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.test
 * CreateTime==>2022-09-26 14:25:02
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnimeInfoTest01 {
    public ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring" +
            ".xml");



    @Test
    public void testLazy_init(){



    }


    @Test
    public void testEnv(){

        Map<String, String> getenv = System.getenv();

        getenv.entrySet().forEach(System.out::println);

    }


    @Test
    public void testDruidDatasource() throws SQLException {

        DruidDataSource dataSource = cpx.getBean(DruidDataSource.class);

        System.out.println(dataSource);

        System.out.println(dataSource.getConnection());

    }


    @Test
    public void testAnimeCollectionDI(){
        AnimeCollectionDITestImpl bean = cpx.getBean(AnimeCollectionDITestImpl.class);
        bean.getList();
        System.out.println("================");
        bean.getSet();
        System.out.println("================");
        bean.getMap();
        System.out.println("================");
        bean.getProperties();
    }

    @Test
    public void testAutowired() {
        AnimeInfoImpl bean = cpx.getBean(AnimeInfoImpl.class);

        bean.printAnimeInfo();

    }
}
