package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class Xuan {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public Xuan(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

	// 联系人
	// 1.用户离线，检验点击邮件图标能便捷发送邮件
	public AndroidElement ContactPerson() {
		return driver.findElementByAccessibilityId("联系人\r\n" + 
				"联系人\r\n" + 
				"第 3 个标签，共 4 个");
	}

	public AndroidElement OffLinePerson() {
		return driver.findElementByAccessibilityId("A admin [离线]");
	}

	public AndroidElement OffLineMailbox() {
		return driver.findElementByAccessibilityId("Email akaxyx@163.com");
	}

	public void OffLineMail() throws InterruptedException {
		action.click(ContactPerson());
		action.click(OffLinePerson());
		action.click(OffLineMailbox());
		Thread.sleep(2000);
	}

	// 2.用户在线，检验点击邮件图标能便捷发送邮件
	public AndroidElement OnLinePerson() {
		return driver.findElementByAccessibilityId("解 解宇欣 [在线] ◇ 客服");
	}

	public AndroidElement OnLineMailbox() {
		return driver.findElementByAccessibilityId("Email akaxyx@163.com");
	}

	public void OnLineMail() throws InterruptedException {
		action.click(ContactPerson());
		action.click(OnLinePerson());
		action.click(OnLineMailbox());
		Thread.sleep(2000);
	}

	// 3.登陆'admin',查看联系人状态
	public void OnLineUser() throws InterruptedException {
		action.click(ContactPerson());
		Thread.sleep(2000);
	}

	// 4.不登陆'admin',查看联系人状态
	public void OffLineUser() throws InterruptedException {
		action.click(ContactPerson());
		Thread.sleep(2000);
	}

	// 5.显示'解宇欣'的原始信息
	public void OriginalMessage() throws InterruptedException {
		action.click(ContactPerson());
		action.click(OnLinePerson());
		Thread.sleep(2000);
	}

	// 6.显示'解宇欣'的改后信息
	public void ChangeMessage() throws InterruptedException {
		action.click(ContactPerson());
		action.click(OnLinePerson());
		Thread.sleep(2000);
	}

	// 7.收藏联系人
	public AndroidElement Star() {
		return driver.findElementByAccessibilityId("解宇欣 @xyx");
	}

	public void CollectUser1() throws InterruptedException {
		action.click(ContactPerson());
		action.click(OnLinePerson());
		action.click(Star());
		Thread.sleep(2000);
	}

	// 8.取消收藏联系人
	public void CollectUser2() throws InterruptedException {
		action.click(ContactPerson());
		action.click(OnLinePerson());
		action.click(Star());
		Thread.sleep(2000);
	}

	// 9.查看联系人资料
	public AndroidElement MoreMessage() {
		return driver.findElementByAccessibilityId("显示菜单");
	}

	public AndroidElement Information() {
		return driver.findElementByAccessibilityId("资料");
	}

	public void CheckInformation() throws InterruptedException {
		action.click(ContactPerson());
		action.click(OnLinePerson());
		action.click(MoreMessage());
		action.click(Information());
		Thread.sleep(2000);
	}

	// 10.查看联系人排序
	public void CheckOrder() throws InterruptedException {
		action.click(ContactPerson());
		Thread.sleep(2000);
	}

	// 11.发送消息
//	public AndroidElement Send() {
//		return driver.findElementByAccessibilityId("登录");
//	}
	public void SendMessage() throws InterruptedException {
		action.click(ContactPerson());
		action.click(OnLinePerson());
		Thread.sleep(2000);
	}

	// 我的
	// 12.查看资料
	public AndroidElement My() {
		return driver.findElementByAccessibilityId("我的\r\n" + 
				"我的\r\n" + 
				"第 4 个标签，共 4 个");
	}

	public AndroidElement MyInformation() {
		return driver.findElementByAccessibilityId("L loona @loona http://10.7.90.225:11443");
	}

	public void CheckMyInformation() throws InterruptedException {
		action.click(My());
		action.click(MyInformation());
		Thread.sleep(2000);
	}

	// 13.查看喧喧官网
	public AndroidElement MyMoreInformation() {
		return driver.findElementByAccessibilityId("显示菜单");
	}

	public AndroidElement AboutMoreInformation() {
		return driver.findElementByAccessibilityId("关于");
	}

	public AndroidElement Website() {
		return driver.findElementByAccessibilityId("https://www.xuanim.com/");
	}

	public void CheckWebsite() throws InterruptedException {
		action.click(My());
		action.click(MyMoreInformation());
		action.click(AboutMoreInformation());
		action.click(Website());
		Thread.sleep(2000);
	}

	// 14.查看隐私条款
	public AndroidElement Article() {
		return driver.findElementByAccessibilityId("隐私条款");
	}

	public void CheckArticle() throws InterruptedException {
		action.click(My());
		action.click(MyMoreInformation());
		action.click(AboutMoreInformation());
		action.click(Article());
		Thread.sleep(2000);
	}

	// 15.关闭提示框
	public AndroidElement Close() {
		return driver.findElementByAccessibilityId("关闭");
	}

	public void CheckClose() throws InterruptedException {
		action.click(My());
		action.click(MyMoreInformation());
		action.click(AboutMoreInformation());
		action.click(Close());
		Thread.sleep(2000);
	}

	// 16.取消注销
	public AndroidElement Logout() {
		return driver.findElementByAccessibilityId("	\r\n" + "注销");
	}

	public AndroidElement Cancel() {
		return driver.findElementByAccessibilityId("	\r\n" + "取消");
	}

	public void CancelLogout() throws InterruptedException {
		action.click(My());
		action.click(Logout());
		action.click(Cancel());
		Thread.sleep(2000);
	}

	// 17.不清除账号信息并注销
	public AndroidElement ConfirmLogout() {
		return driver.findElementByAccessibilityId("确认");
	}

	public void Logout1() throws InterruptedException {
		action.click(My());
		action.click(Logout());
		action.click(ConfirmLogout());
		Thread.sleep(2000);
	}

	// 18.清除账号信息并注销
	public AndroidElement Clear() {
		return driver.findElementByAccessibilityId("确认");
	}

	public void Logout2() throws InterruptedException {
		action.click(My());
		action.click(Logout());
		action.click(Clear());
		action.click(ConfirmLogout());
		Thread.sleep(2000);
	}

	// 19.注销后重新登录
	public AndroidElement Server() {
		return driver.findElementByAccessibilityId("服务器");
	}

	public AndroidElement Username() {
		return driver.findElementByAccessibilityId("账号");
	}

	public AndroidElement Password() {
		return driver.findElementByAccessibilityId("密码");
	}

	public AndroidElement Login() {
		return driver.findElementByAccessibilityId("登录");
	}

	public void ReLogin1(String server, String username, String password) throws InterruptedException {
		action.click(My());
		action.click(Logout());
		action.click(Clear());
		action.click(ConfirmLogout());
		Thread.sleep(2000);

		action.type(Server(), server);
		action.type(Username(), username);
		action.type(Password(), password);
		action.click(Login());
		Thread.sleep(2000);
	}

	// 20.注销后更换账号登录
	public void ReLogin2(String server, String username, String password) throws InterruptedException {
		action.click(My());
		action.click(Logout());
		action.click(Clear());
		action.click(ConfirmLogout());
		Thread.sleep(2000);

		action.type(Server(), server);
		action.type(Username(), username);
		action.type(Password(), password);
		action.click(Login());
		Thread.sleep(2000);
	}

}
