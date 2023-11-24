package com.selenium.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxExampl {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "‪C:\\Users\\amare\\Downloads\\geckodriverlatest\\geckodriver.exe");
		//  lunching
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in");
		
	}

}
