package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class DiscussionGroupCancelSelect {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//构造方法
	public DiscussionGroupCancelSelect(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	//页面对象
	//取消选择admin
	//列表
	public AndroidElement cancleSelectAdmin_list() {
		return driver.findElement(By.xpath("(//android.view.View[@content-desc=\"A admin\"])[2]"));
	}
	//叉号
	public AndroidElement cancleSelectAdmin_delete() {
		return driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"删除\"])[2]"));
	}
	//取消选择test2
	//列表
	public AndroidElement cancleSelectTest2_list() {
		return driver.findElement(By.xpath("(//android.view.View[@content-desc=\"T test2\"])[2]"));
	}
	//叉号
	public AndroidElement cancleSelectTest2_delete() {
		return driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"删除\"])[3]"));
	}
	//取消选择monkeytest
	//列表
	public AndroidElement cancleSelectMonkeytest_list() {
		return driver.findElement(By.xpath("(//android.view.View[@content-desc=\"M monkeytest\"])[2]"));
	}
	//叉号
	public AndroidElement cancleSelectMonkeytest_delete() {
		return driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"删除\"])[1]"));
	}
}
