package com.rao.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rao.customer.tool.WebDriverTool;

// 登录界面
public class Login {
	public void PageRun() throws Exception {
		WebDriver webDriver = WebDriverTool.webDriver;
		
		// 登录
		webDriver.findElement(By.cssSelector("input[placeholder='用户名']")).sendKeys("");
		Thread.sleep(1000);
	    webDriver.findElement(By.cssSelector("input[placeholder='密码']")).sendKeys("");
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/div[3]")).click();
	    Thread.sleep(2000);
/*	    ChromeOptions co = new ChromeOptions();
	    co.setExperimentalOption("web", webDriver);
	    webDriver.findElement(By.id("iconfont"));*/
	    
	}
}
