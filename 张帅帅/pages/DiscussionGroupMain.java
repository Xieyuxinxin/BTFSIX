package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class DiscussionGroupMain {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//构造方法
	public DiscussionGroupMain(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	//页面对象
	//讨论组
	public AndroidElement group() {
//		return driver.findElement(By.xpath("//android.view.View[@content-desc=\"讨论组 讨论组 第 2 个标签，共 4 个\"]"));
		return driver.findElementByAccessibilityId("讨论组\n"+"讨论组\n"+"第2个标签，供4个");
	}
	
	//创建聊天
	public AndroidElement add_group() {
//		return driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"创建聊天\"]"));
		return driver.findElementByAccessibilityId("创建聊天");
	}
	
	//讨论组test
	public AndroidElement group_test() {
		return driver.findElementByAccessibilityId("群\n"+"test");
	}
	
	//系统讨论组
	public AndroidElement group_system() {
		return driver.findElementByAccessibilityId("系统\n"+"所有人");
	}

}
