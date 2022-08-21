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

	protected WebDriver driver;  // class "webdriver"   and object "driver "
	@Test
	public void submitbuttondisabled()throws InterruptedException{  
		
		System.setProperty ("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://devexpress.github.io/testcafe/example/");
		
		WebElement submit = driver.findElement(By.id("submit-button"));	
		boolean isEnabled = submit.isEnabled();

		AssertJUnit.assertEquals(false ,isEnabled);
		
	WebElement element = driver.findElement(By.id("developer-name"));  // find element by id = dev name
		String name = "Kanc";
		element.sendKeys(name);
		
		isEnabled = submit.isEnabled();

		AssertJUnit.assertEquals(true ,isEnabled);
		submit.click();
}

	
	@Test
	public void featuresareimportant()throws InterruptedException {
		
		
		System.setProperty ("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://devexpress.github.io/testcafe/example/");
		
		WebElement element = driver.findElement(By.id("developer-name"));  // find element by id = dev name
		String name = "kanch";
		element.sendKeys(name);
		
		
		WebElement remote_testing_checkbox = driver.findElement(By.id("remote-testing"));   // 

		remote_testing_checkbox.click();
		
		WebElement reusing_testing_checkbox = driver.findElement(By.id("reusing-js-code")); // 

		reusing_testing_checkbox.click();
		
		WebElement submit = driver.findElement(By.id("submit-button"));	
		submit.click();
		
		
		WebElement background_parallel_testing_checkbox = driver.findElement(By.id("background_parallel_testing_checkbox")); // 

		background_parallel_testing_checkbox.click();
		
		
		WebElement continuous_integration_embedding_checkbox = driver.findElement(By.id("continuous_integration_embedding_checkbox")); // 

		continuous_integration_embedding_checkbox.click();
		
		
		WebElement traffic_markup_analysis_checkbox = driver.findElement(By.id("traffic_markup_analysis_checkbox"));           // 

		traffic_markup_analysis_checkbox.click();
		
		;
	}
	
	@Test   //method
	public void clickSubmitButtonWithValues() throws InterruptedException  // method clickSubmitButtonWithValues
	{
	System.setProperty ("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe"); //C:\chromedriver , key value 
	
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
	
	// launch Chrome and redirect it to the Base URL
	driver.get("https://devexpress.github.io/testcafe/example/");   // get URL
		
	//Maximizes the browser window
	driver.manage().window().maximize();       // max window

	
	//get the actual value of the title
	String title = driver.getTitle();                 // get title 
	
	System.out.println("page title="+ title);                  //print 
		
	WebElement element = driver.findElement(By.id("developer-name"));  // find element by id = dev name
	String name = "shiv";
	element.sendKeys(name);
	
	WebElement triedTestCafeCheckbox = driver.findElement(By.id("tried-test-cafe")); // 
	triedTestCafeCheckbox.click();
	
	  WebElement slider = driver.findElement(By.id("slider"));
		  
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		js.executeScript("arguments[0].setAttribute('style', 'left: 33.33%;')",slider); // TODO
		
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
	
	WebElement submit = driver.findElement(By.id("submit-button"));	
	submit.click();
	
	WebElement header = driver.findElement(By.id("article-header"));
	String text = header.getText();
	System.out.println(text);
	
	AssertJUnit.assertEquals( "Thank you, " + name + "!", text); // validation of name we have entered 
	
	  
	//close browser
	driver.close();
}
		
}
