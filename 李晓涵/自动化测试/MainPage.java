package pages;

import java.util.List;

import com.sun.org.apache.xpath.internal.operations.And;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class MainPage {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//构造方法
	public MainPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
		
	//页面对象
	//系统（所有人）发送消息
	public AndroidElement btn_system_all() {
		return driver.findElementByXPath("//android.view.View[@text='系统 所有人']");
}
	//消息框
	public AndroidElement edit_message() {
		return driver.findElementByClassName("android.widget.EditText");
	}	
	
	//发送按钮
	public AndroidElement send_message() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"发送\"]");
	}
	
	//群聊按钮
	public AndroidElement btn_chat_group() {
		return driver.findElementByXPath("//android.view.View[@content-desc=\"群 北镇抚司高层-诏狱基地\"]");
	}
	
	//常用联系人
	public AndroidElement btn_frequent_person() {
		return driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"陆绎 [在线]\"]");
	}
	
	//发送图片按钮
	public AndroidElement btn_send_picture() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"发送其他内容\"]");
	}
	
	//选择照片
	public AndroidElement btn_picture() {
		return driver.findElementByXPath("//android.view.View[@content-desc=\"照片\"]");
	}
	
	//图库
	public AndroidElement btn_recent_picture() {
		return driver.findElementByXPath("//*[@text='图库']");
	}
	
	//相册
	public  AndroidElement btn_pictures() {
		return driver.findElementById("com.android.gallery3d:id/gl_root_view");
	}	
	
	//图片
	public AndroidElement certain_picture() {
		return driver.findElementById("com.android.gallery3d:id/gl_root_view");
	}

	//“+”按钮
	public AndroidElement btn_add() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"创建聊天\"]");
	}
	
	//选择特定联系人
	public AndroidElement btn_contact_1() {
		return driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"李晓涵1\"]");
	}
	public AndroidElement btn_contact_2() {
		return driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"李晓涵2\"]");
	}
	public AndroidElement btn_contact_3() {
		return driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"陆绎\"]");
	}
	public AndroidElement btn_contact_4() {
		return driver.findElementByXPath("//android.view.View[@content-desc=\"岑 岑福\"]");
	}
	
	//点击“√”
	public MobileElement btn_yes() {
		AndroidElement listView = driver.findElementByClassName("android.widget.Button");
		List<MobileElement> list_view = listView.findElementsByClassName("android.widget.LinearLayout");
		return list_view.get(2);
	}
	
	//点击命名输入框
	public AndroidElement btn_enname() {
		return driver.findElementByXPath("//*[@text='输入讨论组名称']");
	}
	
	//创建群聊
	public AndroidElement btn_create_chat() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"创建\"]");
	}
	
	//选择群聊（江湖侠客）
	public AndroidElement btn_group_1() {
		return driver.findElementByXPath("//android.view.View[@content-desc=\"群 江湖侠客\"]");
	}
	
	//显示菜单
	public AndroidElement btn_show_menu() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"显示菜单\"]");
	}	
	
	//重命名
	public AndroidElement btn_rename() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"重命名\"]");
	}
	
	//点击重命名
	public AndroidElement btn_confirm_rename() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"重命名\"]");
	}
	
	//设为收藏
	public AndroidElement btn_collect() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"收藏\"]");
	}
	
	//取消收藏
	public AndroidElement btn_canecl_collect() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"取消收藏\"]");
	}
	
	//成员列表
	public AndroidElement btn_member_list() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"成员列表\"]");
	}
	
	//退出讨论组
	public AndroidElement btn_quit_group() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"退出讨论组\"]");
	}
	
	//资料
	public AndroidElement btn_info() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"资料\"]");
	}

	//成员列表中的某个联系人
	public AndroidElement btn_some_contact() {
		return driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"陆绎 [在线] ◇ 高层管理\"]");
	}
	
	
	
	//页面操作方法
	//1、通过系统（所有人）发送文本消息
	public void system_all(String message) {
		action.click(btn_system_all());
		action.type(edit_message(),message);
		action.click(send_message());
	}
	
	//2、通过群聊发送文本消息
	public void chat_group(String message) {
		action.click(btn_chat_group());
		action.type(edit_message(), message);
		action.click(send_message());
	}
	
	//3、向常用联系人发送消息
	public void chat_frequent(String message) {
		action.click(btn_frequent_person());
		action.type(edit_message(), message);
		action.click(send_message());
	}
	
	//4、通过系统（所有人）发送图片
	public void all_picture() {
		action.click(btn_system_all());
		action.click(btn_send_picture());
		action.click(btn_picture());
		action.click(btn_recent_picture());
		action.click(btn_pictures());
		action.click(certain_picture());
	}
	
	//5、通过群聊发送图片
	public void chat_group_picture() {
		action.click(btn_chat_group());
		action.click(btn_send_picture());
		action.click(btn_picture());
		action.click(btn_recent_picture());
		action.click(btn_pictures());
		action.click(certain_picture());
	}
	
	//6、向常用联系人发送图片
	public void frequent_picture() {
		action.click(btn_frequent_person());
		action.click(btn_send_picture());
		action.click(btn_picture());
		action.click(btn_recent_picture());
		action.click(btn_pictures());
		action.click(certain_picture());
	}
	
	//7、选择特定联系人开聊
	public void certain_chat(String message) {
		action.click(btn_add());
		action.click(btn_contact_1());
		action.click(btn_yes());
		action.type(edit_message(), message);
		action.click(send_message());
	}
	
	//8、创建三人群聊并发送文本消息
	public void three_chat_group(String name,String message) {
		action.click(btn_add());
		action.click(btn_contact_1());
		action.click(btn_contact_2());
		action.click(btn_yes());
		action.type(btn_enname(), name);
		action.click(btn_create_chat());
		action.type(edit_message(), message);
		action.click(send_message());
	}
	
	//9、创建四人群聊并发送文本消息
	public void four_chat_group(String name,String message) {
		action.click(btn_add());
		action.click(btn_contact_1());
		action.click(btn_contact_2());
		action.click(btn_contact_3());
		action.click(btn_yes());
		action.type(btn_enname(), name);
		action.click(btn_create_chat());
		action.type(edit_message(), message);
		action.click(send_message());
	}
	
	//10、创建五人群聊并发送文本消息
	public void five_chat_group(String name,String message) {
		action.click(btn_add());
		action.click(btn_contact_1());
		action.click(btn_contact_2());
		action.click(btn_contact_3());
		action.click(btn_contact_4());
		action.click(btn_yes());
		action.type(btn_enname(), name);
		action.click(btn_create_chat());
		action.type(edit_message(), message);
		action.click(send_message());
	}
	
	//11、重命名群聊
	public void rename_group() {
		action.click(btn_group_1());
		action.click(btn_show_menu());
		action.click(btn_rename());
		action.click(btn_confirm_rename());
	}
	
	//12、将群聊设为收藏
	public void collect_group() {
		action.click(btn_chat_group());
		action.click(btn_show_menu());
		action.click(btn_collect());
	}
	
	//13、将群聊取消收藏
	public void cancel_collect_group() {
		action.click(btn_chat_group());
		action.click(btn_show_menu());
		action.click(btn_canecl_collect());
	}
	
	//14、显示群聊成员列表
	public void show_member_list() {
		action.click(btn_chat_group());
		action.click(btn_show_menu());
		action.click(btn_member_list());
	}
	
	//15、退出讨论组
	public void quit_group() {
		action.click(btn_chat_group());
		action.click(btn_quit_group());
	}

	//16、显示联系人资料
	public void show_info() {
		action.click(btn_frequent_person());
		action.click(btn_info());
	}

	//17、从群聊中查看某个联系人资料
	public void info_from_group() {
		action.click(btn_chat_group());
		action.click(btn_show_menu());
		action.click(btn_member_list());
		action.click(btn_some_contact());
	}

	//18、发送微笑表情
	public void send_smile_image() {
		action.click(btn_frequent_person());
		action.type(edit_message(), ":grinning: ");
	}
	
	//19、敏感信息识别
	public void recognize_sensetive_info() {
		action.click(btn_frequent_person());
		action.type(edit_message(), "大人，我发现有人在偷偷练妖邪之术——法轮功");
	}
	
	//20、发送代码段
	public void send_code() {
		action.click(btn_frequent_person());
		action.type(edit_message(), "<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset='utf-8'>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<form name=\"form1\">iframe的内层\r\n" + 
				"\r\n" + 
				"密码<input type=\"text\" name=\"passwd\" value=\"password1\">\r\n" + 
				"</form>\r\n" + 
				"</body>\r\n" + 
				"</html>\"\r\n");
	}
}
