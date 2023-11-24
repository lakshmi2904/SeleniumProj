package com.selenium.pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExampl {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		//Thread.sleep(5000);
		//driver.findElement(By.name("B2")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		//****negetive alerts******
		//driver.findElement(By.name("B3")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();
		//sendkeys alerts
		driver.findElement(By.name("B4")).click();
		driver.switchTo().alert().sendKeys("la");
		//Thread.sleep(5000);
		driver.switchTo().alert().accept();
		//Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
