package com.selenium.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeExampl {

	public static void main(String[] args) throws InterruptedException {
		
		//location
		System.setProperty("webdriver.edge.driver", "C:\\Users\\amare\\Downloads\\edgedriver119\\msedgedriver.exe");
	
		//lunching
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.instagram.com");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//driver.findElement(By.linkText("Prime")).click();
		driver.findElement(By.name("username")).sendKeys("ancha");
		driver.findElement(By.name("password")).sendKeys("123456");
		
	}

}
