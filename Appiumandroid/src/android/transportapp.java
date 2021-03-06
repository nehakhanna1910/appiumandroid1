package android;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class transportapp {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();

		File appDir= new File("src");
		File app = new File(appDir,"transport.apk");
		
		capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
        capabilities.setCapability("platformVersion", "8.1"); 
		capabilities.setCapability("deviceName","emulator-5554");
		capabilities.setCapability("platformName","Android");
		
		capabilities.setCapability("appPackage", "com.app.tsrtc");
		capabilities.setCapability("appActivity", "com.tsrtc.online.mini.WelcomeScreen");
		
		AppiumDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(MobileBy.id("com.app.tsrtc:id/btn_skip")).click();
		driver.findElement(MobileBy.id("com.app.tsrtc:id/sourceTextView")).click();
		driver.findElement(MobileBy.id("android:id/search_src_text")).sendKeys("hyderabad");
		driver.findElement(MobileBy.id("com.app.tsrtc:id/cv1")).click();
		
		driver.findElement(MobileBy.id("com.app.tsrtc:id/destinationTextView")).click();
		driver.findElement(MobileBy.id("android:id/search_src_text")).sendKeys("bengaluru");
		driver.findElement(MobileBy.id("com.app.tsrtc:id/cityTextView")).click();
		MobileElement rl = (MobileElement) driver.findElement(MobileBy.id("com.app.tsrtc:id/bookNowButton"));
		
		
		
		
	}

}
