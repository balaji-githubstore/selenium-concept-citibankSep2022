package com.citi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8Upload {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://smallpdf.com/pdf-to-word");
		
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\Mine\\Balaji-Profile_2022.pdf");
		
		
		
	}
}
