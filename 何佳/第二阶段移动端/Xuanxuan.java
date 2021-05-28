package hj.page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class Xuanxuan {
	AndroidDriver<AndroidElement> driver;
	BaseAction action;
	//���췽��
	public Xuanxuan(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}
	
	
	
//test1.�������ʼ�ͼ���ܱ�ݷ����ʼ�
	
	//1.�����ϵ��
	public AndroidElement click_contacts1() {
		return driver.findElementByAccessibilityId("��ϵ�� ��ϵ�� �� 3 ����ǩ���� 4 ��");
	}
	
	//2.����μ�
	public AndroidElement click_people1() {
		return driver.findElementByAccessibilityId(	"С С�� [����]");	
	}
	
	//3.����ʼ�ͼ��
		public AndroidElement click_email1() {
			return driver.findElementByXPath("//android.widget.Button[@content-desc=\"Email a@qq.com\"]");
		}
	
	public void send_email1() {
		action.click(click_contacts1());
		action.click(click_people1());
		action.click(click_email1());

	}
	


	
	
//test2.�������ʼ�ͼ���ܱ�ݷ����ʼ�
	
		//1.�����ϵ��
		public AndroidElement click_contacts2() {
			return driver.findElementByAccessibilityId("��ϵ�� ��ϵ�� �� 3 ����ǩ���� 4 ��");
		}
		
		//2.����μ�
		public AndroidElement click_people2() {
			return driver.findElementByAccessibilityId(	"�� �μ� [����]");	
		}
		
		//3.����ʼ�ͼ��
			public AndroidElement click_email2() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"Email 1@qq.com\"]");
			}
		
		public void send_email2() {
			action.click(click_contacts2());
			action.click(click_people2());
			action.click(click_email2());

		}
		
	
		
		
		
//test3.�����û�����״̬������ʵ����ı�
		
			//1.�����ϵ��
			public AndroidElement click_contacts3() {
				return driver.findElementByAccessibilityId("��ϵ�� ��ϵ�� �� 3 ����ǩ���� 4 ��");
			}
			
			public void inspection_status1() {
				action.click(click_contacts3());
			}
			
			
			
			
//test4.�����û�����״̬������ʵ����ı�
			
			//1.�����ϵ��
			public AndroidElement click_contacts4() {
				return driver.findElementByAccessibilityId("��ϵ�� ��ϵ�� �� 3 ����ǩ���� 4 ��");
			}
			
			public void inspection_status2() {
				action.click(click_contacts4());
			}
			
			
			
//test5.�����û���Ϣ���ĺ���ϵ���б��Զ�����
			
			//1.�����ϵ��
			public AndroidElement click_contacts5() {
				return driver.findElementByAccessibilityId("��ϵ�� ��ϵ�� �� 3 ����ǩ���� 4 ��");
			}
			
			//2.���С��
			public AndroidElement click_people5() {
				return driver.findElementByAccessibilityId("С С�� [����]");	
			}
			
			
			public void checking_information1() {
				action.click(click_contacts5());
				action.click(click_people5());

			}
			
			
		
			
//test6.�����û���Ϣ���ĺ���ϵ���б��Զ�����
			
			//1.�����ϵ��
			public AndroidElement click_contacts6() {
				return driver.findElementByAccessibilityId("��ϵ�� ��ϵ�� �� 3 ����ǩ���� 4 ��");
			}
			
			//2.���С��
			public AndroidElement click_people6() {
				return driver.findElementByAccessibilityId("С С�� [����]");	
			}
			
			
			public void checking_information2() {
				action.click(click_contacts6());
				action.click(click_people6());

			}
			
			
			
			
			
//test7.�����ղ���ϵ��
			
			//1.�����ϵ��
			public AndroidElement click_contacts7() {
				return driver.findElementByAccessibilityId("��ϵ�� ��ϵ�� �� 3 ����ǩ���� 4 ��");
			}
			
			//2.���С��
			public AndroidElement click_people7() {
				return driver.findElementByAccessibilityId("С С�� [����]");	
			}
			
			//3.������Ͻ������
			public AndroidElement click_star1() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"Email 1@qq.com\"]");
			}

			
			public void collect1() {
				action.click(click_contacts7());
				action.click(click_people7());
				action.click(click_star1());

			}
			
			
			
			
//test8.�����ղ���ϵ��
			
			//1.�����ϵ��
			public AndroidElement click_contacts8() {
				return driver.findElementByAccessibilityId("��ϵ�� ��ϵ�� �� 3 ����ǩ���� 4 ��");
			}
			
			//2.����μ�
			public AndroidElement click_people8() {
				return driver.findElementByAccessibilityId("�� �μ� [����]");	
			}
			
			
			//3.������Ͻ�����
			public AndroidElement click_chat() {
				return driver.findElementByAccessibilityId("��ʾ�˵�");
			}
			
			//4.������Ͻ������
			public AndroidElement click_collect() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"�ղ�\"]");
			}

			
			public void collect2() {
				action.click(click_contacts8());
				action.click(click_people8());
				action.click(click_chat());
				action.click(click_collect());

			}
			
			
			
			
			
//test9.����鿴����
			
			//1.�����ϵ��
			public AndroidElement click_contacts9() {
				return driver.findElementByAccessibilityId("��ϵ�� ��ϵ�� �� 3 ����ǩ���� 4 ��");
			}
			
			//2.���С��
			public AndroidElement click_people9() {
				return driver.findElementByAccessibilityId("С С�� [����]");	
			}
			
			//3.������Ͻ�����
			public AndroidElement click_chat2() {
				return driver.findElementByAccessibilityId("��ʾ�˵�");
			}
			
			//4.������Ͻ����Ͽ�
			public AndroidElement click_data() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"����\"]");
			}

			
			public void check_data() {
				action.click(click_contacts9());
				action.click(click_people9());
				action.click(click_chat2());
				action.click(click_data());

			}
	
			
			
			
			
//test10.������ϵ��˳������
			
			//1.�����ϵ��
			public AndroidElement click_contacts10() {
				return driver.findElementByAccessibilityId("��ϵ�� ��ϵ�� �� 3 ����ǩ���� 4 ��");
			}
			
		
			public void check_order() {
				action.click(click_contacts10());
			}
			
			
			
			
			
			
			
//test11.�����ܷ�ͨ����ϵ���б�����ϵ������
			
			//1.�����ϵ��
			public AndroidElement click_contacts11() {
				return driver.findElementByAccessibilityId("��ϵ�� ��ϵ�� �� 3 ����ǩ���� 4 ��");
			}
			
			//2.����μ�
			public AndroidElement click_people11() {
				return driver.findElementByAccessibilityId("�� �μ� [����]");	
			}
			
			//3.���������
			public AndroidElement click_input() {
				return driver.findElementByXPath("//*[@text='������Ϣ']");
			}
			
			//4.�������
			public AndroidElement click_send() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"����\"]");
			}

			
			public void send_message(String message) {
				action.click(click_contacts11());
				action.click(click_people11());
				action.click(click_input());
				action.type(click_input(), message);
				action.click(click_send());

			}
			
			
			
//test12.����鿴�Լ�����
			
			//1.����ҵ�
			public AndroidElement click_contacts12() {
				return driver.findElementByAccessibilityId("�ҵ� �ҵ� �� 4 ����ǩ���� 4 ��");
			}
			
			//2.�����Ƭ
			public AndroidElement click_card() {
				return driver.findElementByAccessibilityId("�� �μ� @hj1 http://10.7.90.133:11443");	
			}
			
			
			public void check_card() {
				action.click(click_contacts12());
				action.click(click_card());
			}
			
			
			
//test13.�����ܷ�鿴��������
			
			//1.����ҵ�
			public AndroidElement click_contacts13() {
				return driver.findElementByAccessibilityId("�ҵ� �ҵ� �� 4 ����ǩ���� 4 ��");
			}
			
			//2.������ϽǸ���
			public AndroidElement click_people13() {
				return driver.findElementByAccessibilityId("��ʾ�˵�");	
			}
			
			//3.�������
			public AndroidElement click_about() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"����\"]");
			}
			
			//4.�����������
			public AndroidElement click_connection() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"https://www.xuanim.com/\"]");
			}
			
			//5.��������
			public AndroidElement click_browser() {
				return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android."
						+ "widget.FrameLayout/com.android.internal.widget.ResolverDrawerLayout/android.widget.ListView/android.widget.LinearLayout[2]");
			}
			
			//6.�������һ��
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
			
			
			
			
//test14.�����ܷ�鿴��˽����
			
			//1.����ҵ�
			public AndroidElement click_contacts14() {
				return driver.findElementByAccessibilityId("�ҵ� �ҵ� �� 4 ����ǩ���� 4 ��");
			}
			
			//2.������ϽǸ���
			public AndroidElement click_people14() {
				return driver.findElementByAccessibilityId("��ʾ�˵�");	
			}
			
			//3.�������
			public AndroidElement click_about2() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"����\"]");
			}
			
			//4.�����˽����
			public AndroidElement click_secret() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"��˽����\"]");
			}
			
			//5.��������
			public AndroidElement click_browser2() {
				return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android."
						+ "widget.FrameLayout/com.android.internal.widget.ResolverDrawerLayout/android.widget.ListView/android.widget.LinearLayout[2]");
			}
			
			//6.�������һ��
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
			
			
			
			
			
//test15.�����ܷ�ر�
			
			//1.����ҵ�
			public AndroidElement click_contacts15() {
				return driver.findElementByAccessibilityId("�ҵ� �ҵ� �� 4 ����ǩ���� 4 ��");
			}
			
			//2.������ϽǸ���
			public AndroidElement click_people15() {
				return driver.findElementByAccessibilityId("��ʾ�˵�");	
			}
			
			//3.�������
			public AndroidElement click_about3() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"����\"]");
			}
			
			//4.����ر�
			public AndroidElement click_close() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"��˽����\"]");
			}
			
	
			public void close_about() {
				action.click(click_contacts15());
				action.click(click_people15());
				action.click(click_about3());
				action.click(click_close());

			}
			
			
			
			
//test16.У���ܷ�ȡ��ע��
			
			//1.����ҵ�
			public AndroidElement click_contacts16() {
				return driver.findElementByAccessibilityId("�ҵ� �ҵ� �� 4 ����ǩ���� 4 ��");
			}
			
			//2.���ע��
			public AndroidElement click_people16() {
				return driver.findElementByAccessibilityId("ע��");	
			}
			
			//3.���ȡ��
			public AndroidElement click_undo() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"ȡ��\"]");
			}
			
				
			public void undo_cancel() {
				action.click(click_contacts16());
				action.click(click_people16());
				action.click(click_undo());

			}
			
			
			
			
	
//test17.У���ܷ��˳���¼����������˺�������ݣ�
			
			//1.����ҵ�
			public AndroidElement click_contacts17() {
				return driver.findElementByAccessibilityId("�ҵ� �ҵ� �� 4 ����ǩ���� 4 ��");
			}
			
			//2.���ע��
			public AndroidElement click_people17() {
				return driver.findElementByAccessibilityId("ע��");	
			}
			
			//3.���ȷ��
			public AndroidElement click_confirm() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"ȷ��\"]");
			}
			
				
			public void cancel_login() {
				action.click(click_contacts17());
				action.click(click_people17());
				action.click(click_confirm());

			}
			
			
			
			
//test18.У���ܷ�ע��(������˺��������)
			
			//1.����ҵ�
			public AndroidElement click_contacts18() {
				return driver.findElementByAccessibilityId("�ҵ� �ҵ� �� 4 ����ǩ���� 4 ��");
			}
			
			//2.���ע��
			public AndroidElement click_people18() {
				return driver.findElementByAccessibilityId("ע��");	
			}
			
			//3.��ѡ������˺��������
			public AndroidElement click_clear() {
				return driver.findElementByXPath("//android.view.View[@content-desc=\"ȷ��ע����¼״̬��\"]");
			}
			
			//4.���ȷ��
			public AndroidElement click_confirm2() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"ȷ��\"]");
			}
			
				
			public void log_off() {
				action.click(click_contacts18());
				action.click(click_people18());
				action.click(click_clear());
				action.click(click_confirm2());

			}
			
			
			
			
//test19.У��ע�����ܷ����µ�¼���˺�
			
			//1.����ҵ�
			public AndroidElement click_contacts19() {
				return driver.findElementByAccessibilityId("�ҵ� �ҵ� �� 4 ����ǩ���� 4 ��");
			}
			
			//2.���ע��
			public AndroidElement click_people19() {
				return driver.findElementByAccessibilityId("ע��");	
			}
			
			//3.��ѡ������˺��������
			public AndroidElement click_clear2() {
				return driver.findElementByXPath("//android.view.View[@content-desc=\"ȷ��ע����¼״̬��\"]");
			}
			
			//4.���ȷ��
			public AndroidElement click_confirm3() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"ȷ��\"]");
			}
			
			//5.ѡ���˺ſ�
			public AndroidElement click_name() {
				return driver.findElementByXPath("//*[@text='�˺�']");
			}
			
			//6.ѡ�������
			public AndroidElement click_pwd() {
				return driver.findElementByXPath("//*[@text='����']");
			}
			
			//7.�����¼
			public AndroidElement click_login() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"ȷ��\"]");
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
			
			
			
			
//test20.У��ע�����ܷ����µ�¼�����˺�
			
			//1.����ҵ�
			public AndroidElement click_contacts20() {
				return driver.findElementByAccessibilityId("�ҵ� �ҵ� �� 4 ����ǩ���� 4 ��");
			}
			
			//2.���ע��
			public AndroidElement click_people20() {
				return driver.findElementByAccessibilityId("ע��");	
			}
			
			//3.��ѡ������˺��������
			public AndroidElement click_clear3() {
				return driver.findElementByXPath("//android.view.View[@content-desc=\"ȷ��ע����¼״̬��\"]");
			}
			
			//4.���ȷ��
			public AndroidElement click_confirm4() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"ȷ��\"]");
			}
			
			//5.ѡ���˺ſ�
			public AndroidElement click_name2() {
				return driver.findElementByXPath("//*[@text='�˺�']");
			}
			
			//6.ѡ�������
			public AndroidElement click_pwd2() {
				return driver.findElementByXPath("//*[@text='����']");
			}
			
			//7.�����¼
			public AndroidElement click_login2() {
				return driver.findElementByXPath("//android.widget.Button[@content-desc=\"ȷ��\"]");
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
