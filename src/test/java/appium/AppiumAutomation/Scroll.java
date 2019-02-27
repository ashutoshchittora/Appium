package appium.AppiumAutomation;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scroll extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> androidDriver = setsAndroidDriverCapability();
		androidDriver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		// no direct method to scroll , hence we use Android API methods
		androidDriver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
	

	}

}
