package com.pw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置动态刷新
 *  步骤： 1、@RefreshScope
 *        2、手动发送请求： curl -X POST http://localhost:8822/actuator/refresh
 *  这样带来的弊端是什么？
 *  引入消息总线
 *  1、动态刷新全局广播
 *  2、动态刷新定点通知
 *
 *
 * @auther zzyy
 * @create 2020-02-21 18:08
 */
@RestController
@RefreshScope
public class ConfigClientController
{
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo()
    {
        return configInfo;
    }
}
