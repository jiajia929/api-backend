package com.example.apiinterface.controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/day")
public class DayController {
    @PostMapping("/history")
    public String getHistory(){
        HttpResponse response = HttpRequest.post("https://tenapi.cn/v2/history")
                .execute();
        return response.body();
    }

    @GetMapping("/weather")
    public String getWeather(@RequestParam String msg) {
        HttpResponse response = HttpRequest.get("http://api.xn--7gqa009h.top/api/tianqi")
                .form("msg", msg)
                .execute();
        return response.body();
    }
}
