package appium.AppiumAutomation;

import java.net.MalformedURLException;
import java.util.Scanner;

import io.appium.java_client.android.AndroidDriver;

public class TestAppInitialization {

	public static void main(String[] args) throws MalformedURLException {

		System.out.println("Enter the app name you wish to initialize - 1.Saavn , 2.Hungama , 3.Gaana , 4.Raaga , 5.Bookmyshow");
		Scanner sc = new Scanner(System.in);
		
		CommonBaseApp app = new CommonBaseApp(sc.nextLine());
		AndroidDriver androidDriver = app.setsAndroidDriverCapability();
		

	}

}
