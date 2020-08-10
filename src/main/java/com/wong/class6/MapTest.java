package com.wong.class6;

import com.wong.logger.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wong
 * @date Created in 2020/7/24 20:47
 * @Description: 数据类型Map学习
 * @Version 1.0
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("病态", 1);
        scoreMap.put("蜗牛", 52);
        scoreMap.put("roy", 60);
        Log.log.info(scoreMap);
    }
}


