package com.itheima;

import com.itheima.cfg.SpringConfig;
import com.itheima.dao.impl.AnimeInfoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

//    @Test
//    public void testAnnotationCfg(){
//
//        AnimeInfoImpl bean = ac.getBean(AnimeInfoImpl.class);
//
//        bean.sayHello();
//
//
//    }


    public static void main(String[] args) {
        AnimeInfoImpl bean = ac.getBean(AnimeInfoImpl.class);
        bean.sayHello();
    }


}
