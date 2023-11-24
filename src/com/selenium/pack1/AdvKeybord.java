package com.selenium.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvKeybord {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		WebElement serchbox=driver.findElement(By.id("twotabsearchtextbox"));
		Actions ac = new Actions(driver);
		//ac.keyDown(serchbox, Keys.SHIFT).sendKeys("FAN").keyUp(Keys.SHIFT).sendKeys("band").build().perform();
		
		ac.keyDown(serchbox, Keys.SHIFT).sendKeys("CARDS").build().perform();
		
		
		
		
		
		
		
		
		
		

	}

}
