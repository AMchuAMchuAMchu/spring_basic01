package com.itheima.spring.impl;

import com.itheima.spring.dao.AnimePrintInfo;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.spring.impl
 * CreateTime==>2022-09-24 19:31:56
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnimePrintInfoImpl implements AnimePrintInfo {

    private String animeName;
    private int releaseTime;

    public void setAnimeName(String animeName) {

        this.animeName = animeName;
    }

    public void setReleaseTime(int releaseTime) {
        this.releaseTime = releaseTime;
    }




    @Override
    public void printInfo() {
        System.out.println("animeName:"+animeName+"time:"+releaseTime);
    }
}
