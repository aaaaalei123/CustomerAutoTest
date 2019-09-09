package com.rao.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.customer.tool.WebDriverTool;

// 审核登记界面
public class Audit {
	public void PageRun() {
		WebDriver webDriver = WebDriverTool.webDriver;
		
		// 点击进入设备登记界面
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[3]")).click();
		
		
	}
}
