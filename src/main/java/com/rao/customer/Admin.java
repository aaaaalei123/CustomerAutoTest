package com.rao.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.customer.tool.JudgeElement;
import com.rao.customer.tool.PageTool;
import com.rao.customer.tool.WebDriverTool;

// 管理员管理界面
public class Admin {
	public void PageRun() throws Exception {
		WebDriver webDriver = WebDriverTool.webDriver;
		PageTool pageTool = new PageTool();
		JudgeElement judge = new JudgeElement();
		
		// 进入管理员管理界面
/*		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[6]/div")).click();
		Thread.sleep(500);*/
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[6]/ul/li[2]")).click();
		Thread.sleep(1000);
		
		// 条件搜索
		webDriver.findElement(By.cssSelector("input[placeholder='搜索管理员姓名/手机号']")).sendKeys("Max");
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("input[placeholder='选择管理员状态']")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("/html/body/div/div[1]/div[1]/ul/li[2]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[3]/div/button[1]")).click();
		Thread.sleep(500);
		
		// 刷新页面
		webDriver.findElement(By.cssSelector("i[title='刷新页面']")).click();
		Thread.sleep(1000);
		
		// 添加管理员
/*		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[3]/div/button[2]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("input[placeholder='请输入管理员姓名']")).sendKeys("廖某人");
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("input[placeholder='请输入管理员联系号码']")).sendKeys("15970771077");
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("input[placeholder='请选择管理员身份']")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("input[placeholder='请输入登录密码']")).sendKeys("qwer123");
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("input[placeholder='请再次输入登录密码']")).sendKeys("qwer123");
		Thread.sleep(500);
		// 提交
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[6]/div/div[3]/span/button[2]")).click();
		Thread.sleep(500);
		// 取消
//		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[6]/div/div[3]/span/button[1]")).click();
//		Thread.sleep(500);
		
		*/
		
		// 点击详情
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[3]/div/table/tr[2]/td[7]/div/button")).click();
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
