package com.itheima.dao.impl;

import com.itheima.dao.AnimeInfo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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
    @Override
    public void sayHello() {
        System.out.println("hello,锦木千束&安济知佳...^_^");
    }
}
