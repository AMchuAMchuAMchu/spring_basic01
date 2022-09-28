package com.itheima.dao.impl;

import com.itheima.dao.AnimeTime;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.dao.impl
 * CreateTime==>2022-09-26 14:15:12
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnimeTimeImpl implements AnimeTime {
    @Override
    public void getAnimeTime() {
        AnimeInfoImpl animeInfo = new AnimeInfoImpl();
        animeInfo.test(9);
        System.out.println(">> 2022 >>");
    }
}
