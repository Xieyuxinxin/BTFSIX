package com.example.testnotes;

import android.os.RemoteException;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiCollection;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)//按字符字典顺序执行

public class XuanTest {
    UiDevice mDevice;
    UiCollection collection;

    @Before
    //创建连接
    public void initDevice() throws RemoteException {
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        if (mDevice.isScreenOn()) {//判断当前屏幕是否是亮的
            mDevice.wakeUp();//唤醒屏幕
        }
        int width = mDevice.getDisplayWidth();
        int height = mDevice.getDisplayHeight();
        Log.i("Width:", String.valueOf(width));
        Log.i("Height:", String.valueOf(height));
    }
    //点击邮件图标能否便捷发送邮件
    @Test
    public void testSendEmail() throws InterruptedException {
        UiObject2 addNote = mDevice.findObject(By.text("喧喧"));
        addNote.click();
        Thread.sleep(1000);

        mDevice.findObject(By.desc("联系人\n" +
                "联系人\n" +
                "第 3 个标签，共 4 个")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("解\n" +
                "解宇欣\n" +
                "[离线]   ◇ 客服")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("Email\n" +
                "1518470802@qq.com")).click();
        Thread.sleep(1000);
    }

    //检验能否收藏联系人
    @Test
    public void testCollect() throws InterruptedException {
        UiObject2 addNote = mDevice.findObject(By.text("喧喧"));
        addNote.click();
        Thread.sleep(1000);

        mDevice.findObject(By.desc("我的\n" +"我的\n" +"第 4 个标签，共 4 个")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("解\n" +"解宇欣\n" +"[离线]   ◇ 客服")).click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("收藏")).click();
        Thread.sleep(1000);
    }
}
