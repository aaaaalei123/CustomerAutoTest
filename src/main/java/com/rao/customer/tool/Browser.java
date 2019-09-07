package com.rao.customer.tool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Browser {
	public void OpenBrowser() throws Exception {
		Thread.sleep(3000);   //等待3秒
		System.setProperty("webdriver.chrome.driver","D:/JOBSoftware/chromedriver_win32/chromedriver.exe");   // 谷歌:后边路径修改为谷歌驱动路径
		
		// 引用 OpenChrome 打开浏览器
		WebDriver webDriver = WebDriverTool.webDriver;
		webDriver.manage().window().maximize();  //浏览器最大化
		webDriver.manage().deleteAllCookies();   //删除所有缓存
		
		// 与浏览器同步非常重要，必须等待浏览器加载完成
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// 打开目标地址
		webDriver.get("http://testorchdbs.yufengtek.com/#/login");
		Thread.sleep(1000);
	}
}
