package com.citi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.db4free.net/");
		
		//click on phpMyAdmin
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		//switch to 2nd tab
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("hello");
		//enter password as test123
		//click on login
		
		driver.quit();
		
	}

}
//will start at 11:30 AM IST