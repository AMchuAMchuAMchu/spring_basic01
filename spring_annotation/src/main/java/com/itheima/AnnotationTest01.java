package com.itheima;

import com.itheima.cfg.DruidDataSourceTest;
import com.itheima.cfg.SpringConfig;
import com.itheima.dao.impl.AnimeInfoImpl;
import com.itheima.dao.impl.JDBCSource;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.sql.Connection;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima
 * CreateTime==>2022-09-28 09:49:18
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnnotationTest01 {


    public static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);



    @Test
    public void testDruidDataSource(){

        DruidDataSourceTest bean = ac.getBean(DruidDataSourceTest.class);

        Connection dataSource = bean.getDataSource();

        System.out.println(dataSource);

    }



//    @Test
//    public void testAnnotationCfg(){
//
//        AnimeInfoImpl bean = ac.getBean(AnimeInfoImpl.class);
//
//        bean.sayHello();
//
//
//    }


    @Test
    public void testJdbc(){

        JDBCSource bean = ac.getBean(JDBCSource.class);

        bean.test();

    }

    @Test
    public void testAutowired(){

        AnimeInfoImpl bean = ac.getBean(AnimeInfoImpl.class);

        bean.sayHello();



    }


    @Test
    public void testSingleType(){

        AnimeInfoImpl bean01 = ac.getBean(AnimeInfoImpl.class);
        AnimeInfoImpl bean02 = ac.getBean(AnimeInfoImpl.class);
        System.out.println(bean01);
        System.out.println(bean02);
        ac.registerShutdownHook();

    }


    @Test
    public void test01(){
        AnimeInfoImpl bean01 = ac.getBean(AnimeInfoImpl.class);
        AnimeInfoImpl bean02 = ac.getBean(AnimeInfoImpl.class);
        System.out.println(bean01);
        System.out.println(bean02);
        ac.registerShutdownHook();
//        bean.sayHello();
    }


}
