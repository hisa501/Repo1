package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WikiPage {
	
	@Test // it is used to execute our testcases
	public void createAcount() throws InterruptedException {
		String currDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currDir+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/edureka-devops/selenium-website");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		//write the test steps 
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("login")).sendKeys("hisa501@gmail.com");
	
	}
}
