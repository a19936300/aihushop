package com.binbinxiu.aihushop;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * TODO
 *
 * @author binbin
 * @date 2021/12/18 15:49
 */
public class SeleniumTest {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        ChromeDriver chromeDriver = new ChromeDriver();
        try{
            chromeDriver.get("http://baidu.com");
        }finally {
            chromeDriver.quit();
        }
    }
}
