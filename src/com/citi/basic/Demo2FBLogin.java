package com.citi.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("welcome123");
		
		driver.findElement(By.name("login")).click();
	}

}
