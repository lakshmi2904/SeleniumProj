package com.selenium.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfandifelseExample {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		String user = "lakshmia" ;
		String pwd ="Lakshmit1001"	;	
		driver.findElement(By.id("menuUser")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(user);
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.id("sign_in_btn")).click();		
		String textafterlogin=driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span")).getText();
		
	
		if(user.equals(textafterlogin))  {
			
			System.out.println("test is pass");
			
		}
		
		else {
			
			System.out.println("test is fail");
			
		}
		
		driver.close();
		
		
		
		
		

	}

}
