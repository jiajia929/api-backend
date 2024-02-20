package com.example.apiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.json.JSONUtil;
import com.example.apiclientsdk.model.User;

import java.util.HashMap;
import java.util.Map;

import static com.example.apiclientsdk.utils.SignUtils.getSign;

/**
 * 公共的API-SDK，抽取ak,sk并且封装生成签名的过程
 */
public class ApiClient {

    protected final String accessKey;
    protected final String secretKey;

    protected static final String GATEWAY_HOST ="http://localhost:8090";

    public ApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    /**
     * 负责将数字签名的相关参数填入请求头中
     * @param body
     * @return
     */
    private Map<String,String> getHeaderMap(String body, String accessKey, String secretKey){
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("accessKey", accessKey);
        // 不能直接发送secretKey
        // hashMap.put("secretKey", secretKey);
        hashMap.put("nonce", RandomUtil.randomNumbers(4));
        hashMap.put("body", body);
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        hashMap.put("sign", getSign(body, secretKey));
        return hashMap;
    }

    /**
     * 获取用户名
     * @param user
     * @return
     */
    public String getUsername(User user){
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/name/user")
                .addHeaders(getHeaderMap(json, accessKey, secretKey))
                .body(json)
                .execute();
        String result =  httpResponse.body();
        return result;
    }

    /**
     * 获取随机动漫图片
     * @return
     */
    public String getRandomImageUrl(){
        return HttpRequest.post(GATEWAY_HOST + "/api/random/image")
                .addHeaders(getHeaderMap("",accessKey,secretKey))
                .execute().body();
    }

    /**
     * 获取随机文本
     * @return
     */
    public String getRandomWord(){
        return HttpRequest.get(GATEWAY_HOST + "/api/random/word")
                .addHeaders(getHeaderMap("",accessKey,secretKey))
                .execute().body();
    }

    /**
     * 历史上的今天
     * @return
     */
    public String getHistory(){
        return HttpRequest.post(GATEWAY_HOST + "/api/day/history")
                .addHeaders(getHeaderMap("",accessKey,secretKey))
                .execute().body();
    }

    /**
     * 今日天气
     * @return
     */
    public String getWeather(String msg){
        return HttpRequest.get(GATEWAY_HOST + "/api/day/weather")
                .form("msg", msg)
                .addHeaders(getHeaderMap("",accessKey,secretKey))
                .execute().body();
    }
}
