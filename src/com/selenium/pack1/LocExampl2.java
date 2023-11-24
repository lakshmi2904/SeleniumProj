package com.selenium.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocExampl2 {

	public static void main(String[] args) throws InterruptedException {
	

System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("fridge");
		Thread.sleep(5000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		
		
		
		
		
	}

}
