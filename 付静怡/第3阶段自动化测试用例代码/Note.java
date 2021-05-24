package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class Note {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	public Note(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	
	//退出
	private AndroidElement click_my() throws InterruptedException {
		return driver.findElementByXPath("//android.view.View[@content-desc='我的 我的 第 4 个标签，共 4 个']");
	}
	private AndroidElement click_logout() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='注销']");
	}
	private AndroidElement click_clear() {
		return driver.findElementByXPath("//android.widget.CheckBox[@content-desc='注销后，你可以重新登录或者使用其他账户进行登录。 清除本账号相关数据']");
	}
	private AndroidElement click_ok() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='确认']");
	}
	private AndroidElement click_no() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc='取消']");
	}
	//退出-成功退出
	public void logout_success1() throws InterruptedException {
		Thread.sleep(1000);
		action.click(click_my());
		action.click(click_logout());
		action.click(click_ok());
	}
	//退出-清空数据成功退出
	public void logout_success2() throws InterruptedException {
		Thread.sleep(1000);
		action.click(click_my());
		action.click(click_logout());
		action.click(click_clear());
		action.click(click_ok());
	}
	//退出-取消退出
	public void logout_cancal() throws InterruptedException {
		Thread.sleep(1000);
		action.click(click_my());
		action.click(click_logout());
		action.click(click_no());
	}
	
	//登录
	List<AndroidElement> textFieldList = (List<AndroidElement>) driver.findElementByClassName("android.widget.EditText");
	private AndroidElement text_address() {
		return (AndroidElement) textFieldList.get(0);
	}
	private AndroidElement text_name() {
		return (AndroidElement) textFieldList.get(1);
	}
	private AndroidElement text_pwd() {
		return (AndroidElement) textFieldList.get(2);
	}
	List<AndroidElement> buttonFieldList = (List<AndroidElement>) driver.findElementByClassName("android.widget.Button");
	private AndroidElement btn_login() {
		return (AndroidElement) buttonFieldList.get(3);
	}
	private AndroidElement btn_clear() {
		return (AndroidElement) buttonFieldList.get(0);
	}
	
	
	public void log(String s1,String s2,String s3) throws InterruptedException {
		action.click(text_address());
		action.type(text_address(), s1);
		Thread.sleep(1000);
		action.click(text_name());
		action.type(text_name(), s2);
		Thread.sleep(1000);
		action.click(text_pwd());
		action.type(text_pwd(), s3);
		Thread.sleep(2000);
		action.click(btn_login());
	}
	
	//一键清除功能
	public void clear(String s) throws InterruptedException{
		action.click(text_address());
		action.type(text_address(), s);
		Thread.sleep(1000);
		action.click(btn_clear());
		
	}
	
}