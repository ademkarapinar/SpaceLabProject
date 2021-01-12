package com.qa.spaceLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.spaceLabs.base.BasePage;
import com.qa.spaceLabs.util.ElementUtil;
import com.qa.spaceLabs.util.JavascriptUtil;

public class HomePage extends BasePage{
	WebDriver driver;
	ElementUtil elementUtil;
	JavascriptUtil javaScriptUtil;
		
	public HomePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		javaScriptUtil = new JavascriptUtil(driver);
	}
	public void verifyLink() {
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("spacelabs safensound");
		searchBar.submit();
		
		WebElement linkElement = (new WebDriverWait(driver, 10))
	    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3/span[text()='Spacelabs SafeNSound: Patient Alarm Management']")));

		boolean linkPresent = linkElement.isDisplayed();
		System.out.println(linkPresent);
		Assert.assertEquals(true, linkPresent);
	}
	

}
