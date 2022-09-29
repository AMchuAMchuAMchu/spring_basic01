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
 * CreateTime ==> 2022-09-29 09:33:10
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Repository("animeNameYY")
public class AnimeNameImpl02 implements AnimeName {
    @Override
    public List<String> getName() {
        ArrayList<String> animeList02 = new ArrayList<>();
        animeList02.add("魔女之旅");
        animeList02.add("伊蕾娜本渡枫");
        animeList02.add("沙耶黑泽朋世");
        return animeList02;
    }
}
