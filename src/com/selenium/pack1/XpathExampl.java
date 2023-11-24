package com.selenium.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExampl {

	public static void main(String[] args) throws InterruptedException {
		
		//
System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//creat own xpath 
		//int rbsize=driver.findElements(By.xpath("//input[@type='radio']")).size();
		//System.out.println(" total no of radiobuttons = "+rbsize);
		//driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("ancha");
		driver.findElement(By.xpath("//*[text()='Female']")).click();

	}

}
