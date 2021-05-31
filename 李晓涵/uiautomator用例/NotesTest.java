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
public class NotesTest {
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

    //通过群聊发送消息
    @Test
    public void testSystemAll() throws InterruptedException {
        //找到groupChat并点击
        UiObject2 groupChat = mDevice.findObject(By.desc("群\n" +
                "北镇抚司高层-诏狱基地"));
        groupChat.click();
        Thread.sleep(1000);

        //找到消息框并输入消息内容
        mDevice.findObject(By.text("发送消息")).setText("大人，您在吗陆大人？");
        Thread.sleep(1000);
        //点击发送
        mDevice.findObject(By.desc("发送")).click();
        Thread.sleep(1000);
    }

    //重命名群聊
    @Test
    public void testRenameGroup() throws InterruptedException, UiObjectNotFoundException {
        //找到groupChat并点击
        UiObject2 groupChat = mDevice.findObject(By.desc("群\n" +
                "江湖侠客"));
        groupChat.click();
        Thread.sleep(1000);

        //点击“显示菜单”
        mDevice.findObject(By.desc("显示菜单")).click();
        Thread.sleep(1000);

        //点击“重命名”
        mDevice.findObject(By.desc("重命名")).click();
        Thread.sleep(1000);

        mDevice.findObject(By.text("江湖侠客, 江湖侠客")).setText("袁今夏后援队");
        Thread.sleep(1000);

        mDevice.findObject(By.desc("重命名")).click();
        Thread.sleep(1000);
    }

    //将联系人设为星标
    @Test()
    public void testSetStar() throws InterruptedException, UiObjectNotFoundException {
        //找到常用联系人
        UiObject2 groupChat = mDevice.findObject(By.desc("陆绎\n" +
                "[在线]"));
        groupChat.click();
        Thread.sleep(1000);

        //点击“显示菜单”
        mDevice.findObject(By.desc("显示菜单")).click();
        Thread.sleep(1000);

        //点击“收藏”
        mDevice.findObject(By.desc("收藏")).click();
        Thread.sleep(1000);
    }

    @Test
    //向联系人发送图片
    public void testUpdate() throws InterruptedException {
        //找到常用联系人
        UiObject2 groupChat = mDevice.findObject(By.desc("陆绎\n" +
                "[在线]"));
        groupChat.click();
        Thread.sleep(1000);

        //点击“发送其他内容”
        mDevice.findObject(By.desc("发送其他内容")).click();
        Thread.sleep(1000);

        //点击“照片”
        mDevice.findObject(By.desc("照片")).click();
        Thread.sleep(1000);

        //点击图片
        mDevice.findObject(By.res("com.android.documentsui:id/icon_mime")).click();
        Thread.sleep(1000);
    }

}

