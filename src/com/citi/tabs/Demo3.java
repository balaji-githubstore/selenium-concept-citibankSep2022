package com.citi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//on dealing with more than two tabs 
public class Demo3 {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.db4free.net/");
		
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		for(String win : windows)
		{
			driver.switchTo().window(win);
			
			if(driver.getTitle().contains("phpMy"))
			{
				break;
			}
			System.out.println("--------------------------------");
		}
		
		driver.findElement(By.id("input_username")).sendKeys("hello");
		
		driver.close();
		
		
		windows=new ArrayList<String>(driver.getWindowHandles());
		
		for(String win : windows)
		{
			driver.switchTo().window(win);
			
			if(driver.getPageSource().contains("Welcome to db4free.net"))
			{
				break;
			}
			System.out.println("--------------------------------");
		}
		
		
		driver.close();
		
	}

}
