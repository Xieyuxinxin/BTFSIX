package com.example.sxtestapplication;


import android.os.RemoteException;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;

import org.junit.Before;


public class BaseTest {
    static UiDevice mDevice;
    @Before
    public void initDevice() throws RemoteException, InterruptedException {

        //获取设备，连接模拟器
        mDevice=UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        if(mDevice.isScreenOn()){
            mDevice.wakeUp();
        }
        mDevice.pressHome();//回到主界面
        UiObject2 todolist1=mDevice.findObject(By.text("喧喧"));
        todolist1.click();
        Thread.sleep(8000);
    }

}
