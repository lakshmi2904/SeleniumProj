package com.selenium.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForloopSelenium {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\amare\\Downloads\\chromedriverlatest\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();

		//links count
		int linkssize=driver.findElements(By.tagName("a")).size();
		System.out.println("total no of links fb page = " +linkssize);
		for (int i=0;i<linkssize;i++) {
		//attribute herf
		String linkstext=driver.findElements(By.tagName("a")).get(i).getText();


		String herftext=driver.findElements(By.tagName("a")).get(i).getAttribute("href");
		System.out.println(i+ "total no of text= "+ linkstext+ "herf = " +herftext);
			
			
			
			
	}

}
}