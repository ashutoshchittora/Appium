package appium.AppiumAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	/*
	 * EITHER of below will work
	 * dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
	 * OR dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "DemoNexus5X");
	 * 
	 * 
	 * FOR real devices use as below :
	 * dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
	 */

	public static AndroidDriver<AndroidElement> setsAndroidDriverCapability() throws MalformedURLException {

		AndroidDriver<AndroidElement> androidDriver;

		String dir = System.getProperty("user.dir");
		String apkPath = dir + "\\" + "resources" + "\\" + "app" + "\\" + "ApiDemos-debug.apk";
		// File file = new File(apkPath);

		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.9.1");
		dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
		dcap.setCapability(MobileCapabilityType.APP, apkPath);

		androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dcap);
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Base class : Successfully clicked API-demos app ... ");

		return androidDriver;

	}

}
