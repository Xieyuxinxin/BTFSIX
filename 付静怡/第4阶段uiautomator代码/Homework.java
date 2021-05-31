package com.example.ch12uiautomator_new;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiSelector;
import org.junit.Test;

public class Homework extends BaseTest{
    //成功退出
    @Test
    public void testLogout1() throws InterruptedException {
        mDevice.findObject(By.desc("我的\n" + "我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.desc("注销")).click();
        mDevice.findObject(By.desc("确认")).click();
        Thread.sleep(3000);
    }

    //成功退出-清空记录
    @Test
    public void testLogout2() throws InterruptedException {
        mDevice.findObject(By.desc("我的\n" + "我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.desc("注销")).click();
        mDevice.findObject(By.desc("注销后，你可以重新登录或者使用其他账户进行登录。\n" +
                "清除本账号相关数据")).click();
        mDevice.findObject(By.desc("确认")).click();
        Thread.sleep(3000);
    }

    //取消退出
    @Test
    public void testLogout3() throws InterruptedException {
        mDevice.findObject(By.desc("我的\n" + "我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.desc("注销")).click();
        mDevice.findObject(By.desc("取消")).click();
        Thread.sleep(3000);
    }

    //成功登录-使用用户名和密码
    @Test
    public void testLogin1() throws InterruptedException {
        mDevice.findObject(By.desc("我的\n" + "我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.desc("注销")).click();
        mDevice.findObject(By.desc("确认")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("http://10.7.90.234:11443,服务器")).clear();
        mDevice.findObject(By.text("fjy1,账号")).clear();
        mDevice.findObject(By.text("•••••••••••••••••••••••••••••••••••••••••••••••,密码")).clear();
        mDevice.findObject(By.text("服务器")).setText("http://10.7.90.234:11443");
        mDevice.findObject(By.text("账号")).setText("fjy1");
        mDevice.findObject(By.text("密码")).setText("123456");
        mDevice.findObject(By.desc("登录")).click();
    }

    //成功登录-使用邮箱和密码
    @Test
    public void testLogin2() throws InterruptedException {
        mDevice.findObject(By.desc("我的\n" + "我的\n" + "第 4 个标签，共 4 个")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.desc("注销")).click();
        mDevice.findObject(By.desc("确认")).click();
        Thread.sleep(3000);
        mDevice.findObject(By.text("http://10.7.90.234:11443,服务器")).clear();
        mDevice.findObject(By.text("fjy1,账号")).clear();
        mDevice.findObject(By.text("•••••••••••••••••••••••••••••••••••••••••••••••,密码")).clear();
        mDevice.findObject(By.text("服务器")).setText("http://10.7.90.234:11443");
        Thread.sleep(3000);
        mDevice.findObject(By.text("账号")).setText("1@qq.com");
        mDevice.findObject(By.text("密码")).setText("123456");
        mDevice.findObject(By.desc("登录")).click();
    }

    //登录-使用正确密码+空格
    @Test
    public void testLogin3() throws InterruptedException {
        mDevice.findObject(By.text("服务器")).setText("http://10.7.90.234:11443");
        Thread.sleep(3000);
        mDevice.findObject(By.text("账号")).setText("fjy1");
        mDevice.findObject(By.text("密码")).setText("123456 ");
        mDevice.findObject(By.desc("登录")).click();
    }

    //登录-使用正确用户名+空格
    @Test
    public void testLogin4() throws InterruptedException {
        mDevice.findObject(By.text("服务器")).setText("http://10.7.90.234:11443");
        Thread.sleep(3000);
        mDevice.findObject(By.text("账号")).setText("fjy1 ");
        mDevice.findObject(By.text("密码")).setText("123456");
        mDevice.findObject(By.desc("登录")).click();
    }

    //登录-使用正确密码（密码为空格）
    @Test
    public void testLogin5() throws InterruptedException {
        mDevice.findObject(By.text("服务器")).setText("http://10.7.90.234:11443");
        Thread.sleep(3000);
        mDevice.findObject(By.text("账号")).setText("akyy");
        mDevice.findObject(By.text("密码")).setText("      ");
        mDevice.findObject(By.desc("登录")).click();
    }

    //登录-使用错误的服务器地址（地址错误）
    @Test
    public void testLogin6() throws InterruptedException {
        mDevice.findObject(By.text("服务器")).setText("http://10.7.90.233:11443");
        Thread.sleep(3000);
        mDevice.findObject(By.text("账号")).setText("fjy1");
        mDevice.findObject(By.text("密码")).setText("123456");
        mDevice.findObject(By.desc("登录")).click();
    }

    //登录-使用错误的服务器地址（格式错误）
    @Test
    public void testLogin7() throws InterruptedException {
        mDevice.findObject(By.text("服务器")).setText("http://10.7.90.234");
        Thread.sleep(3000);
        mDevice.findObject(By.text("账号")).setText("fjy1");
        mDevice.findObject(By.text("密码")).setText("123456");
        mDevice.findObject(By.desc("登录")).click();
    }


}
