package com.example.myapplication1102;

import androidx.test.uiautomator.By;

import org.junit.Test;

public class XuanTest extends BaseTestXuan{
    //退出当前登录
    @Test
    public void loggout() throws InterruptedException {
        mDevice.findObject(By.desc("我的\n" + "我的\n" + "第 4 个标签，共 4 个")).click();
        mDevice.findObject(By.text("注销")).click();
        mDevice.findObject(By.desc("确定")).click();
    }


    //登录何佳账号
    @Test
    public void login() {
        mDevice.findObject(By.text("账号")).setText("何佳");
        mDevice.findObject(By.text("密码")).setText("123456");
        mDevice.findObject(By.desc("登录")).click();
    }


    //在联系人中找到小诶，并与她聊天
    @Test
    public void chat(){
        mDevice.findObject(By.desc("联系人\n" + "联系人\n" + "第 3 个标签，共 4 个")).click();
        mDevice.findObject(By.desc("小\n" + "小诶\n" + "[离线]")).click();
        mDevice.findObject(By.desc("开聊")).click();
        mDevice.findObject(By.text("发送消息")).setText("小诶，你好！");
        mDevice.findObject(By.desc("发送")).click();

    }


    //创建我与小诶，小毕的聊天组
    @Test
    public void createTeam(){
        mDevice.findObject(By.desc("聊天\n" + "聊天\n" + "第 1 个标签，共 4 个")).click();
        mDevice.findObject(By.desc("创建聊天")).click();
        mDevice.findObject(By.desc("小\n" + "小诶")).click();
        mDevice.findObject(By.desc("小\n" + "小毕")).click();
        mDevice.findObject(By.clazz("com.cnezsoft.xxm","android.widget.Button")).click();
        mDevice.findObject(By.text("输入讨论组名称")).setText("何诶毕");
        mDevice.findObject(By.desc("创建")).click();
    }


    //在三人聊天组里发消息
    @Test
    public void speak(){
        mDevice.findObject(By.text("发送消息")).setText("hello,我是何佳");
        mDevice.findObject(By.desc("发送")).click();

    }

}
