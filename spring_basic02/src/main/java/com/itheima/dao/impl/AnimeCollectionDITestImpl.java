package com.itheima.dao.impl;

import com.itheima.dao.AnimeCollectionDITest;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.dao.impl
 * CreateTime==>2022-09-26 14:40:14
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnimeCollectionDITestImpl implements AnimeCollectionDITest {

    private List<String> list;

    private Set<String> set;

    private Map<String,String> map;

    private Properties properties;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void getList() {
        list.forEach(System.out::println);
    }

    @Override
    public void getSet() {
        set.forEach(System.out::println);
    }

    @Override
    public void getMap() {
        map.forEach((k,v)->{
            System.out.println("k:"+k+"  v:"+v);
        });
    }

    @Override
    public void getProperties() {
        properties.forEach((k,v)->{
            System.out.println("k:"+k+"  v:"+v);
        });
    }
}
