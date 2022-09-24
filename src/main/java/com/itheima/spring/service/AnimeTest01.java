package com.itheima.spring.service;

import com.itheima.spring.dao.AnimeTime;
import com.itheima.spring.impl.AnimeInfoImpl;
import com.itheima.spring.impl.AnimeNameImpl;
import com.itheima.spring.impl.AnimeTimeImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.spring.service
 * CreateTime==>2022-09-24 16:34:21
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnimeTest01 {

    public static ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext(
            "applicationContext.xml");


    @Test
    public void testPrototype(){

        AnimeNameImpl bean01 = cpx.getBean(AnimeNameImpl.class);
        AnimeNameImpl bean02 = cpx.getBean(AnimeNameImpl.class);

//        System.out.println(bean.getAnimeName());

        System.out.println(bean01);
        System.out.println(bean02);

    }

    @Test
    public void testSingleTon(){

        AnimeTimeImpl animeTime01 = (AnimeTimeImpl) cpx.getBean("AnimeTimeImpl");
        AnimeTimeImpl animeTime02 = (AnimeTimeImpl) cpx.getBean("AnimeTimeImpl");

        System.out.println("01 "+animeTime01);
        System.out.println("02 "+animeTime02);


    }






    @Test
    public void getBean(){

        AnimeInfoImpl animeInfo = (AnimeInfoImpl) cpx.getBean("AnimeInfoImpl");

        System.out.println("Name >> "+animeInfo.getAnimeName());
        System.out.println("Time >> "+animeInfo.getAnimeTime());
        animeInfo.getAnimeKNCW();



    }

}
