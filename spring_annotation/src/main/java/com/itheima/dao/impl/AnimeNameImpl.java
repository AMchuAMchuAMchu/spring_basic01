package com.itheima.dao.impl;

import com.itheima.dao.AnimeName;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic01
 * BelongsPackage ==> com.itheima.dao.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-09-29 08:26:31
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Repository("animeName")
public class AnimeNameImpl implements AnimeName {
    @Override
    public List<String> getName() {
        ArrayList<String> animeList = new ArrayList<>();
        animeList.add("来自深渊");
        animeList.add("租借女友");
        animeList.add("宫岛礼吏");
        return animeList;
    }
}
