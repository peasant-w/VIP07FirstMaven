package com.wong.class8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wong.logger.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wong
 * @date Created in 2020/7/29 20:14
 * @Description: json解析学习
 * @Version 1.0
 */
public class IPJsonTest {
    public static void main(String[] args) {
        String ipJson = "{\"status\":\"0\",\"t\":\"1596024963222\",\"set_cache_time\":\"\",\"data\":[{\"location\":\"泛播 Cloudflare\",\"titlecont\":\"IP地址查询\",\"origip\":\"1.1.1.1\",\"origipquery\":\"1.1.1.1\",\"showlamp\":\"1\",\"showLikeShare\":1,\"shareImage\":1,\"ExtendedLocation\":\"\",\"OriginQuery\":\"1.1.1.1\",\"tplt\":\"ip\",\"resourceid\":\"6006\",\"fetchkey\":\"1.1.1.1\",\"appinfo\":\"\",\"role_id\":0,\"disp_type\":0}]}";
        Log.log.info("原始数据：" + ipJson);
        JSONObject jsonData = JSON.parseObject(ipJson);
        Log.log.info("json解析后：" + jsonData);
        Map<String, String> jsonMap = new HashMap<>();
        for (String key : jsonData.keySet()) {
            jsonMap.put(key, jsonData.get(key).toString());
        }
        Log.log.info("转换成map后：" + jsonMap);
        Log.log.info("取出data的值：" + jsonMap.get("data"));
        String dataJson = jsonMap.get("data");
        String jsonD = dataJson.substring(1, dataJson.length() - 1);
        Log.log.info("截取标准json字符串后：" + jsonD);
        JSONObject jsonDa = JSONObject.parseObject(jsonD);
        Map<String, String> dataMap = new HashMap<>();
        for (String dkey :jsonDa.keySet()) {
            dataMap.put(dkey,jsonDa.get(dkey).toString());
        }
        Log.log.info("把data里的值存到map后："+dataMap);
    }
}
