package com.example.sxtestapplication;

import android.util.Log;

import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiCollection;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

public class XuanTest extends BaseTest{

    //登陆账号为gjgj


    //1、测试查看聊天会话成员资料 testShow()
    @Test
    public void testMethod1() throws InterruptedException{
        //选择联系人
        mDevice.findObject(By.desc("L\n" +"lyz2\n" +"[离线]")).click();
        Thread.sleep(3000);
        //点击会话对象头像
        mDevice.findObject(By.desc("L")).click();
        Thread.sleep(3000);

    }

    //2、测试个人主页中聊天快捷按钮能否正常跳转到聊天框 test_QuickChat()
    @Test
    public void test_Method2() throws InterruptedException{
        //此用例在testShow（查看会话对象资料）之后运行，省去前方步骤

//        //选择联系人
//        mDevice.findObject(By.desc("L\n" +"lyz2\n" +"[离线]")).click();
//        Thread.sleep(3000);
//        //点击会话对象头像
//        mDevice.findObject(By.desc("L")).click();
//        Thread.sleep(6000);
        //点击主页中的快捷聊天按钮
        mDevice.findObject(By.desc("开聊")).click();
        Thread.sleep(3000);
        //为方便后续操作，回到初始界面
        mDevice.findObject(By.desc("返回")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.desc("返回")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.desc("返回")).click();
        Thread.sleep(3000);
    }

    //3、测试正确操作能否成功创建一对一新会话  test_AddSession()
    @Test
    public void test_Method3() throws InterruptedException, UiObjectNotFoundException {
        //点击右上方新建
        mDevice.findObject(By.desc("创建聊天")).click();
        Thread.sleep(3000);
        //选择联系人
        mDevice.findObject(By.desc("L\n" +"lyz1")).click();
        Thread.sleep(3000);
        //点击保存
        mDevice.findObject(new UiSelector().className("android.widget.Button").index(2)).click();
        Thread.sleep(3000);
        //为方便后续操作，回到初始界面
        mDevice.findObject(By.desc("返回")).click();
    }

    //4、收藏一对一会话  test_Collection()
    @Test
    public void test_Method4() throws InterruptedException {

        //选择联系人
        mDevice.findObject(By.desc("L\n" +"lyz2\n" +"[离线]")).click();
        Thread.sleep(3000);
        //点击右上角“更多”
        mDevice.findObject(By.desc("显示菜单")).click();
        Thread.sleep(3000);
        //点击“收藏”
        mDevice.findObject(By.desc("收藏")).click();
        Thread.sleep(3000);



    }

    //5、取消收藏一对一对话  test_CancelCol()
    @Test
    public void test_Method5() throws InterruptedException {
        //此用例接在收藏会话后，省去前方步骤
//        //选择联系人
//        mDevice.findObject(By.desc("L\n" +"lyz1\n" +"[离线]")).click();
//        Thread.sleep(3000);
        //点击右上角“更多”
        mDevice.findObject(By.desc("显示菜单")).click();
        Thread.sleep(3000);
        //点击“收藏”
        mDevice.findObject(By.desc("取消收藏")).click();
        Thread.sleep(3000);
        //为方便后续操作，回到初始界面
        mDevice.findObject(By.desc("返回")).click();

    }


//
//    //6、测试创建多人群组会话时取消创建能否成功 testCancelAddGroup()
//    @Test
//    public void testMethod6() throws InterruptedException, UiObjectNotFoundException {
//        //点击"讨论组"
//        mDevice.findObject(By.desc("讨论组\n" +"讨论组\n" +"第 2 个标签，共 4 个")).click();
//        Thread.sleep(3000);
//        //点击右上角新建
//        mDevice.findObject(By.desc("创建聊天")).click();
//        Thread.sleep(3000);
//        //选择联系人
//        mDevice.findObject(By.desc("L\n" +"lyz1")).click();
//        mDevice.findObject(By.desc("L\n" +"lyz2")).click();
//        Thread.sleep(3000);
//        //点击“保存”
//        mDevice.findObject(new UiSelector().className("android.widget.Button").index(2)).click();
//        Thread.sleep(5000);
//        //点击取消
//        mDevice.findObject(By.desc("取消")).click();
//        Thread.sleep(3000);
//        //为方便后续操作，回到初始界面
//        mDevice.findObject(By.desc("返回")).click();
//        Thread.sleep(3000);
//
//    }
//
//
//    //7、收藏群组会话  testColGroup()
//    @Test
//    public void testMethod7() throws InterruptedException {
//        //点击"讨论组"
//        mDevice.findObject(By.desc("讨论组\n" +"讨论组\n" +"第 2 个标签，共 4 个")).click();
//        Thread.sleep(3000);
//        //选择讨论组
//        mDevice.findObject(By.desc("群\n" +"今天学习了吗")).click();
//        Thread.sleep(3000);
//        //点击右上角“更多”
//        mDevice.findObject(By.desc("显示菜单")).click();
//        Thread.sleep(3000);
//        //点击“收藏”
//        mDevice.findObject(By.desc("收藏")).click();
//        Thread.sleep(3000);
//        //为方便后续操作，回到初始界面
//        mDevice.findObject(By.desc("返回")).click();
//        Thread.sleep(3000);
//
//    }
//
//
////
//    //7、测试群组会话能否正常实现重命名功能  testRenameGroup()
//    @Test
//    public void testMethod8() throws InterruptedException {
//        //点击"讨论组"
//        mDevice.findObject(By.desc("讨论组\n" +"讨论组\n" +"第 2 个标签，共 4 个")).click();
//        Thread.sleep(3000);
//        //选择讨论组
//        mDevice.findObject(By.desc("群\n" +"今天学习了吗")).click();
//        Thread.sleep(3000);
//        //点击右上角“更多”
//        mDevice.findObject(By.desc("显示菜单")).click();
//        Thread.sleep(3000);
//        //点击“重命名”
//        mDevice.findObject(By.desc("重命名")).click();
//        Thread.sleep(3000);
//        //重新输入新名字
//        mDevice.findObject(By.text("今天学习了吗, 今天学习了吗")).setText("快去学习");
//        Thread.sleep(3000);
//        //点击“重命名”
//        mDevice.findObject(By.desc("重命名")).click();
//        Thread.sleep(3000);
//
//    }
//
//    //9、测试讨论组中@功能  testAite()
//    @Test
//    public void testMethod9() throws InterruptedException, UiObjectNotFoundException {
//        //点击"讨论组"
//        mDevice.findObject(By.desc("讨论组\n" +"讨论组\n" +"第 2 个标签，共 4 个")).click();
//        Thread.sleep(3000);
//        //选择讨论组
//        mDevice.findObject(By.desc("群\n" +"快去学习")).click();
//        Thread.sleep(3000);
//        //输入“@”
//        mDevice.findObject(By.text("发送消息")).setText("@");
//        //mDevice.findObject(new UiSelector().className("android.widget.EditText").index(3)).setText("@");
//        Thread.sleep(3000);
//        //选择联系人
//        mDevice.findObject(By.desc("G\n" +"gj")).click();
//        Thread.sleep(3000);
//        //点击“保存”
//        mDevice.findObject(new UiSelector().className("android.widget.Button").index(2)).click();
//        Thread.sleep(3000);
//        //点击“发送”
//        mDevice.findObject(By.desc("发送")).click();
//        Thread.sleep(3000);
//        //为方便后续操作，回到初始界面
//        mDevice.findObject(By.desc("返回")).click();
//        Thread.sleep(3000);
//    }

    //10、测试群组成员能否正常退出群组会话 testQuitGroup()
//    @Test
 //   public void testMethod10() throws InterruptedException, UiObjectNotFoundException {
//        //退出当前帐号
//        //点击“我的”
//        mDevice.findObject(By.desc("我的\n" +"我的\n" +"第 4 个标签，共 4 个")).click();
//        Thread.sleep(3000);
//        //点击“注销”
//        mDevice.findObject(By.desc("注销")).click();
//        Thread.sleep(3000);
//        //点击“确认”
//        mDevice.findObject(By.desc("确认")).click();
//        Thread.sleep(3000);
//        //登录新帐号
//        //输入用户名
//        mDevice.findObject(By.text("gjgj, 账号")).setText("lyz2, 账号");
//        Thread.sleep(3000);
//        //输入密码
//        mDevice.findObject(new UiSelector().className("android.widget.EditText").index(2)).setText("123456, 密码");
//        Thread.sleep(3000);
//        //登录
//        mDevice.findObject(By.desc("登录")).click();
//
//        //退出讨论组
//        //点击"讨论组"
//        mDevice.findObject(By.desc("讨论组\n" +"讨论组\n" +"第 2 个标签，共 4 个")).click();
//        Thread.sleep(3000);
//        //选择讨论组
//        mDevice.findObject(By.desc("群\n" +"今天学习了吗")).click();
//        Thread.sleep(3000);
//        //点击右上角“更多”
//        mDevice.findObject(By.desc("显示菜单")).click();
//        Thread.sleep(3000);
//        //点击“退出讨论组”
//        mDevice.findObject(By.desc("退出讨论组")).click();
//        Thread.sleep(3000);
//        //点击“确认”
//        mDevice.findObject(By.desc("确认")).click();
//        Thread.sleep(3000);
//    }









}
