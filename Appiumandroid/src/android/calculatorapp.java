package android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;


public class calculatorapp {

	public static void main(String[] args) throws MalformedURLException
	{
	

		
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "8.1"); 
		capabilities.setCapability("deviceName","emulator-5554");
		capabilities.setCapability("platformName","Android");
		
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		AppiumDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(MobileBy.id("com.android.calculator2:id/digit_2")).click();
				driver.findElement(MobileBy.id("com.android.calculator2:id/digit_2")).click();
				driver.findElement(MobileBy.id("com.android.calculator2:id/digit_2")).click();
	}
}

	 


