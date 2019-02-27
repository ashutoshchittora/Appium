package appium.AppiumAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class YoutubeTest {
	static AndroidDriver androidDriver;

	/*
	 * Pre- requisite : Youtube needs to be installed in the mobile phone The appium server should be started OR The mobile needs to be connected to
	 * laptop using usb cable
	 * 
	 * open cmd 
	 * (1) run $adb devices to check connected devices if this doe snot show your device then kill and start adb server as adb kill-server and then
	 * $adb start-server 
	 * (2) $adb shell  
	 * (3) $dumpsys window windows | grep -E ‘mCurrentFocus’ OR use $dumpsys window windows | grep -E ‘mFocusedApp’  
	 * OR 
	 * Download “APK Info” app from Google Play Store on your android mobile to get app.package and app.activity
	 * -----------------------------------------------------------------------
	 * app package is the name by which android understands what app to invoke. 
	 * app activity is the functionality to be invoked after the app starts
	 * 
	 * app package for youtube = com.google.android.youtube AND app package for
	 * youtube :com.google.android.apps.youtube.app.WatchWhileActivity
	 * -------------------------------------------------------------------------
	 * 
	 * FOR real devices : dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device"); 
	 * FOR emulators : dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
	 * ------------------------------------------------------------------------
	 * To do app testing there are 2 ways : 
	 * 1) get the apk of that app from 'APK extractor' ( play store ) and put apk under resources folder. 
	 * 2) install app on a real device and connect the mobile using usb and run $ adb devices followed by app.package
	 * 
	 * Download the apk(s) -->  you can get the apk from 'apkpure.com'
	 */

	public static void main(String[] args) throws MalformedURLException {


		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "DemoNexus5X");
		dcap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		dcap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.9.1");
		dcap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.youtube");
		dcap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
				"com.google.android.apps.youtube.app.WatchWhileActivity");

		androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dcap);
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Youtube opened successfully ... ");


	}

}
