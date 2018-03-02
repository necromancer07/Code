package com.exampple;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.exampple.pages.EbayAppPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class EbayAppTest {
	
	
	//creating instance of appium driver
	AppiumDriver<WebElement> driver;
	
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		//To identify the mobile device and the application to test
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","Myphone");
		cap.setCapability("platformName", "Android");
		cap.setCapability("udid", "6136be67");
		cap.setCapability("appPackage", "com.ebay.mobile");
		cap.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
		cap.setCapability("platformVersion", "6.0.1");
		
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		
	}
	
	
  @Test
  public void f() throws IOException {
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //create page object
	  EbayAppPage ebayPage = new EbayAppPage(driver);
	  
	  //calling the method
	  ebayPage.LoginAndBuy();
	  
  }
  
}
