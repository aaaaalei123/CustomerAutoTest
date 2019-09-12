package com.rao.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.customer.tool.WebDriverTool;

public class Customer {
	public void PageRun() throws Exception {
		WebDriver webDriver = WebDriverTool.webDriver;
		
		// 点击进入设备订单界面
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[5]")).click();
		Thread.sleep(500);
		
		// 输入客户姓名并搜索
		webDriver.findElement(By.cssSelector("input[placeholder='搜索客户姓名/基地名称']")).sendKeys("昆明集团一号");
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[5]/div/button")).click();
		Thread.sleep(1500);
		
		// 刷新
		webDriver.navigate().refresh();
		Thread.sleep(1000);
		
		// 选择客户类型并搜索
		webDriver.findElement(By.cssSelector("input[placeholder='选择客户类型']")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("/html/body/div/div[1]/div[1]/ul/li[2]")).click();
		Thread.sleep(500);
		
		// 选择区域负责人并搜索
		webDriver.findElement(By.cssSelector("input[placeholder='选择区域负责人']")).click();
		Thread.sleep(500);		
		webDriver.findElement(By.xpath("/html/body/div/div[1]/div[1]/ul/li[7]")).click();
		Thread.sleep(500);
		
		// 选择区域负责人并搜索
		webDriver.findElement(By.cssSelector("input[placeholder='选择客户状态']")).click();
		Thread.sleep(500);		
		webDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[3]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[5]/div/button")).click();
		Thread.sleep(1500);
		
		// 刷新
		webDriver.navigate().refresh();
		Thread.sleep(1000);
		
		// 点击详情
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[3]/div/table/tr[2]/td[8]/div/button")).click();
		Thread.sleep(1000);
		
		
	} 
}
