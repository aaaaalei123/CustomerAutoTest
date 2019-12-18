package com.rao.customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rao.customer.tool.JudgeElement;
import com.rao.customer.tool.PageTool;
import com.rao.customer.tool.WebDriverTool;

// 审核登记界面
public class Audit2 {
	public void PageRun() throws Exception {
		WebDriver webDriver = WebDriverTool.webDriver;
		JudgeElement judge = new JudgeElement();
		PageTool pageTool = new PageTool();
		
		// 点击进入设备登记界面
		webDriver.findElement(By.xpath("//*[@id='app']/section/aside/ul/li[3]")).click();
		Thread.sleep(1000);
		
		// 搜索客户姓名
		webDriver.findElement(By.cssSelector("input[placeholder='搜索客户姓名']")).sendKeys("大哲");
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='至'])[1]/following::span[1]")).click();
		Thread.sleep(1000);
		
		// 刷新
		webDriver.navigate().refresh();
		Thread.sleep(1000);

		
		/**
		 * hts = 合同书图片
		 * cqzs = 产权证书图片
		 * fd = 放大按钮
		 * sx = 缩小按钮
		 * xz = 旋转按钮
		 * gb = 关闭按钮
		 * */
		String hts = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[6]/div/div[2]/div[2]/img";
		String cqzs = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[7]/div/div[2]/div[2]/img";
		String fd = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[9]/div[3]/div[3]/i";
		String sx = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[9]/div[3]/div[1]/i";
		String xz = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[9]/div[3]/div[5]/i";
		String gb = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[2]/div[9]/div[4]/i";
		
		String xq = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[3]/div/table/tr[2]/td[8]/div/button/span[contains(., '详情')]";
		String sh = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[3]/div/table/tr[2]/td[8]/div/button/span[contains(., '审核')]";
		
		// 判断是否审核
		// 未审核
		if (judge.verifyElementIsPresent(xq, "xpath") == true) {
			System.out.println("是详情");
			webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[3]/div/table/tr[2]/td[8]/div/button")).click();
			Thread.sleep(1000);
			
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

		}else if(judge.verifyElementIsPresent(sh, "xpath") == true){
			System.out.println("是审核");
			webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[3]/div/table/tr[2]/td[8]/div/button")).click();
			Thread.sleep(1000);
			
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
			
			// 点击审核
			webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[3]/span/button[2]")).click();
			// 点击驳回
			//webDriver.findElement(By.xpath("//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[5]/div/div[3]/span/button[1]")).click();
			
		}

		Thread.sleep(1000);
		
		// 分页操作
		String q = "//*[@id='app']/section/div/div/div/div/div[1]/div/div/div[4]/ul/li[2]";
		if (judge.ElementExist(webDriver, By.xpath(q)) == true) {
			pageTool.PaginationTool();
		}

	}
}
