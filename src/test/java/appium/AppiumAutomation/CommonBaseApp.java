package appium.AppiumAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonBaseApp {
	
	/*Raaga - asetup email in future if needed --> appiumautomatemobile@gmail.com*/

	String initializeApp;
	String apkPath;

	public CommonBaseApp(String initializeApp) {
		super();
		this.initializeApp = initializeApp;
	}

	public AndroidDriver setsAndroidDriverCapability() throws MalformedURLException {

		AndroidDriver androidDriver;

		String dir = System.getProperty("user.dir");

		if (initializeApp.equalsIgnoreCase("Saavn")) {
			apkPath = dir + "\\" + "resources" + "\\" + "app" + "\\" + "Saavn Music Radio_v6.0.1_apkpure.com.apk";

		} else if (initializeApp.equalsIgnoreCase("Bookmyshow")) {
			apkPath = dir + "\\" + "resources" + "\\" + "app" + "\\"
					+ "BookMyShow Entertainment_v5.4.17_apkpure.com.apk";

		} else if (initializeApp.equalsIgnoreCase("Gaana")) {
			apkPath = dir + "\\" + "resources" + "\\" + "app" + "\\"
					+ "Gaana Music Hindi Tamil Telugu MP3 Songs Online_v7.8.9.1_apkpure.com.apk";

		}else if (initializeApp.equalsIgnoreCase("Raaga")) {
			apkPath = dir + "\\" + "resources" + "\\" + "app" + "\\"
					+ "Raaga Hindi Tamil Telugu songs and podcasts_v7.0.8_apkpure.com.apk";

		} else {
			apkPath = dir + "\\" + "resources" + "\\" + "app" + "\\"
					+ "Hungama Music Songs Radio Videos_v5.1.5_apkpure.com.apk";
		}

		// File file = new File(apkPath);

		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.9.1");
		dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
		dcap.setCapability(MobileCapabilityType.APP, apkPath);

		androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dcap);
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Common class invoked the app - "+initializeApp);

		return androidDriver;

	}

}
