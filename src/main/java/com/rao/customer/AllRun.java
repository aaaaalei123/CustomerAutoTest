package com.rao.customer;

import org.openqa.selenium.WebDriver;

import com.rao.customer.tool.Browser;
import com.rao.customer.tool.WebDriverTool;

public class AllRun {
	public static void main(String[] args) throws Exception {
		Browser browser = new Browser();
		Login login = new Login();
		
		// 打开浏览器
		browser.OpenBrowser();
		WebDriver webDriver = WebDriverTool.webDriver;
		
		login.PageRun();
		
}
}
