package com.rao.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.rao.customer.tool.JudgeElement;
import com.rao.customer.tool.SetValue;
import com.rao.customer.tool.WebDriverTool;

// 审核登记界面
public class Audit {
	public void PageRun() throws Exception {
		WebDriver webDriver = WebDriverTool.webDriver;
		JudgeElement judge = new JudgeElement();
		
		// 点击进入设备登记界面
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[3]")).click();
		Thread.sleep(500);
		
		// 搜索客户姓名
		webDriver.findElement(By.cssSelector("input[placeholder='搜索客户姓名']")).sendKeys("大哲");
		Thread.sleep(500);
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[2]/form/div[2]/div/button")).click();
		Thread.sleep(500);
		
		// 刷新
		webDriver.navigate().refresh();
		Thread.sleep(1000);
		
		// 点击审核
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[3]/div/table/tr[2]/td[8]/div/button")).click();
		Thread.sleep(500);
		
		String hts = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[6]/div/div[2]/div[2]/img";
		String cqzs = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[7]/div/div[2]/div[2]/img";
		String fd = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[9]/div[3]/div[3]/i";
		String sx = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[9]/div[3]/div[1]/i";
		String xz = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[9]/div[3]/div[5]/i";
		String gb = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[9]/div[4]/i";
		
		// 判断是否审核
		// 未审核
		if (judge.ElementExist(webDriver, By.xpath("//span[contains(., '通 过')]")) == true) {
			// 判断合同书是否有图片
			if (judge.ElementExist(webDriver, By.xpath(hts)) == true ) {
				// 点击图片
				webDriver.findElement(By.xpath(hts)).click();
				Thread.sleep(500);
				// 放大图片
				webDriver.findElement(By.xpath(fd)).click();
				Thread.sleep(500);
				// 缩小图片
				webDriver.findElement(By.xpath(sx)).click();
				Thread.sleep(500);
				// 旋转图片
				webDriver.findElement(By.xpath(xz)).click();
				Thread.sleep(500);
				// 关闭图片
				webDriver.findElement(By.xpath(gb)).click();
				Thread.sleep(500);
				
			}
			// 判断产权证书是否有图片
			if (judge.ElementExist(webDriver, By.xpath(cqzs)) == true) {
				// 点击图片
				webDriver.findElement(By.xpath(cqzs)).click();
				Thread.sleep(500);
				// 放大图片
				webDriver.findElement(By.xpath(fd)).click();
				Thread.sleep(500);
				// 缩小图片
				webDriver.findElement(By.xpath(sx)).click();
				Thread.sleep(500);
				// 旋转图片
				webDriver.findElement(By.xpath(xz)).click();
				Thread.sleep(500);
				// 关闭图片
				webDriver.findElement(By.xpath(gb)).click();
				Thread.sleep(500);
			}
			
			// 点击审核
			webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[3]/span/button[2]")).click();
			// 点击驳回
//			webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[3]/span/button[1]")).click();
			
		// 审核通过	
		}else if(judge.ElementExist(webDriver, By.xpath("//span[contains(., '关 闭')]")) == true){
			// 判断合同书是否有图片
			if (judge.ElementExist(webDriver, By.xpath(hts)) == true ) {
				// 点击图片
				webDriver.findElement(By.xpath(hts)).click();
				Thread.sleep(500);
				// 放大图片
				webDriver.findElement(By.xpath(fd)).click();
				Thread.sleep(500);
				// 缩小图片
				webDriver.findElement(By.xpath(sx)).click();
				Thread.sleep(500);
				// 旋转图片
				webDriver.findElement(By.xpath(xz)).click();
				Thread.sleep(500);
				// 关闭图片
				webDriver.findElement(By.xpath(gb)).click();
				Thread.sleep(500);
			}
			// 判断产权证书是否有图片
			if (judge.ElementExist(webDriver, By.xpath(cqzs)) == true) {
				// 点击图片
				webDriver.findElement(By.xpath(cqzs)).click();
				Thread.sleep(500);
				// 放大图片
				webDriver.findElement(By.xpath(fd)).click();
				Thread.sleep(500);
				// 缩小图片
				webDriver.findElement(By.xpath(sx)).click();
				Thread.sleep(500);
				// 旋转图片
				webDriver.findElement(By.xpath(xz)).click();
				Thread.sleep(500);
				// 关闭图片
				webDriver.findElement(By.xpath(gb)).click();
				Thread.sleep(500);
			}
			
			// 点击关闭
			webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[3]/span/button")).click();
			Thread.sleep(500);
		}
		
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
