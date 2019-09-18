package com.rao.customer;

import org.openqa.selenium.WebDriver;

import com.rao.customer.tool.Browser;
import com.rao.customer.tool.WebDriverTool;

public class AllRun {
	public static void main(String[] args) throws Exception {
		WebDriver webDriver = WebDriverTool.webDriver;
		Browser browser = new Browser();
		Login login = new Login();
		Home home = new Home();
		Audit audit = new Audit();
		Order order = new Order();
		Customer customer = new Customer();
		Employee employee = new Employee();
		Admin admin = new Admin();
		
		// 打开浏览器
		browser.OpenBrowser();
		
		// 登录
		login.PageRun();
		
		// 首页
/*		home.PageRun();
		
		// 审核登记
		audit.PageRun();
		
		// 设备订单
		order.PageRun();
		
		// 资料管理
		customer.PageRun();
		
		// 员工管理
		employee.PageRun();
		
		// 管理员管理
		admin.PageRun();*/
		
		Thread.sleep(2000);
//		webDriver.quit();
	}
}
