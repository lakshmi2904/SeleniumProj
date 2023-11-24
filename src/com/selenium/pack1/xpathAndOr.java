package com.selenium.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAndOr {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://zoom.us/signin#/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='password' and @class='zm-input__inner']")).sendKeys("ancha");
		//use and xpath
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email' or @class='zm-input__label']")).sendKeys("laksh");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
