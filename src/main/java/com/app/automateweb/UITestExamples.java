package com.app.automateweb;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UITestExamples {

	protected WebDriver driver;
	
	@Test
	public void clickSubmitButtonWithValues() throws InterruptedException 
	{
	System.setProperty ("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
    //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    
	/*
	 *  Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofSeconds(5))
        .ignoring(NoSuchElementException.class);
	 */
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	// launch Chrome and redirect it to the Base URL
	driver.get("https://devexpress.github.io/testcafe/example/");
		
	//Maximizes the browser window
	driver.manage().window().maximize();

	
	//get the actual value of the title
	String title = driver.getTitle();
	
	System.out.println("page title="+ title);
		
	WebElement element = driver.findElement(By.id("developer-name"));		
	String name = "shiv";
	element.sendKeys(name);
	
	WebElement triedTestCafeCheckbox = driver.findElement(By.id("tried-test-cafe"));
	triedTestCafeCheckbox.click();
	
	  WebElement slider = driver.findElement(By.id("slider"));
		  
	  JavascriptExecutor js = (JavascriptExecutor) driver;		
	  js.executeScript("arguments[0].setAttribute('style', 'left: 33.33%;')",slider);
		
		/*
      Actions move = new Actions(driver);
      Action action = (Action) move.dragAndDropBy(slider, 10, 0).build();
      action.perform();
    */
		
      Thread.sleep(5000);
	// boolean isSliderEnabledAfterCheckboxClicked = slider.isEnabled();
	// Assert.assertEquals(isSliderEnabledAfterCheckboxClicked, true);
		
//	WebElement preferred_interface_DropDown = driver.findElement(By.id("preferred-interface"));	
	
	Select preferred_interface_DropDown = new Select(driver.findElement(By.id("preferred-interface")));			
	preferred_interface_DropDown.selectByIndex(1);
	
	WebElement submitButton = driver.findElement(By.id("submit-button"));	
	submitButton.click();
	
	List<WebElement> elementList = driver.findElements(By.className("className"));
	
	
 	//WebElement header = driver.findElement(By.id("article-header"));
	
	
	WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(5));
	
	WebElement header =
	
	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("article-header")));
			
			
	String text = header.getText();
	System.out.println(text);
	
	AssertJUnit.assertEquals(text, "Thank you, " + name + "!");
		  
	boolean e = false;
	
	AssertJUnit.assertEquals(false, e);
	//close browser
	driver.close();
}
		
}
