package com.binbinxiu.aihushop.service;



import com.binbinxiu.aihushop.service.impl.WeatherInterfaceImpl;

import javax.xml.ws.Endpoint;

/**
 * 天气服务
 *
 * @author binbin
 * @date 2022/1/14 21:10
 */
public class WeatherWebService {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:12345/weather",new WeatherInterfaceImpl());
        System.out.println("服务发布成功");
    }
}
