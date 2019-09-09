package com.rao.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.rao.customer.tool.WebDriverTool;

public class Home {
	public void PageRun() throws Exception{
		WebDriver webDriver = WebDriverTool.webDriver;
		Actions actions = new Actions(webDriver);
		
		// 标题栏
		Thread.sleep(1000);
		webDriver.findElement(By.cssSelector("i[title='刷新页面']")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.cssSelector("i[title='切换全屏']")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.cssSelector("i[title='切换全屏']")).click();
		Thread.sleep(1000);
		
		// 快捷方式
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div/div/div[2]/div[1]/div/div")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[2]")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[2]")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div/div/div[2]/div[3]/div/div")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[2]")).click();
		Thread.sleep(1000);
		
		// 客户增长曲线
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 395, 697).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 562, 697).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 736, 697).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 906, 697).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1071, 697).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1240, 697).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1408, 836).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1581, 729).perform();
		Thread.sleep(700);
		actions.moveToElement(webDriver.findElement(By.xpath("//*[@id='app']")), 1745, 626).perform();
		Thread.sleep(700);
	}
}
