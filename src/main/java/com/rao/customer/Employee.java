package com.rao.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.customer.tool.WebDriverTool;

// 员工管理界面 
public class Employee {
	public void PageRun() throws Exception {
		WebDriver webDriver = WebDriverTool.webDriver;
		
		// 进入员工管理界面
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[6]/div")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[6]/ul/li[1]")).click();
		Thread.sleep(1000);
		
		// 条件查询
		webDriver.findElement(By.cssSelector("input[placeholder='搜索员工姓名/手机号']")).sendKeys("大磊");
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[4]/div/button[1]")).click();
		Thread.sleep(500);
	}
}
