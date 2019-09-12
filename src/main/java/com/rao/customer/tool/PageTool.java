package com.rao.customer.tool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageTool {
	public void PaginationTool() throws Exception {
		WebDriver webDriver = WebDriverTool.webDriver;
		
		// 分页操作
		// 点击第二页
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[4]/ul/li[2]")).click();
		Thread.sleep(500);
		// 点击上一页
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[4]/button[1]")).click();
		Thread.sleep(500);
		// 点击下一页
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[4]/button[2]")).click();		
		Thread.sleep(500);
		// 输入并前往第一页
		SetValue.setElementValue(webDriver.findElement(By.cssSelector("input[type='number'][class='el-input__inner']")), "1");
		webDriver.findElement(By.cssSelector("input[type='number'][class='el-input__inner']")).sendKeys(Keys.chord(Keys.ENTER));
		Thread.sleep(500);
	}
}
