package com.qa.spaceLabs.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.spaceLabs.base.BasePage;
import com.qa.spaceLabs.pages.HomePage;


public class HomePageTest {
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	HomePage homePage;
	
	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.initialize_properties();
		driver = basePage.initialize_driver(prop);
		driver.get(prop.getProperty("url"));
		homePage = new HomePage(driver);
	}
	@Test(priority=1)
	public void sendKeyToSearchButtonTest() throws InterruptedException {
		homePage.verifyLink();
		
	
	}
}