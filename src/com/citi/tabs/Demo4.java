package com.citi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//on dealing with more than two tabs 
public class Demo4 {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.partialLinkText("APPLY FOR CREDIT")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
		for(String win : windows)
		{
			driver.switchTo().window(win);
			
			if(driver.getTitle().contains("Apply for a Credit"))
			{
				break;
			}
			System.out.println("--------------------------------");
		}
		
		driver.findElement(By.linkText("Travel")).click();
		
	//	driver.close();
		
		windows=new ArrayList<String>(driver.getWindowHandles());
		
		for(String win : windows)
		{
			driver.switchTo().window(win);
			
			if(driver.getPageSource().contains("Credit Card Terms and Conditions"))
			{
				break;
			}
			System.out.println("--------------------------------");
		}
		
		
		
	
		
		
	}

}
