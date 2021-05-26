package com.example.xuanxuan;

import android.os.RemoteException;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiCollection;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.Test;

public class DiscussionGroupTest {
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

    //建立新的讨论组
    @Test
    public void test_add_group() throws InterruptedException {
        UiObject2 xuanxuan = mDevice.findObject(By.text("xuanxuan"));
        xuanxuan.click();
        Thread.sleep(1000);
        mDevice.findObject(By.desc("讨论组")).click();
        mDevice.findObject(By.desc("创建聊天")).click();
        mDevice.findObject(By.desc("Aadmin")).click();
        mDevice.findObject(By.desc("Ttest2")).click();
        mDevice.findObject(By.desc("Mmonkeytest")).click();
        mDevice.click(850,100);
        mDevice.findObject(By.text("输入讨论组名称")).setText("新建讨论组");
        mDevice.findObject(By.desc("创建")).click();
        mDevice.findObject(By.desc("返回")).click();
    }
    //收藏讨论组
    @Test
    public void test_collect_group(){
        mDevice.findObject(By.text("test")).click();
        mDevice.findObject(By.desc("显示菜单")).click();
        mDevice.findObject(By.desc("收藏")).click();
        mDevice.findObject(By.desc("返回")).click();
    }
    //取消收藏讨论组
    public void test_cancle_collect() {
        mDevice.findObject(By.text("test")).click();
        mDevice.findObject(By.desc("显示菜单")).click();
        mDevice.findObject(By.desc("取消收藏")).click();
        mDevice.findObject(By.desc("返回")).click();
    }
    //查看成员列表
    //重命名讨论组
    public void test_rename_group(){
        mDevice.findObject(By.text("test")).click();
        mDevice.findObject(By.desc("显示菜单")).click();
        mDevice.findObject((By.desc("重命名"))).click();
        mDevice.findObject(By.text("输入讨论组名称")).setText("test2");
        mDevice.findObject(By.desc("重命名")).click();
        mDevice.findObject(By.desc("返回")).click();
    }
    //退出讨论组
    public void test_sign_out_group(){
        mDevice.findObject(By.text("test2")).click();
        mDevice.findObject(By.desc("显示菜单")).click();
        mDevice.findObject(By.desc("退出讨论组")).click();
        mDevice.findObject(By.desc("确认")).click();
    }

}
