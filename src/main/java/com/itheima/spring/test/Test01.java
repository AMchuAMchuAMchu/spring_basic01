package com.itheima.spring.test;

import com.itheima.spring.bean.impl.Anime01;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.spring.test
 * CreateTime==>2022-09-23 18:36:22
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class Test01 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Anime01 anime01 = (Anime01)cpac.getBean("Anime01");

        anime01.printAnimeName();

    }
}
