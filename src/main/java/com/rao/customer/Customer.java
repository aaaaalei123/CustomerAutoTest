package com.rao.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.customer.tool.JudgeElement;
import com.rao.customer.tool.PageTool;
import com.rao.customer.tool.WebDriverTool;

// 资料管理界面 
public class Customer {
	public void PageRun() throws Exception {
		WebDriver webDriver = WebDriverTool.webDriver;
		JudgeElement judge = new JudgeElement();
		PageTool pageTool = new PageTool();
		
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
		webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[3]/div/table/tr[3]/td[8]/div/button")).click();
		Thread.sleep(1000);				
		
		/**
		 * jdtj = 基地图集
		 * hts = 合同书图片
		 * cqzs = 产权证书图片
		 * fd = 放大按钮
		 * sx = 缩小按钮
		 * xz = 旋转按钮
		 * gb = 关闭按钮
		 * */
		String jdtj = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[6]/div/div[2]/div[2]/img";
		String hts = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[6]/div/div[4]/div[2]/img";
		String cqzs = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[7]/div/div[2]/div[2]/img";
		String fd = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[9]/div[3]/div[3]/i";
		String sx = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[9]/div[3]/div[1]/i";
		String xz = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[9]/div[3]/div[5]/i";
		String gb = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[9]/div[4]/i";
		
		// 判断基地图集是否有图片
		if (judge.verifyElementIsPresent("//div[contains(., '基地图集：')]/div/div/div/img", "xpath") == true ) {
			// 点击图片
			webDriver.findElement(By.xpath(jdtj)).click();
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
		// 判断合同书是否有图片
		if (judge.verifyElementIsPresent("//div[contains(., '合同书：')]/div/div/div/img", "xpath") == true ) {
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
		if (judge.verifyElementIsPresent("//div[contains(., '产权证书：')]/div/div/div/img", "xpath") == true) {
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
		Thread.sleep(1000);
		
		// 分页操作
		String q = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[4]/ul/li[2]";
		if (judge.ElementExist(webDriver, By.xpath(q)) == true) {
			pageTool.PaginationTool();
		}
	} 
}
