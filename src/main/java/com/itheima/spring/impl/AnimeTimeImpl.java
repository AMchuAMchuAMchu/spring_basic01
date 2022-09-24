package com.itheima.spring.impl;

import com.itheima.spring.dao.AnimeKNCW;
import com.itheima.spring.dao.AnimeName;
import com.itheima.spring.dao.AnimeTime;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.spring.impl
 * CreateTime==>2022-09-24 16:33:05
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnimeTimeImpl implements AnimeTime {


//
//    private AnimeTimeImpl(){
//        System.out.println("private AnimeTimeImpl ....start running ....");
//    }

    @Override
    public Integer getAnimeTime() {
        return 2022;
    }
}
