package com.binbinxiu.aihushop.service.impl;

import com.binbinxiu.aihushop.service.WeatherInterface;
import lombok.extern.slf4j.Slf4j;

import javax.jws.WebService;

/**
 * 获取天气实现类
 *
 * @author binbin
 * @date 2022/1/14 21:08
 */
@Slf4j
@WebService
public class WeatherInterfaceImpl implements WeatherInterface {
    @Override
    public String queryWeather(String cityName) {
        log.info("获取城市名：{}",cityName);
        String weather = "晴天";
        return weather;
    }
}
