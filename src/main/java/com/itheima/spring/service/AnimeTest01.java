package com.itheima.spring.service;

import com.itheima.spring.impl.AnimeInfoImpl;
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



    @Test
    public void getBean(){

        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        AnimeInfoImpl animeInfo = (AnimeInfoImpl) cpx.getBean("AnimeInfoImpl");

        System.out.println("Name >> "+animeInfo.getAnimeName());
        System.out.println("Time >> "+animeInfo.getAnimeTime());
        animeInfo.getAnimeKNCW();



    }

}
