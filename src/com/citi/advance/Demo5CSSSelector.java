package com.citi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5CSSSelector {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("welcome123");
		
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
