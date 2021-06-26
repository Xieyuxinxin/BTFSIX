package testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.testng.annotations.Test;

import base.BaseDriver;
import dataprovider.NSDataProvider;
import pages.MainPage;

public class MainPageTest extends BaseDriver {
	MainPage mainPage;
	// 登陆账号为：zzh

	// 1、创建一对一会话
	@Test(priority = 1)
	public void test_createST() throws InterruptedException {
		mainPage = new MainPage(driver);
		mainPage.create_singalTalk1();
		String message = driver.findElementByAccessibilityId("gj [离线]").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "gj [离线]");
	}

	// 2、测试点击会话成员头像能否成功以卡片的形式显示成员资料，查看该成员的部门职位、联系方式
	@Test(priority = 2)
	public void test_photoCard() throws InterruptedException {
		mainPage = new MainPage(driver);
		mainPage.check_card();
		String message = driver.findElementByAccessibilityId("lyz1 @lyz1").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "lyz1 @lyz1");

	}

	// 3、聊天列表中所有会话是否按照会话中最后一条消息的发送时间先后倒序排列
	@Test(priority = 3)
	public void test_timeList() throws InterruptedException {
		mainPage = new MainPage(driver);
		mainPage.create_singalTalk3();
		mainPage.create_singalTalk2();
		// 断言 列表中的第一位是不是第二位创建的会话窗口
		String message = driver.findElementByAccessibilityId("lyz1 [离线]").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "lyz1 [离线]");
	}

	// 4、收藏一对一会话
	@Test(priority = 4)
	public void test_collection() throws InterruptedException {
		mainPage = new MainPage(driver);
		mainPage.col_conversation();
		String message = driver.findElementByAccessibilityId("取消收藏").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "取消收藏");
	}

	//5、取消收藏
	@Test(dependsOnMethods = "test_collection", priority = 5)
	public void test_cancelCol() throws InterruptedException {
		mainPage = new MainPage(driver);
		mainPage.cancel_col();
		String message = driver.findElementByAccessibilityId("收藏").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "收藏");
	}

	//6、创建多人群组会话
	@Test(dataProvider = "excel1", dataProviderClass = NSDataProvider.class,priority = 6)
	public void test_createGT(String s1) {
		mainPage = new MainPage(driver);
		mainPage.create_groupTalk(s1);
		String message = driver.findElementByAccessibilityId(s1).getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message,s1);
	}
	
	
	
	//7、讨论组创建成功是否有广播消息向群成员提示群组会话由谁创建
	@Test(dependsOnMethods="test_createGT",dataProvider = "excel2", dataProviderClass = NSDataProvider.class,priority = 7)
	public void test_broadcast(String s1,String s2) {
		mainPage = new MainPage(driver);
		mainPage.broadcast(s1, s2);
		String message = driver.findElementByAccessibilityId("创建了讨论组").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "创建了讨论组");
	}
	
	//8、任意登录一用户帐号，测试聊天列表默认显示“小喧喧”通知中心
	@Test(dataProvider = "excel3", dataProviderClass = NSDataProvider.class,priority = 8)
	public void test_defaultXuan(String s1,String s2) {
		mainPage = new MainPage(driver);
		mainPage.broadcast(s1, s2);
		String message = driver.findElementByXPath("//android.view.View[@content-desc=\"喧 小喧喧 通知中心\"]").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "喧 小喧喧 通知中心");
	}
	

	//9、新消息提示
	@Test(dataProvider = "excel2", dataProviderClass = NSDataProvider.class,priority = 9)
	public void test_newMessage(String s1,String s2) {
		mainPage = new MainPage(driver);
		mainPage.time_list(s1, s2);
		String message = driver.findElementByAccessibilityId("G gj [在线] 1").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "G gj [在线] 1");
		
	}



	
	//10、测试多个收藏对话，是否按照会话中最后一条消息的发送时间先后倒序排列
	@Test(dependsOnMethods="test_cancelCol",priority = 10)
	public void test_orderCol() {
		mainPage = new MainPage(driver);
		mainPage.order_collection1();
		mainPage.order_collection2();
		mainPage.order_collection3();
		//判断与zzh的会话是否在最上方
		String message = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
				+ "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "Z zzh [离线]");
		
	}
	
	//11、收藏群组会话
	@Test(priority = 11)
	public void test_col_group() {
		mainPage = new MainPage(driver);
		mainPage.col_group();
		String message = driver.findElementByAccessibilityId("取消收藏").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "取消收藏");
		
	}
	

	
	//12、群组会话重命名
	@Test(priority = 12)
	public void test_rename() {
		mainPage = new MainPage(driver);
		mainPage.group_rename();
		String message = driver.findElementByXPath("//android.view.View[@content-desc=\"群 2021\"]").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "群 2021");
	}
	
	//13、群组成员退出讨论组
	@Test(priority = 13)
	public void test_exitGroup() {
		mainPage = new MainPage(driver);
		mainPage.exit_group();
		boolean testExit = false;
		String message = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/"
				+ "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]").getAttribute("content-desc");
		System.out.println(message);
		if(!message.equals("2021")) {
			testExit = true;
		}
		assertTrue(testExit);
		
	}
	
	//14、群组会话正确显示“聊天”“讨论组”两个列表中
	@Test(priority = 14)
	public void test_showGroup() {
		mainPage = new MainPage(driver);
		mainPage.show_group();
		String message = driver.findElementByAccessibilityId("群 今天也要学习呀").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "群 今天也要学习呀");
	}
	
	//15、联系人列表显示部门和职位
	@Test(priority = 15)
	public void test_showdep() {
		mainPage = new MainPage(driver);
		mainPage.show_department();
		String message = driver.findElementByAccessibilityId("A admin [离线] ❖ 开发 ◇ 研发").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "A admin [离线] ❖ 开发 ◇ 研发");
	}
	
	//16、测试当讨论组中除创建者未退出群聊外，其他成员均退出群聊，群聊是否会自动解散
	@Test(dependsOnMethods="test_exitGroup",priority = 16)
	public void test_dismiss() {
		mainPage = new MainPage(driver);
		mainPage.exit_group();
		mainPage.exit_group();
		boolean testExit = false;
		String message = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/"
				+ "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]").getAttribute("content-desc");
		System.out.println(message);
		if(!message.equals("2021")) {
			testExit = true;
		}
		assertTrue(testExit);
	}
	
	//17、讨论组中@功能
	@Test(priority = 17) 
	public void test_aite() {
		mainPage = new MainPage(driver);
		mainPage.aite();
		boolean testAT = true;
		String message = driver.findElementByXPath("刘 刘耀文").getAttribute("content-desc");
		System.out.println(message);
		if(!message.equals("刘 刘耀文")) {
			testAT = false;
		}
		assertTrue(testAT);
	}
	
	//18、聊天框上方能否正常显示对方状态（离线、在线等）
	@Test(priority = 18)
	public void test_how_state() {
		mainPage = new MainPage(driver);
		mainPage.show_state();
		String message = driver.findElementByAccessibilityId("lyz1 [离线]").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "lyz1 [离线]");
	}
	
	//19、个人主页聊天快捷按钮
	@Test(priority = 19)
	public void test_chat_quick() {
		mainPage = new MainPage(driver);
		mainPage.show_state();
		String message = driver.findElementByAccessibilityId("admin [离线]").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "admin [离线]");
		
	}
	
	//20、测试被@后是否可以收到提示信息
	@Test(dataProvider = "excel4", dataProviderClass = NSDataProvider.class,priority = 20)
	public void test_recieve(String s1,String s2) {
		mainPage = new MainPage(driver);
		mainPage.recieve("gjgj","123456");
		String message = driver.findElementByAccessibilityId("[群 111]").getAttribute("content-desc");
		System.out.println(message);
		assertEquals(message, "[群 111 1]");
	}
}
