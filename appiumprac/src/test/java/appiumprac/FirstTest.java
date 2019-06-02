package appiumprac;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FirstTest {

	static AppiumDriver<MobileElement> driver;
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
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		//cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		cap.setCapability("Appium --chromedriver-executable", "E:\\Selenium\\Software\\chromedriver.exe");
				
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver= new AndroidDriver<MobileElement>(url,cap);
		//driver.get("https://google.com");
		
		System.out.println("Application is launched");
		
		WebElement two= driver.findElementById("com.sec.android.app.popupcalculator:id/bt_02");
		WebElement three= driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_03"));
		WebElement plus= driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
		WebElement result= driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult"));
		two.click();
		three.click();
		plus.click();
		three.click();
		two.click();
		System.out.println(result.getText());		
		if(Integer.parseInt(result.getText())==56)
			System.out.println("Result is correctly displayed");
		else
			System.out.println("Wrong result");
		driver.quit();
	}
}

