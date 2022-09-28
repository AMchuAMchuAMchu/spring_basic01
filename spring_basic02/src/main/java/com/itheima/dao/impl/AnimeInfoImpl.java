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
    
    
    
   
    /**
    * Description ==> TODO
    * Return ==> java.lang.String
    * Param ==> [id]
    * Date ==> 2022/9/28 15:51
    * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
    */
    public String test(Integer id){
        return "Lycoris Recoil";
        
    }

    /**
    * Description ==> TODO
    * Return ==> 
    * Param ==> []
    * Date ==> 2022/9/28 15:54 
    * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
    */
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
