package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class MainPage {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;

	// 构造方法
	public MainPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

	// 页面对象

	// 1-3 创建一对一会话
	// 1、聊天 “+”
	public AndroidElement create_talk_single() {
		return driver.findElementByAccessibilityId("创建聊天");
	}

	// 2、聊天 “+” 选择联系人
	public AndroidElement choose_person1() {
		return driver.findElementByAccessibilityId("G\n" + "gj");
	}

	public AndroidElement choose_person2() {
		return driver.findElementByAccessibilityId("L\n" + "lyz1");
	}

	// 3、聊天 “+” 选择联系人 √
	public AndroidElement save_single() {
		return driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/"
						+ "android.view.View/android.view.View[1]/android.widget.Button[2]");
	}

	// 4-8 创建讨论组
	// 4、点击下方导航栏中“讨论组”
	public AndroidElement click_group() {
		// "讨论组\n" +"讨论组\n" +"第 2 个标签，共 4 个"
		// return driver.findElementByAccessibilityId("讨论组 讨论组 第 2 个标签，共 4 个");
		return driver.findElementByAccessibilityId("讨论组\n" + "讨论组\n" + "第 2 个标签，共 4 个");
	}

	// 5、讨论组 “+” 选择联系人

	public AndroidElement create_talk_group() {
		return driver.findElementByAccessibilityId("创建聊天");
	}

	public AndroidElement choose_personGroup1() {
		return driver.findElementByAccessibilityId("L\n" + "lyz1");
	}

	public AndroidElement choose_personGroup2() {
		return driver.findElementByAccessibilityId("L\n" + "lyz2");
	}

	// 6、讨论组 “+” 选择联系人 √
	public AndroidElement save_group() {
		return driver.findElementByXPath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View/android.view.View[1]/android.widget.Button[2]");
	}

	// 7、输入讨论组名称
	public AndroidElement gTName() {
		return driver.findElementByName("输入讨论组名称");
	}

	// 8、创建讨论组
	public AndroidElement createGroup() {
		return driver.findElementByAccessibilityId("创建");
	}

	// 9-11 退出账号登陆
	// 9、点击下方导航栏中“我的”
	public AndroidElement click_mine() {
		return driver.findElementByAccessibilityId("我的 我的 第 4 个标签，共 4 个");
	}

	// 10、注销
	public AndroidElement quit_user() {
		return driver.findElementByAccessibilityId("注销");
	}

	// 11、注销 -- 确认
	public AndroidElement quit_ok() {
		return driver.findElementByAccessibilityId("确认");
	}

	// 12-14 登录帐号
	// 12、输入用户名
	public AndroidElement put_username() {
		return driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"
						+ "android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[2]");
	}

	// 13、输入对应密码
	public AndroidElement put_userpwd() {
		return driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"
						+ "android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[3]");
	}

	// 14、登录
	public AndroidElement login_user() {
		return driver.findElementByAccessibilityId("登录");
	}

	// 15、点击讨论组
	public AndroidElement click_createGroup() {
		return driver.findElementByAccessibilityId("群 今天也要学习呀");
	}

	// 16-任选聊天会话列表中会话窗口，发送消息
	// 16、任选聊天会话列表中会话窗口
	public AndroidElement click_window() {
		return driver.findElementByXPath("//android.view.View[@content-desc=\"G gj [离线]\"]");
	}

	// 17、焦点聚焦在输入框
	public AndroidElement send_focus() {
		return driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
						+ "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}

	// 18、发送消息
	public AndroidElement send_message() {
		return driver.findElementByXPath("//android.widget.Button[@content-desc=\"发送\"]");
	}

	// 19、聊天界面返回<-联系人列表
	public AndroidElement return_list() {
		return driver.findElementByAccessibilityId("返回");
	}

	// 20、聊天列表中选择联系人
	public AndroidElement choose_list_person() {
		return driver.findElementByAccessibilityId("L\n" + "lyz1\n" + "[离线]");
	}

	public AndroidElement choose_list_person2() {
		return driver.findElementByAccessibilityId("G\n" + "gj\n" + "[离线]");
	}

	public AndroidElement choose_list_person3() {
		return driver.findElementByAccessibilityId("Z\n" + "zzh\n" + "[离线]");
	}

	// 21、点击会话中联系人头像
	public AndroidElement click_photo() {
		return driver.findElementByAccessibilityId("L");
	}

	// 22、会话右上角的更多
	public AndroidElement click_more() {
		return driver.findElementByAccessibilityId("显示菜单");
	}

	// 23、点击“收藏”
	public AndroidElement click_collection() {
		return driver.findElementByAccessibilityId("收藏");
	}

	// 24、“取消收藏”
	public AndroidElement cancel_collection() {
		return driver.findElementByAccessibilityId("取消收藏");
	}

	// 25、会话列表中选择群组会话
	public AndroidElement choose_group() {
		return driver.findElementByAccessibilityId("群 111");
	}

	// 26、讨论组 右上角“更多”
	public AndroidElement click_groupMore() {
		return driver.findElementByAccessibilityId("显示菜单");
	}

	// 28、“收藏”
	public AndroidElement click_groupCol() {
		return driver.findElementByAccessibilityId("收藏");
	}

	// 29、群组“重命名”
	public AndroidElement click_rename() {
		return driver.findElementByAccessibilityId("重命名");
	}

	// 30、新名字
	public AndroidElement new_name() {
		return driver.findElementByName("111, 111");
	}

	// 31、确认重命名
	public AndroidElement confirm_rename() {
		return driver.findElementByAccessibilityId("重命名");
	}

	// 32、退出讨论组
	public AndroidElement exitGroup() {
		return driver.findElementByAccessibilityId("退出讨论组");
	}

	// 33、确认退出讨论组
	public AndroidElement confirm_exit() {
		return driver.findElementByAccessibilityId("确认");
	}

	// 34、进入“聊天”列表界面
	public AndroidElement click_list() {
		return driver.findElementByAccessibilityId("聊天 聊天 第 1 个标签，共 4 个");
	}

	// 35、进入“联系人”列表界面
	public AndroidElement click_link() {
		return driver.findElementByAccessibilityId("联系人 联系人 第 3 个标签，共 4 个");
	}

	// 36、选择联系人
	public AndroidElement choose_person_chat() {
		return driver.findElementByAccessibilityId("A\n"+"admin\n" +"[离线]\n" + "❖ 开发 ◇ 研发");
	}

	// 37、个人主页聊天快捷键
	public AndroidElement click_quick() {
		return driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View"
						+ "/android.view.View/android.view.View/android.view.View/android.view.View[2]");
	}

	// 38、@列表选择联系人
	public AndroidElement choose_person_at() {
		return driver.findElementByAccessibilityId("G\n"+ "gj");
	}

	// 39、确认选择联系人
	public AndroidElement ensure() {
		return driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
						+ "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}

	// 40、资料页后退

	// 页面操作记录
	// 1、创建一对一会话
	public void create_singalTalk1() throws InterruptedException {

		action.click(create_talk_single());
		action.click(choose_person1());
		action.click(save_single());

	}

	public void create_singalTalk2() throws InterruptedException {
		action.click(return_list());
		action.click(create_talk_single());
		action.click(choose_person2());
		action.click(save_single());

	}

	public void create_singalTalk3() throws InterruptedException {
		action.click(return_list());
		Thread.sleep(3000);
		action.click(return_list());
		action.click(create_talk_single());
		action.click(choose_person1());
		action.click(save_single());

	}

	// 2、创建多人讨论组
	public void create_groupTalk(String message) {
		action.click(click_group());
		action.click(create_talk_group());
		action.click(choose_personGroup1());
		action.click(choose_personGroup2());
		action.click(save_group());
		action.type(gTName(), message);
		action.click(createGroup());
	}

	// 3、讨论组创建成功是否有广播消息向群成员提示群组会话由谁创建
	public void broadcast(String message1, String message2) {
		// 退出创建群组的帐号
		action.click(click_mine());
		action.click(quit_user());
		action.click(quit_ok());
		// 登录群组内任一帐号
		action.type(put_username(), message1);
		action.type(put_userpwd(), message2);
		action.click(login_user());
		// 点击进入群组
		action.click(click_createGroup());
	}

	// 4、任意登录一用户帐号，测试聊天列表默认显示“小喧喧”通知中心
	public void defaultXuan(String message1, String message2) {
		// 登录已注册任一帐号
		action.type(put_username(), message1);
		action.type(put_userpwd(), message2);
		action.click(login_user());
		// 默认显示聊天窗口列表
	}

	// 6、新消息提醒
	public void time_list(String message1, String message2) {
		action.click(click_window());
		action.type(send_focus(), "hello");
		action.click(send_message());
		action.click(return_list());
		// 退出发送消息的帐号
		action.click(click_mine());
		action.click(quit_user());
		action.click(quit_ok());
		// 登录新账号
		action.type(put_username(), message1);
		action.type(put_userpwd(), message2);
		action.click(login_user());
	}

	// 7、查看会话对象资料卡片
	public void check_card() throws InterruptedException {
		action.click(return_list());
		Thread.sleep(3000);
		action.click(choose_list_person());
		Thread.sleep(3000);
		action.click(click_photo());

	}

	// 8、收藏一对一会话
	public void col_conversation() throws InterruptedException {
		action.click(return_list());
		action.click(choose_list_person());
		action.click(click_more());
		action.click(click_collection());
		action.click(click_more());
	}

	// 9、收藏多个对话,在收藏会话中发送消息
	public void order_collection1() {
		// 选择联系人，收藏绘画
		action.click(choose_list_person());
		action.click(click_more());
		action.click(click_collection());
		// 发送消息
		action.type(send_focus(), "hello");
		action.click(send_message());
		// 回到联系会话列表
		action.click(return_list());

	}

	public void order_collection2() {
		// 选择联系人，收藏绘画
		action.click(choose_list_person2());
		action.click(click_more());
		action.click(click_collection());
		// 发送消息
		action.type(send_focus(), "hello");
		action.click(send_message());
		// 回到联系会话列表
		action.click(return_list());

	}

	public void order_collection3() {
		// 选择联系人，收藏绘画
		action.click(choose_list_person3());
		action.click(click_more());
		action.click(click_collection());
		// 发送消息
		action.type(send_focus(), "hello");
		action.click(send_message());
		// 回到联系会话列表
		action.click(return_list());

	}

	// 10、收藏群组会话
	public void col_group() {
		action.click(click_group());
		action.click(choose_group());
		action.click(click_groupMore());
		action.click(click_groupCol());
		action.click(click_groupMore());
	}

	// 11、取消收藏
	public void cancel_col() throws InterruptedException {
		action.click(cancel_collection());
		action.click(click_more());
	}

	// 12、群组重命名
	public void group_rename() {
		action.click(click_group());
		action.click(choose_group());
		action.click(click_groupMore());
		action.click(click_rename());
		action.type(new_name(), "2021");
		action.click(confirm_rename());

	}

	// 13、群组成员退出讨论组
	public void exit_group() {
		action.click(click_group());
		action.click(choose_group());
		action.click(click_groupMore());
		action.click(exitGroup());
		action.click(confirm_exit());

	}

	// 14、群组会话正确显示“聊天”“讨论组”两个列表中
	public void show_group() {
		action.click(click_group());
		action.click(click_list());
	}

	// 15、联系人列表显示部门和职位
	public void show_department() {
		action.click(click_link());
	}

	// 17、讨论组中@功能
	public void aite() {
		action.click(click_group());
		action.click(choose_group());
		action.type(send_focus(), "@");
	}

	// 18、聊天框上方能否正常显示对方状态（离线、在线等）
	public void show_state() {
		action.click(choose_list_person());
	}

	// 19、个人主页聊天快捷按钮
	public void chatQuick() {
		action.click(click_link());
		action.click(choose_person_chat());
		action.click(click_quick());
	}

	// 20、测试被@后是否可以收到提示信息
	public void recieve(String message1, String message2) {
		action.click(click_group());
		action.click(choose_group());
		action.type(send_focus(), "@");
		action.click(choose_person_at());
		action.click(ensure());
		// 返回
		action.click(return_list());
		// 退出发送消息的帐号
		action.click(click_mine());
		action.click(quit_user());
		action.click(quit_ok());
		// 登录新账号
		action.type(put_username(), message1);
		action.type(put_userpwd(), message2);
		action.click(login_user());

	}

}
