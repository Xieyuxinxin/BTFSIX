package hj.page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class Xuanxuan {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//构造方法
	public Xuanxuan(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	
	
//test1.检验点击邮件图标能便捷发送邮件
	
	//1.点击联系人
	public AndroidElement click_contacts1() {
		return driver.findElementByAccessibilityId("联系人 联系人 第 3 个标签，共 4 个");
	}
	
	//2.点击何佳
	public AndroidElement click_people1() {
		return driver.findElementByAccessibilityId(	"小 小诶 [离线]");	
	}
	
	//3.点击邮件图标
		public AndroidElement click_email1() {
			return driver.findElementByXPath("//android.widget.Button[@content-desc=\"Email a@qq.com\"]");
		}
	
	public void send_email1() {
		action.click(click_contacts1());
		action.click(click_people1());
		action.click(click_email1());

	}
	


	
	
//test2.检验点击邮件图标能便捷发送邮件
	
		//1.点击联系人
		public AndroidElement click_contacts2() {
			return driver.findElementByAccessibilityId("联系人 联系人 第 3 个标签，共 4 个");
		}
		
		//2.点击何佳
		public AndroidElement click_people2() {
			return driver.findElementByAccessibilityId(	"何 何佳 [在线]");	
		}
		
		//3.点击邮件图标
			public AndroidElement click_email2() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"Email 1@qq.com\"]");
			}
		
		public void send_email2() {
			action.click(click_contacts2());
			action.click(click_people2());
			action.click(click_email2());

		}
		
	
		
		
		
//test3.检验用户在线状态能随真实情况改变
		
			//1.点击联系人
			public AndroidElement click_contacts3() {
				return driver.findElementByAccessibilityId("联系人 联系人 第 3 个标签，共 4 个");
			}
			
			public void inspection_status1() {
				action.click(click_contacts3());
			}
			
			
			
			
//test4.检验用户在线状态能随真实情况改变
			
			//1.点击联系人
			public AndroidElement click_contacts4() {
				return driver.findElementByAccessibilityId("联系人 联系人 第 3 个标签，共 4 个");
			}
			
			public void inspection_status2() {
				action.click(click_contacts4());
			}
			
			
			
//test5.检验用户信息更改后联系人列表自动更新
			
			//1.点击联系人
			public AndroidElement click_contacts5() {
				return driver.findElementByAccessibilityId("联系人 联系人 第 3 个标签，共 4 个");
			}
			
			//2.点击小毕
			public AndroidElement click_people5() {
				return driver.findElementByAccessibilityId("小 小毕 [离线]");	
			}
			
			
			public void checking_information1() {
				action.click(click_contacts5());
				action.click(click_people5());

			}
			
			
		
			
//test6.检验用户信息更改后联系人列表自动更新
			
			//1.点击联系人
			public AndroidElement click_contacts6() {
				return driver.findElementByAccessibilityId("联系人 联系人 第 3 个标签，共 4 个");
			}
			
			//2.点击小毕
			public AndroidElement click_people6() {
				return driver.findElementByAccessibilityId("小 小毕 [离线]");	
			}
			
			
			public void checking_information2() {
				action.click(click_contacts6());
				action.click(click_people6());

			}
			
			
			
			
			
//test7.检验收藏联系人
			
			//1.点击联系人
			public AndroidElement click_contacts7() {
				return driver.findElementByAccessibilityId("联系人 联系人 第 3 个标签，共 4 个");
			}
			
			//2.点击小毕
			public AndroidElement click_people7() {
				return driver.findElementByAccessibilityId("小 小毕 [离线]");	
			}
			
			//3.点击右上角五角星
			public AndroidElement click_star1() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"Email 1@qq.com\"]");
			}

			
			public void collect1() {
				action.click(click_contacts7());
				action.click(click_people7());
				action.click(click_star1());

			}
			
			
			
			
//test8.检验收藏联系人
			
			//1.点击联系人
			public AndroidElement click_contacts8() {
				return driver.findElementByAccessibilityId("联系人 联系人 第 3 个标签，共 4 个");
			}
			
			//2.点击何佳
			public AndroidElement click_people8() {
				return driver.findElementByAccessibilityId("何 何佳 [离线]");	
			}
			
			
			//3.点击右上角三点
			public AndroidElement click_chat() {
				return driver.findElementByAccessibilityId("显示菜单");
			}
			
			//4.点击右上角五角星
			public AndroidElement click_collect() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"收藏\"]");
			}

			
			public void collect2() {
				action.click(click_contacts8());
				action.click(click_people8());
				action.click(click_chat());
				action.click(click_collect());

			}
			
			
			
			
			
//test9.检验查看资料
			
			//1.点击联系人
			public AndroidElement click_contacts9() {
				return driver.findElementByAccessibilityId("联系人 联系人 第 3 个标签，共 4 个");
			}
			
			//2.点击小诶
			public AndroidElement click_people9() {
				return driver.findElementByAccessibilityId("小 小诶 [离线]");	
			}
			
			//3.点击右上角三点
			public AndroidElement click_chat2() {
				return driver.findElementByAccessibilityId("显示菜单");
			}
			
			//4.点击右上角资料卡
			public AndroidElement click_data() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"资料\"]");
			}

			
			public void check_data() {
				action.click(click_contacts9());
				action.click(click_people9());
				action.click(click_chat2());
				action.click(click_data());

			}
	
			
			
			
			
//test10.检验联系人顺序排序
			
			//1.点击联系人
			public AndroidElement click_contacts10() {
				return driver.findElementByAccessibilityId("联系人 联系人 第 3 个标签，共 4 个");
			}
			
		
			public void check_order() {
				action.click(click_contacts10());
			}
			
			
			
			
			
			
			
//test11.检验能否通过联系人列表与联系人聊天
			
			//1.点击联系人
			public AndroidElement click_contacts11() {
				return driver.findElementByAccessibilityId("联系人 联系人 第 3 个标签，共 4 个");
			}
			
			//2.点击何佳
			public AndroidElement click_people11() {
				return driver.findElementByAccessibilityId("何 何佳 [离线]");	
			}
			
			//3.锁定输入框
			public AndroidElement click_input() {
				return driver.findElementByXPath("//*[@text='发送消息']");
			}
			
			//4.点击发送
			public AndroidElement click_send() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"发送\"]");
			}

			
			public void send_message(String message) {
				action.click(click_contacts11());
				action.click(click_people11());
				action.click(click_input());
				action.type(click_input(), message);
				action.click(click_send());

			}
			
			
			
//test12.检验查看自己资料
			
			//1.点击我的
			public AndroidElement click_contacts12() {
				return driver.findElementByAccessibilityId("我的 我的 第 4 个标签，共 4 个");
			}
			
			//2.点击名片
			public AndroidElement click_card() {
				return driver.findElementByAccessibilityId("何 何佳 @hj1 http://10.7.90.133:11443");	
			}
			
			
			public void check_card() {
				action.click(click_contacts12());
				action.click(click_card());
			}
			
			
			
//test13.检验能否查看喧喧官网
			
			//1.点击我的
			public AndroidElement click_contacts13() {
				return driver.findElementByAccessibilityId("我的 我的 第 4 个标签，共 4 个");
			}
			
			//2.点击右上角更多
			public AndroidElement click_people13() {
				return driver.findElementByAccessibilityId("显示菜单");	
			}
			
			//3.点击关于
			public AndroidElement click_about() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"关于\"]");
			}
			
			//4.点击官网链接
			public AndroidElement click_connection() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"https://www.xuanim.com/\"]");
			}
			
			//5.点击浏览器
			public AndroidElement click_browser() {
				return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android."
						+ "widget.FrameLayout/com.android.internal.widget.ResolverDrawerLayout/android.widget.ListView/android.widget.LinearLayout[2]");
			}
			
			//6.点击仅此一次
			public AndroidElement click_once() {
				return driver.findElementById("android:id/button_once");
			}
			
	
			public void website_connection() {
				action.click(click_contacts13());
				action.click(click_people13());
				action.click(click_about());
				action.click(click_connection());
				action.click(click_browser());
				action.click(click_once());

			}
			
			
			
			
//test14.检验能否查看隐私条款
			
			//1.点击我的
			public AndroidElement click_contacts14() {
				return driver.findElementByAccessibilityId("我的 我的 第 4 个标签，共 4 个");
			}
			
			//2.点击右上角更多
			public AndroidElement click_people14() {
				return driver.findElementByAccessibilityId("显示菜单");	
			}
			
			//3.点击关于
			public AndroidElement click_about2() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"关于\"]");
			}
			
			//4.点击隐私条款
			public AndroidElement click_secret() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"隐私条款\"]");
			}
			
			//5.点击浏览器
			public AndroidElement click_browser2() {
				return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android."
						+ "widget.FrameLayout/com.android.internal.widget.ResolverDrawerLayout/android.widget.ListView/android.widget.LinearLayout[2]");
			}
			
			//6.点击仅此一次
			public AndroidElement click_once2() {
				return driver.findElementById("android:id/button_once");
			}
			
	
			public void secret_items() {
				action.click(click_contacts14());
				action.click(click_people14());
				action.click(click_about2());
				action.click(click_secret());
				action.click(click_browser2());
				action.click(click_once2());

			}
			
			
			
			
			
//test15.检验能否关闭
			
			//1.点击我的
			public AndroidElement click_contacts15() {
				return driver.findElementByAccessibilityId("我的 我的 第 4 个标签，共 4 个");
			}
			
			//2.点击右上角更多
			public AndroidElement click_people15() {
				return driver.findElementByAccessibilityId("显示菜单");	
			}
			
			//3.点击关于
			public AndroidElement click_about3() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"关于\"]");
			}
			
			//4.点击关闭
			public AndroidElement click_close() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"隐私条款\"]");
			}
			
	
			public void close_about() {
				action.click(click_contacts15());
				action.click(click_people15());
				action.click(click_about3());
				action.click(click_close());

			}
			
			
			
			
//test16.校验能否取消注销
			
			//1.点击我的
			public AndroidElement click_contacts16() {
				return driver.findElementByAccessibilityId("我的 我的 第 4 个标签，共 4 个");
			}
			
			//2.点击注销
			public AndroidElement click_people16() {
				return driver.findElementByAccessibilityId("注销");	
			}
			
			//3.点击取消
			public AndroidElement click_undo() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"取消\"]");
			}
			
				
			public void undo_cancel() {
				action.click(click_contacts16());
				action.click(click_people16());
				action.click(click_undo());

			}
			
			
			
			
	
//test17.校验能否退出登录（不清除本账号相关数据）
			
			//1.点击我的
			public AndroidElement click_contacts17() {
				return driver.findElementByAccessibilityId("我的 我的 第 4 个标签，共 4 个");
			}
			
			//2.点击注销
			public AndroidElement click_people17() {
				return driver.findElementByAccessibilityId("注销");	
			}
			
			//3.点击确认
			public AndroidElement click_confirm() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"确认\"]");
			}
			
				
			public void cancel_login() {
				action.click(click_contacts17());
				action.click(click_people17());
				action.click(click_confirm());

			}
			
			
			
			
//test18.校验能否注销(清除本账号相关数据)
			
			//1.点击我的
			public AndroidElement click_contacts18() {
				return driver.findElementByAccessibilityId("我的 我的 第 4 个标签，共 4 个");
			}
			
			//2.点击注销
			public AndroidElement click_people18() {
				return driver.findElementByAccessibilityId("注销");	
			}
			
			//3.勾选清除本账号相关数据
			public AndroidElement click_clear() {
				return driver.findElementByXPath("//android.view.View[@content-desc=\"确定注销登录状态？\"]");
			}
			
			//4.点击确认
			public AndroidElement click_confirm2() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"确认\"]");
			}
			
				
			public void log_off() {
				action.click(click_contacts18());
				action.click(click_people18());
				action.click(click_clear());
				action.click(click_confirm2());

			}
			
			
			
			
//test19.校验注销后能否重新登录本账号
			
			//1.点击我的
			public AndroidElement click_contacts19() {
				return driver.findElementByAccessibilityId("我的 我的 第 4 个标签，共 4 个");
			}
			
			//2.点击注销
			public AndroidElement click_people19() {
				return driver.findElementByAccessibilityId("注销");	
			}
			
			//3.勾选清除本账号相关数据
			public AndroidElement click_clear2() {
				return driver.findElementByXPath("//android.view.View[@content-desc=\"确定注销登录状态？\"]");
			}
			
			//4.点击确认
			public AndroidElement click_confirm3() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"确认\"]");
			}
			
			//5.选中账号框
			public AndroidElement click_name() {
				return driver.findElementByXPath("//*[@text='账号']");
			}
			
			//6.选中密码框
			public AndroidElement click_pwd() {
				return driver.findElementByXPath("//*[@text='密码']");
			}
			
			//7.点击登录
			public AndroidElement click_login() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"确认\"]");
			}
			
				
			public void login_again(String name,String pwd) {
				action.click(click_contacts19());
				action.click(click_people19());
				action.click(click_clear2());
				action.click(click_confirm3());
				action.type(click_name(), name);
				action.type(click_pwd(), pwd);
				action.click(click_login());

			}
			
			
			
			
//test20.校验注销后能否重新登录其他账号
			
			//1.点击我的
			public AndroidElement click_contacts20() {
				return driver.findElementByAccessibilityId("我的 我的 第 4 个标签，共 4 个");
			}
			
			//2.点击注销
			public AndroidElement click_people20() {
				return driver.findElementByAccessibilityId("注销");	
			}
			
			//3.勾选清除本账号相关数据
			public AndroidElement click_clear3() {
				return driver.findElementByXPath("//android.view.View[@content-desc=\"确定注销登录状态？\"]");
			}
			
			//4.点击确认
			public AndroidElement click_confirm4() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"确认\"]");
			}
			
			//5.选中账号框
			public AndroidElement click_name2() {
				return driver.findElementByXPath("//*[@text='账号']");
			}
			
			//6.选中密码框
			public AndroidElement click_pwd2() {
				return driver.findElementByXPath("//*[@text='密码']");
			}
			
			//7.点击登录
			public AndroidElement click_login2() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"确认\"]");
			}
			
				
			public void login_otheragain(String otherName,String otherPwd) {
				action.click(click_contacts20());
				action.click(click_people20());
				action.click(click_clear3());
				action.click(click_confirm4());
				action.type(click_name2(), otherName);
				action.type(click_pwd2(), otherPwd);
				action.click(click_login2());

			}
			
			
			
			
			
			
			
}
