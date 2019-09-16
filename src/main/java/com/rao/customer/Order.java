package com.rao.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.customer.tool.PageTool;
import com.rao.customer.tool.WebDriverTool;

// 设备订单界面
public class Order {
	public void PageRun() throws Exception {
		WebDriver webDriver = WebDriverTool.webDriver;
		PageTool pageTool = new PageTool();
		
		// 点击进入设备订单界面
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[4]")).click();
		Thread.sleep(500);
		
		// 搜索客户姓名/基地名称
		webDriver.findElement(By.cssSelector("input[placeholder='搜索客户姓名/基地名称']")).sendKeys("企业名称");
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[3]/div/button")).click();
		Thread.sleep(500);
		
		// 选择订单状态
		webDriver.findElement(By.cssSelector("input[placeholder='选择订单状态']")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("/html/body/div/div[1]/div[1]/ul/li[2]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[3]/div/button")).click();
		Thread.sleep(500);
		
		// 刷新
		webDriver.navigate().refresh();
		Thread.sleep(1000);
		
		// 点击详情
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[3]/div/table/tr[2]/td[8]/div/button")).click();
		Thread.sleep(1500);
		
		// 点击关闭
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[3]/span/button")).click();
		Thread.sleep(500);
		
		// 分页操作
		pageTool.PaginationTool();
	}
}
