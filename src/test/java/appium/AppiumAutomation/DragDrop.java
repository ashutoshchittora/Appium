package appium.AppiumAutomation;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragDrop extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> androidDriver = setsAndroidDriverCapability();
		androidDriver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		androidDriver.findElement(MobileBy.AndroidUIAutomator("text(\"Drag and Drop\")")).click();
		TouchAction touchAction = new TouchAction(androidDriver);
		/*
		 * longPress - move from source WebElement TO destination WebElement to
		 * , and then release
		 */

		/*
		 * WebElement source = androidDriver
		 * .findElement(MobileBy.AndroidUIAutomator(
		 * "resource-id(\"io.appium.android.apis:id//drag_dot_1\")"));
		 * WebElement destination = androidDriver
		 * .findElement(MobileBy.AndroidUIAutomator(
		 * "resource-id(\"io.appium.android.apis:id//drag_dot_3\")"));
		 */
		WebElement source = androidDriver.findElementsByClassName("android.view.View").get(0);
		WebElement desti = androidDriver.findElementsByClassName("android.view.View").get(2);

		/*
		 * touchAction.longPress(longPressOptions().withElement(element(source))
		 * .withDuration(ofSeconds(2)))
		 * .moveTo(element(desti)).release().perform();
		 * 
		 * instead of above snippet use below short code if only LongPress is to
		 * be used, ealries we used .withDuration as well so LongPressOptions()
		 * was used
		 */
		touchAction.longPress(element(source)).moveTo(element(desti)).release().perform();
	}

}
