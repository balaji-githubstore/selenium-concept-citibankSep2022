package com.citi.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		String title= driver.getTitle();	
		System.out.println(title);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);
	}
}
