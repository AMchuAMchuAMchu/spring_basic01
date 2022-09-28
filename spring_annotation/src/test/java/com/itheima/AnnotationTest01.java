package com.itheima;

import com.itheima.cfg.SpringConfig;
import com.itheima.dao.impl.AnimeInfoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima
 * CreateTime==>2022-09-28 09:53:29
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnnotationTest01 {

    public ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("bark/spring.xml.bark");

    public static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);


    public static void main(String[] args) {


        AnimeInfoImpl animeInfoImpl = ac.getBean("animeInfoImpl", AnimeInfoImpl.class);

        animeInfoImpl.sayHello();

    }



//    @Test
//    public void testAnnotation(){
//
//        AnimeInfoImpl animeInfoImpl = cpx.getBean("animeInfoImpl", AnimeInfoImpl.class);
//        animeInfoImpl.sayHello();
//
//
//    }



}
