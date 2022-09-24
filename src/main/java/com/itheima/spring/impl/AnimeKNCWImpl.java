package com.itheima.spring.impl;

import com.itheima.spring.dao.AnimeKNCW;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.spring.impl
 * CreateTime==>2022-09-24 16:33:32
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnimeKNCWImpl implements AnimeKNCW, InitializingBean, DisposableBean {


//
//    public void destroy(){
//        System.out.println("destroy...");
//    }
//
//    public void init(){
//        System.out.println("init...");
//    }

    @Override
    public void sayHello() {
        System.out.println("哦哈呦~~阔你吃哇...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("AnimeKNCWImpl destroy ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AnimeKNCWImpl initial ....");
    }
}
