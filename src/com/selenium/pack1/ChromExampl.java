package com.selenium.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromExampl {

	public static void main(String[] args) throws InterruptedException {
		
 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("lakshmi2345@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("cghgmcjuly");
		//driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.name("q")).sendKeys("whatsapp");
		//Thread.sleep(5000);
		//driver.findElement(By.cssSelector("#icon")).click();
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//*[@id=\"bqHHPb\"]/div/div/div[1]/a[2]/div")).click();


		//String title=driver.getTitle();
		//System.out.println(title);
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		
		
	}

}
