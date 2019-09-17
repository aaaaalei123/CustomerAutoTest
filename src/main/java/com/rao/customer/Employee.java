package com.rao.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.customer.tool.JudgeElement;
import com.rao.customer.tool.PageTool;
import com.rao.customer.tool.WebDriverTool;

// 员工管理界面 
public class Employee {
	public void PageRun() throws Exception {
		WebDriver webDriver = WebDriverTool.webDriver;
		PageTool pageTool = new PageTool();
		JudgeElement judge = new JudgeElement();
		
		// 进入员工管理界面
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[6]/div")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[6]/ul/li[1]")).click();
		Thread.sleep(1000);
		
		// 条件查询
		webDriver.findElement(By.cssSelector("input[placeholder='搜索员工姓名/手机号']")).sendKeys("大磊");
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[2]/div/div/div/input")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("/html/body/div/div[1]/div[1]/ul/li[2]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[4]/div/button[1]")).click();
		Thread.sleep(500);
		
		// 刷新页面
		webDriver.findElement(By.cssSelector("i[title='刷新页面']")).click();
		Thread.sleep(1000);
		
		
		// 添加员工
/*		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[4]/div/button[2]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("input[placeholder='请输入员工姓名']")).sendKeys("Qaz");
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("input[placeholder='请输入员工联系号码']")).sendKeys("15570774525");
		Thread.sleep(500);
		webDriver.findElement(By.cssSelector("input[placeholder='选择员工负责区域']")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[2]")).click();
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[6]/div/div[1]")).click();
		Thread.sleep(500);
		// 点击取消
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[6]/div/div[3]/span/button[1]")).click();
		Thread.sleep(500);
		// 点击提交
		//webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[6]/div/div[3]/span/button[2]")).click();
		//Thread.sleep(1000);
*/		
		
		// 详情
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
