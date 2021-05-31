package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class DiscussionGroupSelectNumber {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//构造方法
	public DiscussionGroupSelectNumber(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	//页面对象
	//联系人
	//admin
	public AndroidElement admin() {
//		return driver.findElement(By.xpath("//android.view.View[@content-desc=\"A admin\"]"));
		return driver.findElementByAccessibilityId("A\n"+"admin");
	}
	//test2
	public AndroidElement test2() {
//		return driver.findElement(By.xpath("//android.view.View[@content-desc=\"T test2\"]"));
		return driver.findElementByAccessibilityId("T\n"+"test2");
	}
	//monkeytest
	public AndroidElement monkeytest() {
//		return driver.findElement(By.xpath("//android.view.View[@content-desc=\"M monkeytest\"]"));
		return driver.findElementByAccessibilityId("M\n"+"monkeytest");
	}
	//返回键
	public AndroidElement button_return() {
//		return driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"返回\"]"));
		return driver.findElementByAccessibilityId("返回");
	}
	//确定键
	public AndroidElement button_confirm() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]"));
	}
	//输入讨论组名
	public AndroidElement init_name() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
	}
	//取消
	public AndroidElement button_cancle() {
//		return driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"取消\"]"));
		return driver.findElementByAccessibilityId("取消");
	}
	//创建
	public AndroidElement button_create() {
//		return driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"创建\"]"));
		return driver.findElementByAccessibilityId("创建");
	}
	
	//页面方法
	//命名
	public void name(String name) {
		action.type(init_name(), name);
	}

}
