package com.citi.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.linkText("Create New Account")).click();
			
		driver.findElement(By.name("firstname")).sendKeys("John");
		//enter lastname as wick
		//enter mobile number as 89898989
		//enter password as Welcome123
		//Select gender as Custom
		
		
		//14 Dec 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("14");
		
		Select selectMon=new Select(driver.findElement(By.id("month")));
		selectMon.selectByVisibleText("Dec");
		
		//select year as 2000
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByValue("2000");
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		
		//click on signup

	}

}
