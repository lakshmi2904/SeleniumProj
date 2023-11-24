package com.selenium.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvUiMouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		WebElement all=driver.findElement(By.className("hm-icon-label"));
		
		Actions ac = new Actions(driver);
		//ac.moveToElement(all).build().perform();
		//**************rightclick******
		ac.contextClick(all).build().perform();
		//******drag and drop**********
		
		
		
		
		
		
		
	}

}
