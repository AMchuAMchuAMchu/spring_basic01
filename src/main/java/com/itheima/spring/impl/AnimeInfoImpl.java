package com.itheima.spring.impl;

import com.itheima.spring.dao.AnimeInfo;
import com.itheima.spring.dao.AnimeKNCW;
import com.itheima.spring.dao.AnimeName;
import com.itheima.spring.dao.AnimeTime;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.spring.impl
 * CreateTime==>2022-09-24 16:41:20
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnimeInfoImpl implements AnimeInfo {

    private AnimeName animeName;

    private AnimeTime animeTime;

    private AnimeKNCW animeKNCW;

    public void setAnimeName(AnimeName animeName) {
        this.animeName = animeName;
    }

    public void setAnimeTime(AnimeTime animeTime) {
        this.animeTime = animeTime;
    }

    public void setAnimeKNCW(AnimeKNCW animeKNCW) {
        this.animeKNCW = animeKNCW;
    }

    @Override
    public String getAnimeName() {
        return animeName.getAnimeName();
    }

    @Override
    public Integer getAnimeTime() {
        return animeTime.getAnimeTime();
    }

    @Override
    public void getAnimeKNCW() {
        animeKNCW.sayHello();
    }
}
