package appiumprac;


	import java.net.URL;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;

	public class SecondTest {


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
			cap.setCapability("appPackage", "com.android.settings");
			cap.setCapability("appActivity", "com.android.settings.Settings");
			//cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			//cap.setCapability("Appium --chromedriver-executable", "E:\\Selenium\\Software\\chromedriver.exe");
					
			URL url= new URL("http://127.0.0.1:4723/wd/hub");
			driver= new AndroidDriver<MobileElement>(url,cap);
			
			Thread.sleep(3000);
/*			 driver.findElementByXPath("//android.widget.ImageView[@elementId='2']").click();*/
			 
			 //vertical scrolling
			 MobileElement element=(MobileElement)driver.findElement(
					 MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
					 		+ "new UiSelector().text(\"About phone\"));"));
			 element.click();
			 System.out.println("Element has been located and clicked");
			 driver.quit();
			 System.out.println("Application is closed");
		}
	}
