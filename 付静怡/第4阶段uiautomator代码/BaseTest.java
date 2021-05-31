package com.example.ch12uiautomator_new;
import android.app.Instrumentation;
import android.os.RemoteException;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import org.junit.Before;

public class BaseTest {
    Instrumentation mInstrumentation;
    UiDevice mDevice;
    @Before
    public void starUp() throws RemoteException, InterruptedException {
        mInstrumentation = InstrumentationRegistry.getInstrumentation();
        mDevice = UiDevice.getInstance(mInstrumentation);
        boolean status = mDevice.isScreenOn();
        if (!status) {
            mDevice.wakeUp();
        }
        mDevice.pressHome();
        mDevice.findObject(By.text("喧喧")).click();
        Thread.sleep(3000);
    }
}
