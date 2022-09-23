package com.citi.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo6Js {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://phptravels.net/");
		
//		driver.findElement(By.id("checkin")).sendKeys("30-09-2022");
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement ele1=driver.findElement(By.xpath("//input[@id='checkin']"));
		WebElement ele2=driver.findElement(By.xpath("//input[@id='checkout']"));
		
		js.executeScript("arguments[0].value='30-09-2022'",ele1);
		js.executeScript("arguments[0].value='10-10-2022'",ele2);
	
		
	}

}
