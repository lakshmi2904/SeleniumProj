package com.selenium.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsExpl {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();

	Thread.sleep(5000);	
	WebElement month=driver.findElement(By.id("month"));
	Select sc = new Select(month);
		//sc.selectByIndex(4);
		
		//sc.selectByVisibleText("Jun");
		//sc.selectByValue("2");
		int itemssize=sc.getOptions().size();
		System.out.println(itemssize);
		for(int i=0;i<itemssize;i++) {
			
		String itemtext=sc.getOptions().get(i).getText();	
			
			System.out.println(itemtext);
			
			
		}
		
		
		
		
		
		
		

	}

}
