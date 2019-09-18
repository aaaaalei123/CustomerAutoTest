package com.rao.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.customer.tool.JudgeElement;
import com.rao.customer.tool.PageTool;
import com.rao.customer.tool.WebDriverTool;

public class Notice {
	public void PageRun() throws Exception {
		WebDriver webDriver = WebDriverTool.webDriver;
		PageTool pageTool = new PageTool();
		JudgeElement judge = new JudgeElement();
		
		// 进入系统通知界面
/*		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[6]/div")).click();
		Thread.sleep(500);*/
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[6]/ul/li[3]")).click();
		Thread.sleep(1000);
		
		// 条件查询
		webDriver.findElement(By.cssSelector("input[placeholder='选择通知类型']")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("/html/body/div/div[1]/div[1]/ul/li[3]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[3]/div/button[1]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("input[placeholder='选择通知状态']")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[3]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[3]/div/button[1]")).click();
		Thread.sleep(500);
		
		// 刷新页面
		webDriver.findElement(By.cssSelector("i[title='刷新页面']")).click();
		Thread.sleep(1000);
		
		// 发布通知
/*		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[3]/div/button[2]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("input[placeholder='请输入通知标题']")).sendKeys("通知通知");
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[6]/div/div[2]/form/div[2]/div/div/div[1]/input")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[1]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("input[placeholder='选择通知对象']")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[1]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("textarea[placeholder='请输入通知内容']")).sendKeys("全体成员，通知......");
		Thread.sleep(500);
		// 提交
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[6]/div/div[3]/span/button[2]")).click();
		Thread.sleep(500);
		// 取消
//		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[6]/div/div[3]/span/button[1]")).click();
//		Thread.sleep(500);
		
		*/
		
		// 点击详情
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[3]/div/table/tr[2]/td[6]/div/button")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[3]/span/button")).click();
		Thread.sleep(500);
		
		// 分页操作
		String q = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[4]/ul/li[2]";
		if (judge.ElementExist(webDriver, By.xpath(q)) == true) {
			pageTool.PaginationTool();
		}
	
	}
}
