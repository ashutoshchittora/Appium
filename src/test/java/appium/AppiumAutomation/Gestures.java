package appium.AppiumAutomation;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> androidDriver = setsAndroidDriverCapability();
		androidDriver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		WebElement expandList = androidDriver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");

		// Tapping gesture using TouchActions class
		TouchAction touchAction = new TouchAction(androidDriver);
		touchAction.tap(tapOptions().withElement(element(expandList))).perform();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();

		// Long Press
		WebElement peopleNames = androidDriver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		touchAction.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release()
				.perform();
		androidDriver.findElementById("android:id/title").isDisplayed();

		System.out.println("Gestures passed ...");

	}

}
