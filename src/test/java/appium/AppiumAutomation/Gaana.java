package appium.AppiumAutomation;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gaana {

	public static void main(String[] args) throws MalformedURLException {

		CommonBaseApp cBApp = new CommonBaseApp("Gaana");
		AndroidDriver<AndroidElement> androidDriver = cBApp.setsAndroidDriverCapability();
		androidDriver.findElementById("com.android.packageinstaller:id/permission_deny_button").click();
		
		//androidDriver.findElementById("com.gaana:id/dialog_explanation_cancel");
		/*List<AndroidElement> listLang = androidDriver.findElementsByClassName("android.widget.ListView");
		System.out.println(listLang.size());
		List<AndroidElement> listImage = androidDriver.findElementsByClassName("android.widget.ImageView");
		System.out.println(listImage.size());
		List<AndroidElement> listImageSelected = androidDriver.findElementsById("com.gaana:id/language_selected");
		System.out.println(listImageSelected.size());		
		List<AndroidElement> listLangId = androidDriver.findElementsById("com.gaana:id/language_name");
		System.out.println(listLangId.size());
		
		List<AndroidElement> listRelLay = androidDriver.findElementsByClassName("android.widget.RelativeLayout");
		System.out.println(listRelLay.size());*/
		
		/*androidDriver.findElementByXPath("(//android.widget.RelativeLayout)[1]").click();
		androidDriver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();*/
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='SKIP']").click();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='SKIP']").click();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='SKIP']").click();
		
		//androidDriver.findElementByXPath("//android.widget.FrameLayout[contains(@resource-id,'com.gaana:id/action_radio') and @index='3']");
		androidDriver.findElementById("com.gaana:id/action_radio").click();
		//xpath("//android.widget.LinearLayout[@index='1']/android.widget.Button[@index='1']")
		/*If you have multiple UI elements with same resource id you can make use of index along with resource-id.*/
		//WebElement element=driver.findElements(By.id("your_id")).get(1);
		// try this -> androidDriver.findElement(By.xpath("android.widget.RelativeLayout[@index='2']")).isDisplayed()
		//androidDriver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ViewAnimator[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]");
		//android.widget.LinearLayout[@resource-id="foo"]/android.widget.RelativeLayout
		
		androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popular Gaana Radios\"));"));
		//androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.gaana:id/header.text\"));"));
		//androidDriver.findElementById("com.gaana:id/header.text").click();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Popular Gaana Radios']").click();
		
		androidDriver.findElementById("com.gaana:id/menu_icon").click();
		androidDriver.findElementById("com.gaana:id/tvTopHeading").click();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Push Notifications']").click();
	}

}