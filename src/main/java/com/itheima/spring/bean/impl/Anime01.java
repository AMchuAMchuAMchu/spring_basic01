package com.itheima.spring.bean.impl;

import com.itheima.spring.bean.Anime;
import com.itheima.spring.bean.AnimeTime;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.spring.bean.impl
 * CreateTime==>2022-09-23 18:34:48
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class Anime01 implements Anime {

    private AnimeTime animeTime;

    @Override
    public void printAnimeName() {
        System.out.println(" >> 国王排名...");
        animeTime.getAnimeTime();
    }

    public AnimeTime getAnimeTime() {
        return animeTime;
    }

    public void setAnimeTime(AnimeTime animeTime) {
        this.animeTime = animeTime;
    }
}
