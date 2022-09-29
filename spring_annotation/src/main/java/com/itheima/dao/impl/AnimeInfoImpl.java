package com.itheima.dao.impl;

import com.itheima.dao.AnimeInfo;
import com.itheima.dao.AnimeName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.dao.impl
 * CreateTime==>2022-09-28 09:50:01
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@Scope("")
@Component
public class AnimeInfoImpl implements AnimeInfo {



    @Autowired
    @Qualifier("animeNameYY")
    private AnimeName animeNameYYYY;

    @Value("2022")
    private Integer releaseTime;

    @Override
    public void sayHello() {
        System.out.println("hello,锦木千束&安济知佳...^_^"+releaseTime);
        animeNameYYYY.getName().forEach(System.out::println);
    }

    @PostConstruct
    public void init(){
        System.out.println("init ... ");

    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy ...");

    }


}
