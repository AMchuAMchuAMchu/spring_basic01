package com.itheima.dao.impl;

import com.itheima.dao.AnimeInfo;
import com.itheima.dao.AnimeName;
import com.itheima.dao.AnimeTime;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.dao.impl
 * CreateTime==>2022-09-26 14:22:12
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnimeInfoImpl implements AnimeInfo {

    public AnimeInfoImpl() {
        System.out.println("AnimeInfoImpl constructor....");
    }

    private AnimeTime animeTime;

    private AnimeName animeName;

    public void setAnimeTime(AnimeTime animeTime) {
        this.animeTime = animeTime;
    }

    public void setAnimeName(AnimeName animeName) {
        this.animeName = animeName;
    }

    @Override
    public void printAnimeInfo() {
        animeName.getAnimeName();
        animeTime.getAnimeTime();
    }
}
