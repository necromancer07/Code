package com.exampple.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.exampple.utility.PropertyReader;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EbayAppPage {
	
	//constructor to initialize the page
	public EbayAppPage(AppiumDriver<WebElement> driver)
	{
		//initialize elements
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	PropertyReader pr = new PropertyReader();
	
	//To locate the elements/ In this case I used ID, we can use Xpath or Class too
	@AndroidFindBy(id="com.ebay.mobile:id/home")
	public WebElement menuSwipe;
	
	@AndroidFindBy(id="com.ebay.mobile:id/logo")
	public WebElement signInLogo;
	
	@AndroidFindBy(id="edit_text_username")
	public WebElement usernameField;
	
	@AndroidFindBy(id="edit_text_password")
	public WebElement passwordField;
	
	@AndroidFindBy(id="button_sign_in")
	public WebElement signInBtn;
	
	@AndroidFindBy(id="button_google_deny")
	public WebElement noThanksBtn;
	
	@AndroidFindBy(id="search_box")
	public WebElement searchBar1;
	
	@AndroidFindBy(id="search_src_text")
	public WebElement searchBar2;
	
	@AndroidFindBy(id="search_complete_icon")
	public WebElement searchIcon;
	
	@AndroidFindBy(id="textview_item_title")
	public WebElement productChosen;
	
	@AndroidFindBy(id="button_bin")
	public WebElement BuyBtn;
	
	@AndroidFindBy(id="take_action")
	public WebElement reviewBtn;
	
	//Method that performs the operation
	public void LoginAndBuy() throws IOException
	{
		menuSwipe.click();
		signInLogo.click();
		usernameField.sendKeys(pr.readProperty("username"));
		passwordField.sendKeys(pr.readProperty("password"));
		signInBtn.click();
		noThanksBtn.click();
		searchBar1.click();
		searchBar2.sendKeys(pr.readProperty("product"));
		searchIcon.click();
		productChosen.click();
		BuyBtn.click();
		reviewBtn.click();
	}

}
