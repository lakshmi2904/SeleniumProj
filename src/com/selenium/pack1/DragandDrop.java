package com.selenium.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		driver.manage().window().maximize();
		WebElement dragitem=driver.findElement(By.id("draggable"));
	WebElement dropitem=driver.findElement(By.id("droptarget"));	
	Actions ac = new Actions(driver);
	Thread.sleep(10000);
	//ac.dragAndDrop(dragitem, dropitem).build().perform();
		//*****click and hold
		ac.clickAndHold(dragitem).moveToElement(dropitem).build().perform();
		

	}

}
