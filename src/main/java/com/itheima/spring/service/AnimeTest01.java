package com.itheima.spring.service;

import com.itheima.spring.dao.AnimeTime;
import com.itheima.spring.impl.AnimeInfoImpl;
import com.itheima.spring.impl.AnimeKNCWImpl;
import com.itheima.spring.impl.AnimeNameImpl;
import com.itheima.spring.impl.AnimeTimeImpl;
import com.itheima.spring.utils.FactoryCreateBean;
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
    public void testFactoryMethodXMLNotStatic(){
        AnimeKNCWImpl fcb02 = (AnimeKNCWImpl) cpx.getBean("FactoryCreateBean02");

        fcb02.sayHello();


    }


    @Test
    public void testFactoryMethodXML() {

        AnimeKNCWImpl cpxBean = (AnimeKNCWImpl) cpx.getBean("FactoryCreateBean");

        cpxBean.sayHello();

    }

    @Test
    public void testFactoryMethod() {

        AnimeKNCWImpl animeKNCWBean = FactoryCreateBean.getAnimeKNCWBean();

        animeKNCWBean.sayHello();

    }

    @Test
    public void testConstructorArgs() {

        AnimeInfoImpl animeInfo = cpx.getBean(AnimeInfoImpl.class);

        animeInfo.getAnimeKNCW();

    }

    @Test
    public void testConstructor() {

        AnimeTimeImpl bean = cpx.getBean(AnimeTimeImpl.class);

        System.out.println(bean.getAnimeTime());

    }

    @Test
    public void testPrototype() {

        AnimeNameImpl bean01 = cpx.getBean(AnimeNameImpl.class);
        AnimeNameImpl bean02 = cpx.getBean(AnimeNameImpl.class);

//        System.out.println(bean.getAnimeName());

        System.out.println(bean01);
        System.out.println(bean02);

    }

    @Test
    public void testSingleTon() {

        AnimeTimeImpl animeTime01 = (AnimeTimeImpl) cpx.getBean("AnimeTimeImpl");
        AnimeTimeImpl animeTime02 = (AnimeTimeImpl) cpx.getBean("AnimeTimeImpl");

        System.out.println("01 " + animeTime01);
        System.out.println("02 " + animeTime02);


    }


    @Test
    public void getBean() {

        AnimeInfoImpl animeInfo = (AnimeInfoImpl) cpx.getBean("AnimeInfoImpl");

        System.out.println("Name >> " + animeInfo.getAnimeName());
        System.out.println("Time >> " + animeInfo.getAnimeTime());
        animeInfo.getAnimeKNCW();


    }

}
