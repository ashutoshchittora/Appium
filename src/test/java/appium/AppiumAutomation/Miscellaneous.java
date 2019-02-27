package appium.AppiumAutomation;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Miscellaneous extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> androidDriver = setsAndroidDriverCapability();

		// validate activity , context of the app (Native , Hybrid ,WebView)
		System.out.println(androidDriver.currentActivity());
		System.out.println(androidDriver.getContext());

		// Views --- orientation , locked
		System.out.println(androidDriver.getOrientation());
		System.out.println(androidDriver.isDeviceLocked());

		// hide keyboard --- USE androidDriver.hideKeyboard();
		androidDriver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		Thread.sleep(2000);
		androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));

	}

}
