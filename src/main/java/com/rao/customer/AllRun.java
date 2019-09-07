package com.rao.customer;

import com.rao.customer.tool.Browser;


public class AllRun {
	public static void main(String[] args) throws Exception {
		Browser browser = new Browser();
		Login login = new Login();
		Home home = new Home();
		
		// 打开浏览器
		browser.OpenBrowser();
		
		// 登录
		login.PageRun();
		
		//首页
		home.PageRun();
	}
}
