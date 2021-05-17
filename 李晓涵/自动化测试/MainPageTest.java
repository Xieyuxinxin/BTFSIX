package testCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseDriver;
import dataprovider.NSDataProvider;
import pages.MainPage;

public class MainPageTest extends BaseDriver{
	MainPage mainpage;
	@BeforeClass
	public void initPage() {
		mainpage = new MainPage(driver);
	}
	
	
	@Test(dataProvider = "excel_info_1", dataProviderClass = NSDataProvider.class)
//	点击系统，发送消息给所有人
	public void test_1(String s1) {
		mainpage.system_all(s1);
	}
	
	
	@Test(dataProvider = "excel_info_2", dataProviderClass = NSDataProvider.class)
//	通过群聊发消息
	public void test_2(String s1) {
		mainpage.chat_group(s1);
	}
	
	
	@Test(dataProvider = "excel_info_3", dataProviderClass = NSDataProvider.class)
//	向常用联系人发送消息
	public void test_3(String s1) {
		mainpage.chat_group(s1);
	}
	
	@Test
//	向系统所有人群聊发送图片
	public void test_4() {
		mainpage.all_picture();
	}
	
	@Test
//	向群聊发送图片
	public void test_5() {
		mainpage.chat_group_picture();
	}
	
	@Test
//	向常用联系人发送图片
	public void test_6() {
		mainpage.frequent_picture();
	}
	
	@Test
//	和特定联系人开聊
	public void test_7() {
		mainpage.certain_chat("仁兄，在吗？");
	}
	
	@Test
//	创建三人群聊并发送文本消息
	public void test_8() {
		mainpage.three_chat_group("江湖侠客","兄弟们好，在下袁今夏！");
	}
	
	@Test
//	创建四人群聊并发送文本消息
	public void test_9() {
		mainpage.four_chat_group("亲亲亲亲人们~","在下袁今夏，叫我今夏就成！");
	}
	
	@Test
//	创建五人群聊并发送文本消息
	public void test_10() {
		mainpage.five_chat_group("江南好风光~","在下袁今夏，不知各位姑娘姓甚名谁，年芳几许，家住何处，可有婚配~");
	}
	
	@Test
//	重命名群聊
	public void test_11() {
		mainpage.rename_group();
	}
	
	@Test
//	将群聊设为收藏
	public void test_12() {
		mainpage.collect_group();;
	}
	
	@Test
//	将群聊取消收藏
	public void test_13() {
		mainpage.cancel_collect_group();
	}
	
	@Test
//	显示群聊成员列表
	public void test_14() {
		mainpage.show_member_list();
	}
	
	@Test
//	退出讨论组
	public void test_15() {
		mainpage.quit_group();
	}
	
	@Test
//	显示联系人资料
	public void test_16() {
		mainpage.show_info();
	}

	@Test
//	显示联系人资料
	public void test_17() {
		mainpage.info_from_group();
	}

	@Test
//	发送微笑表情
	public void test_18() {
		mainpage.send_smile_image();
	}
	
	@Test
//	敏感信息识别
	public void test_19() {
		mainpage.recognize_sensetive_info();
	}
	
	@Test
//	发送代码段
	public void test_20() {
		mainpage.send_code();
	}
}
