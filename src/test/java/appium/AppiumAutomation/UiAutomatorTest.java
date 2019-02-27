package appium.AppiumAutomation;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiAutomatorTest extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> androidDriver = setsAndroidDriverCapability();
		/*
		 * SYNTAX ASSIST :
		 * androidDriver.findElement(MobileBy.AndroidUIAutomator(
		 * "attribute(value)")); The 'text' is a property here.
		 */
		androidDriver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		androidDriver.findElement(MobileBy.AndroidUIAutomator("text(\"Animation\")")).click();

		/*
		 * validate clickable feature for all options when property ( not
		 * attribute) needs to be identified . clickable is a property here. new
		 * UiSelector().clickable(true)" = Android API code & not appium code
		 */
		int clickableAndoridElementCount = androidDriver
				.findElements(MobileBy.AndroidUIAutomator("new UiSelector().clickable(true)")).size();
		System.out.println(clickableAndoridElementCount);

	}

}
