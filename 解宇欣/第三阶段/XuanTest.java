package testCase;


import org.testng.annotations.Test;

import base.BaseDriver;
import pages.Xuan;

public class XuanTest extends BaseDriver{
	
	Xuan xuantest;
	
	// 1.用户离线，检验点击邮件图标能便捷发送邮件
	@Test(priority = 1)
	public void testOffLineMail() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.OffLineMail();
	}
	
	// 2.用户在线，检验点击邮件图标能便捷发送邮件
	@Test(priority = 2)
	public void testOnLineMail() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.OnLineMail();
	}
	
	// 3.登陆'admin',查看联系人状态
	@Test(priority = 3)
	public void testOnLineUser() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.OnLineUser();
	}
	
	// 4.不登陆'admin',查看联系人状态
	@Test(priority = 4)
	public void testOffLineUser() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.OffLineUser();
	}
	
	// 5.显示'解宇欣'的原始信息
	@Test(priority = 5)
	public void testOriginalMessage() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.OriginalMessage();
	}
	// 6.显示'解宇欣'的改后信息
	@Test(priority = 6)
	public void testChangeMessage() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.ChangeMessage();
	}
	
	// 7.收藏联系人
	@Test(priority = 7)
	public void testCollectUser1() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.CollectUser1();
	}
	
	// 8.取消收藏联系人
	@Test(priority = 8)
	public void testCollectUser2() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.CollectUser2();
	}
	
	// 9.查看联系人资料
	@Test(priority = 9)
	public void testMoreMessage() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.MoreMessage();
	}
	
	// 10.查看联系人排序
	@Test(priority = 10)
	public void testCheckOrder() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.CheckOrder();
	}
	
	// 11.发送消息
	@Test(priority = 11)
	public void testSendMessage() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.SendMessage();
	}
	
	// 12.查看资料
	@Test(priority = 12)
	public void testCheckMyInformation() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.CheckMyInformation();
	}
	
	// 13.查看喧喧官网
	@Test(priority = 13)
	public void testCheckWebsite() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.CheckWebsite();
	}
	
	// 14.查看隐私条款
	@Test(priority = 14)
	public void testCheckArticle() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.CheckArticle();
	}
	
	// 15.关闭提示框
	@Test(priority = 15)
	public void testCheckClose() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.CheckClose();
	}
	
	// 16.取消注销
	@Test(priority = 16)
	public void testCancelLogout() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.CancelLogout();
	}
	
	// 17.不清除账号信息并注销
	@Test(priority = 17)
	public void testLogout1() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.Logout1();
	}
	
	// 18.清除账号信息并注销
	@Test(priority = 18)
	public void testLogout2() throws InterruptedException {
		xuantest=new Xuan(driver);
		xuantest.Logout2();
	}
	
	// 19.注销后重新登录
	@Test(priority = 19)
	public void testReLogin1() throws InterruptedException {
		xuantest=new Xuan(driver);
		//xuantest.ReLogin1("10.7.90.225","loona","123456");
	}
	
	// 20.注销后更换账号登录
	@Test(priority = 20)
	public void testcReLogin2() throws InterruptedException {
		xuantest=new Xuan(driver);
		//xuantest.ReLogin2("10.7.90.225","admin","123456");
	}
	
}
