package com.selenium.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.easemytrip.com");
		driver.manage().window().maximize();
boolean oneway=driver.findElement(By.id("a_FromSector-mul2_show")).isDisplayed();
	System.out.println(oneway);	
		
	driver.findElement(By.id("mcity")).click();	
	boolean city=driver.findElement(By.id("ToSector-mul2_show")).isDisplayed();
	System.out.println(city);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
