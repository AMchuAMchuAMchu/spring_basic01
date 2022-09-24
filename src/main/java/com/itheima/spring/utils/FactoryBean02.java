package com.itheima.spring.utils;

import com.itheima.spring.impl.AnimeKNCWImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.spring.utils
 * CreateTime==>2022-09-24 18:55:42
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class FactoryBean02 implements FactoryBean<AnimeKNCWImpl> {
    @Override
    public AnimeKNCWImpl getObject() throws Exception {
        System.out.println("FactoryBean02");
        return new AnimeKNCWImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return AnimeKNCWImpl.class;
    }
}
