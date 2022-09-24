package com.itheima.spring.utils;

import com.itheima.spring.impl.AnimeKNCWImpl;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.spring.utils
 * CreateTime==>2022-09-24 18:07:38
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class FactoryCreateBean {

    public AnimeKNCWImpl getAnimeKNCWImplBean(){
        System.out.println("getAnimeKNCWImplBean ... not static method ...");
        return new AnimeKNCWImpl();
    }

    public static AnimeKNCWImpl getAnimeKNCWBean(){
        System.out.println("getAnimeKNCWBean starting exe n tasks...");
        System.out.println("getAnimeKNCWBean starting exe n tasks...");
        System.out.println("getAnimeKNCWBean starting exe n tasks...");
        return new AnimeKNCWImpl();
    }

}
