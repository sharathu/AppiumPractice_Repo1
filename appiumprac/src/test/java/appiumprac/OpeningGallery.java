package appiumprac;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class OpeningGallery {
	static AndroidDriver<MobileElement> driver;
	public static void main(String[]args) throws Exception
	{
		openCalculator();
	}
	
	public static void openCalculator() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Software\\chromedriver.exe");
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "Android SDK built for x86");
		//cap.setCapability("udid", "emulator-5554");
		cap.setCapability("udid", "52039672f0a1a343");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.1.1");
		cap.setCapability("appPackage", "com.sec.android.gallery3d");
		cap.setCapability("appActivity", "com.sec.android.gallery3d.app.GalleryOpaqueActivity");
		
				
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver= new AndroidDriver<MobileElement>(url,cap);
		System.out.println("Application has been launched");
		
}
}