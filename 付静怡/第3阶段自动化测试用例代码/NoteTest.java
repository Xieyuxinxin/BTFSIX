package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.NSDataProvider;
import base.BaseDriver;
import pages.Note;

public class NoteTest extends BaseDriver{
	Note notepage;
	@BeforeClass
	public void initPage() throws InterruptedException {
		notepage = new Note(driver);
	}
	
	@BeforeMethod 
	//test1
	public void logout1() throws InterruptedException {
		notepage.logout_success1();
	}
	
	//test2
	@Test(priority=1,dataProvider="excel1",dataProviderClass=NSDataProvider.class)//19退出
	public void logout2(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
		notepage.logout_cancal();
	}
	
	//test3
	@Test(priority=2,dataProvider="excel1",dataProviderClass=NSDataProvider.class) //20退出
	public void logout3(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
		notepage.logout_success2();
	}
	
	//test4
	@Test(priority=3,dataProvider="excel1",dataProviderClass=NSDataProvider.class)//1登录
	public void login1(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test5
	@Test(priority=4,dataProvider="excel2",dataProviderClass=NSDataProvider.class)//2登录
	public void login2(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	
	//test6
	@Test(priority=5,dataProvider="excel3",dataProviderClass=NSDataProvider.class)//3登录
	public void login3(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test7
	@Test(priority=6,dataProvider="excel4",dataProviderClass=NSDataProvider.class)//4登录
	public void login4(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test8
	@Test(priority=7,dataProvider="excel5",dataProviderClass=NSDataProvider.class)//5登录
	public void login5(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test9
	@Test(priority=8,dataProvider="excel6",dataProviderClass=NSDataProvider.class)//6登录
	public void login6(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test10
	@Test(priority=9,dataProvider="excel7",dataProviderClass=NSDataProvider.class)//7登录
	public void login7(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test11
	@Test(priority=10,dataProvider="excel8",dataProviderClass=NSDataProvider.class)//8登录
	public void login8(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test12
	@Test(priority=11,dataProvider="excel9",dataProviderClass=NSDataProvider.class)//9登录
	public void login9(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test13
	@Test(priority=12,dataProvider="excel10",dataProviderClass=NSDataProvider.class)//10登录
	public void login10(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test14
	@Test(priority=13,dataProvider="excel11",dataProviderClass=NSDataProvider.class)//11登录
	public void login11(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test15
	@Test(priority=14,dataProvider="excel12",dataProviderClass=NSDataProvider.class)//12登录
	public void login12(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test16
	@Test(priority=15,dataProvider="excel13",dataProviderClass=NSDataProvider.class)//13登录
	public void login13(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test17
	@Test(priority=16,dataProvider="excel14",dataProviderClass=NSDataProvider.class)//14登录
	public void login14(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test18
	@Test(priority=17,dataProvider="excel15",dataProviderClass=NSDataProvider.class)//15登录
	public void login15(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test19
	@Test(priority=18,dataProvider="excel16",dataProviderClass=NSDataProvider.class)//17登录
	public void login16(String s1,String s2,String s3) throws InterruptedException {
		notepage.log(s1,s2,s3);
	}
	
	//test20
	@Test(priority=19,dataProvider="excel17",dataProviderClass=NSDataProvider.class)//21登录
	public void login17(String s) throws InterruptedException {
		notepage.clear(s);
	}
	
	
}

