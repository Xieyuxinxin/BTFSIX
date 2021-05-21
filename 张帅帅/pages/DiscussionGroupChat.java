package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.FindElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class DiscussionGroupChat {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//构造方法
	public DiscussionGroupChat(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	//页面对象
	//返回键
	public AndroidElement return_button() {
		return driver.findElementByAccessibilityId("返回");
	}
	//显示菜单
	public AndroidElement menu() {
		return driver.findElementByAccessibilityId("显示菜单");
	}
	//admin的头像
	public AndroidElement admin() {
		return driver.findElementByAccessibilityId("A");
	}
	//@test1
	public AndroidElement test1() {
		return driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"@test1\"])[1]"));
	}
	//收藏
	public AndroidElement collect() {
		return driver.findElementByAccessibilityId("收藏");
	}
	//取消收藏
	public AndroidElement cancel_collect() {
		return driver.findElementByAccessibilityId("取消收藏");
	}
	//成员列表
	public AndroidElement number_list() {
		return driver.findElementByAccessibilityId("成员列表");
	}
	//成员列表返回
	public AndroidElement return_group() {
		return driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"返回\"]"));
	}
	//重命名
	public AndroidElement rename() {
		return driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"重命名\"]"));
	}
	//输入讨论组名
	public AndroidElement init_name() {
		return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
	}
	//取消重命名
	public AndroidElement cancel_rename() {
		return driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"取消\"]"));
	}
	//确认重命名
	public AndroidElement rename_confirm() {
		return driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"重命名\"]"));
	}
	//退出讨论组
	public AndroidElement sign_out_group() {
		return driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"退出讨论组\"]"));
	}
	//确认退出讨论组
	public AndroidElement sign_out_confirm() {
		return driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"确认\"]"));
	}
	//取消退出讨论组
	public AndroidElement cancel_sign_out() {
		return driver.findElementByAccessibilityId("取消");
	}
	//页面方法
	//命名
	public void name(String name) {
		action.type(init_name(), name);
	}

}
