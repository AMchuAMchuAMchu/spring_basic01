package com.itheima.test;

import com.itheima.dao.impl.AnimeInfoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description==>TODO
 * BelongsProject==>spring_basic01
 * BelongsPackage==>com.itheima.test
 * CreateTime==>2022-09-26 14:25:02
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnimeInfoTest01 {
    public ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring" +
            ".xml");


    @Test
    public void testAutowired() {
        AnimeInfoImpl bean = cpx.getBean(AnimeInfoImpl.class);

        bean.printAnimeInfo();

    }
}
