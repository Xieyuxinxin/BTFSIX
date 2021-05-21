package testCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseDriver;
import pages.DiscussionGroupCancelSelect;
import pages.DiscussionGroupChat;
import pages.DiscussionGroupMain;
import pages.DiscussionGroupSelectNumber;
import utils.ExcelDataProvider;

public class DiscussionGroupTestCases extends BaseDriver{
	DiscussionGroupMain mainpage;
	DiscussionGroupChat chatpage;
	DiscussionGroupSelectNumber selectpage;
	DiscussionGroupCancelSelect cancelpage;

	@BeforeClass
	public void initPage() {
		mainpage = new DiscussionGroupMain(driver);
		chatpage = new DiscussionGroupChat(driver);
		selectpage = new DiscussionGroupSelectNumber(driver);
		cancelpage = new DiscussionGroupCancelSelect(driver);
	}
	@DataProvider(name = "name")
	public Object[][] name() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data.xlsx", "name");
	}
	//讨论组
	@Test(priority = 1)
	public void test_group_button() {
		mainpage.group().click();
	}
	//点击test讨论组
	@Test(priority = 2)
	public void test_click_group_test() {
		mainpage.group_test().click();
		chatpage.return_button().click();
	}
	//点击系统讨论组
	@Test(priority = 3)
	public void test_click_group_system() {
		mainpage.group_system().click();
		chatpage.return_button().click();
	}
	//添加讨论组
	@Test(priority = 4)
	public void test_add_group_button() {
		mainpage.add_group().click();
	}
	//添加admin
	@Test(priority = 5)
	public void test_add_admin() {
		selectpage.admin().click();		
	}
	//添加test2
	@Test(priority = 6)
	public void test_add_test2() {
		selectpage.test2().click();		
	}
	//返回
	@Test(priority = 7)
	public void test_return() {
		selectpage.button_return().click();
	}
	
	//只选择一个成员创建一个组
	@Test(priority = 8)
	public void test_create_group1() {
		mainpage.add_group().click();
		selectpage.admin().click();
		selectpage.button_confirm().click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"返回\"]")).click();
	}
	//选择两个成员创建一个组
	//命名时取消
	@Test(priority = 9)
	public void test_create_group2() {
		mainpage.add_group().click();
		selectpage.admin().click();
		selectpage.test2().click();
		selectpage.button_confirm().click();
		selectpage.button_cancle().click();
	}
	//点击叉号取消选择
	@Test(priority = 10)
	public void test_cancel_select_delete() {
		cancelpage.cancleSelectAdmin_delete().click();
	}
	//点击列表取消选择
	@Test(priority = 11)
	public void test_cancel_select_list() {
		cancelpage.cancleSelectTest2_list().click();
	}
	//命名后确定
	@Test(priority = 12)
	public void test_create_confirm() {
		selectpage.admin().click();
		selectpage.test2().click();
		selectpage.button_confirm().click();
		selectpage.name("test新建的一个组");
		selectpage.button_create().click();
	}
	//收藏讨论组
	@Test(priority = 13)
	public void test_collect_group() {
		chatpage.menu().click();
		chatpage.collect().click();
		
	}
	//取消收藏讨论组
	@Test(priority = 14)
	public void test_cancel_collect() {
		chatpage.menu().click();
		chatpage.cancel_collect().click();
	}
	//重命名讨论组（4个测试用例）
	@Test(priority = 15, dataProvider = "name")
	public void test_rename_group(String name) {
		chatpage.menu().click();
		chatpage.rename().click();
		chatpage.name(name);
		chatpage.rename_confirm().click();
	}
	//重命名系统讨论组
	@Test(priority = 16)
	public void test_rename_group_system() {
		chatpage.return_button().click();
		mainpage.group_system().click();
		chatpage.menu().click();
		chatpage.rename().click();
		chatpage.name("重命名系统讨论组");
		chatpage.rename_confirm().click();
	}
	//查看成员列表
	@Test(priority = 17)
	public void test_number_list() {
		chatpage.menu().click();
		chatpage.number_list().click();
		chatpage.return_group().click();
	}
	
	//退出讨论组
	//退出别人创建的讨论组
	@Test(priority = 18)
	public void test_sign_out_group() {
		chatpage.return_button().click();
		mainpage.group_test().click();
		chatpage.menu().click();
		chatpage.sign_out_group().click();
	}
	//取消退出
	@Test(priority = 19)
	public void test_cancel_sign_out() {
		chatpage.cancel_sign_out().click();
	}
	//确认退出
	@Test(priority = 20)
	public void test_sign_out_cofirm() {
		chatpage.menu().click();
		chatpage.sign_out_group().click();
		chatpage.sign_out_confirm().click();
	}
}
