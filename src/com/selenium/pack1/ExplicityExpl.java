package com.selenium.pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityExpl {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//Thread.sleep(20000);
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.name("username")).sendKeys("lakshmia");
		driver.findElement(By.name("password")).sendKeys("Lakshmit1001");
		//explicitWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sign_in_btn")));
		
		driver.findElement(By.id("sign_in_btn")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
