package hj.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.dataprovider.NSDataProvider;

import base.BaseDriver;
import hj.page.Xuanxuan;

public class XuanxuanTest extends BaseDriver{
	Xuanxuan xuanxuan;
	@BeforeClass
	public void initPage() {
		xuanxuan = new Xuanxuan(driver);
	}
	
	@Test(priority=1)
	public void test_send_email1() {
		xuanxuan.send_email1();
	}
	
	@Test(priority=2)
	public void test_send_email2() {
		xuanxuan.send_email2();
	}
	
	@Test(priority=3)
	public void test_inspection_status1() {
		xuanxuan.inspection_status1();
	}
	
	@Test(priority=4)
	public void test_inspection_status2() {
		xuanxuan.inspection_status2();
	}
	
	@Test(priority=5)
	public void test_checking_information1() {
		xuanxuan.checking_information1();
	}
	
	@Test(priority=6)
	public void test_checking_information2() {
		xuanxuan.checking_information2();
	}
	
	@Test(priority=7)
	public void test_collect1() {
		xuanxuan.collect1();
	}
	
	@Test(priority=8)
	public void test_collect2() {
		xuanxuan.collect2();
	}
	
	@Test(priority=9)
	public void test_check_data() {
		xuanxuan.check_data();
	}
	
	@Test(priority=10)
	public void test_check_order() {
		xuanxuan.check_order();
	}
	
	@Test(priority=11,dataProvider="excel1",dataProviderClass=NSDataProvider.class)
	public void test_send_message(String s1) {
		xuanxuan.send_message(s1);
	}
	
	@Test(priority=12)
	public void test_check_card() {
		xuanxuan.check_card();
	}
	
	@Test(priority=13)
	public void test_website_connection() {
		xuanxuan.website_connection();
	}
	
	@Test(priority=14)
	public void test_secret_items() {
		xuanxuan.secret_items();
	}
	
	@Test(priority=15)
	public void test_close_about() {
		xuanxuan.close_about();
	}
	
	@Test(priority=16)
	public void test_undo_cancel() {
		xuanxuan.undo_cancel();
	}
	
	@Test(priority=17)
	public void test_cancel_login() {
		xuanxuan.cancel_login();
	}
	
	@Test(priority=18)
	public void test_log_off() {
		xuanxuan.log_off();
	}
	
	@Test(priority=19,dataProvider="excel2",dataProviderClass=NSDataProvider.class)
	public void test_login_again(String s1,String s2){
		xuanxuan.login_again(s1,s2);
	}
	
	@Test(priority=20,dataProvider="excel3",dataProviderClass=NSDataProvider.class)
	public void test_login_otheragain(String s1,String s2) {
		xuanxuan.login_otheragain(s1,s2);
	}
	
//	@Test(priority=1,dataProvider="excel",dataProviderClass=NSDataProvider.class)
//	public void login1(String s1,String s2,String s3) throws InterruptedException {
//		notepage = new Note(driver);
//		notepage.log(s1,s2,s3);
//	}
}
