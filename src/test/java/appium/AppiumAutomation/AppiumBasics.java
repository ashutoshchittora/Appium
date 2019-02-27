package appium.AppiumAutomation;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumBasics extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> androidDriver = setsAndroidDriverCapability();

		/*
		 * SYNTAX ASSIST : tagName[@attribute='value'] : class name is the
		 * tagNAme here HOW TO USE -> UiAutomator
		 */
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		androidDriver.findElementById("android:id/checkbox").click();
		androidDriver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		androidDriver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		androidDriver.findElementsByClassName("android.widget.Button").get(1).click();

	}
}
