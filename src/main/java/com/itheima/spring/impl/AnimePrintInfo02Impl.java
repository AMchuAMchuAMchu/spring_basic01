package com.itheima.spring.impl;

import com.itheima.spring.dao.AnimePrintInfo02;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.spring.impl
 * CreateTime==>2022-09-24 19:47:47
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnimePrintInfo02Impl implements AnimePrintInfo02 {

    private AnimeKNCWImpl animeKNCW;

    private String animeName;

    private Integer releaseTime;


    public AnimePrintInfo02Impl(AnimeKNCWImpl animeKNCW, String animeName, Integer releaseTime) {
        this.animeKNCW = animeKNCW;
        this.animeName = animeName;
        this.releaseTime = releaseTime;
    }

    @Override
    public void printInfo() {
        animeKNCW.sayHello();
        System.out.println("animeName:"+animeName+"||releaseTime:"+releaseTime);
    }
}
