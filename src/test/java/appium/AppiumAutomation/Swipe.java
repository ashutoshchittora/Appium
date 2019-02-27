package appium.AppiumAutomation;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Swipe extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> androidDriver = setsAndroidDriverCapability();
		androidDriver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		androidDriver.findElement(MobileBy.AndroidUIAutomator("text(\"2. Inline\")")).click();
		androidDriver.findElementByXPath("//*[@content-desc='9']").click();

		TouchAction touchAction = new TouchAction(androidDriver);
		/*
		 * SWIPE is longPress on element for 2 seconds , move to another element
		 * and release.
		 */
		WebElement handClock15 = androidDriver.findElementByXPath("//*[@content-desc='15']");
		WebElement handClock45 = androidDriver.findElementByXPath("//*[@content-desc='45']");
		touchAction.longPress(longPressOptions().withElement(element(handClock15)).withDuration(ofSeconds(2)))
				.moveTo(element(handClock45)).release().perform();
	}

}
