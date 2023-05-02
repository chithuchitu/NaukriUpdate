package com.job;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new  ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		login.click();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
		username.sendKeys("Chithrapavai479@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Chithu@479");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		WebElement profileView = driver.findElement(By.xpath("//a[text()='Complete']"));
		profileView.click();
		WebElement editProfile = driver.findElement(By.xpath("//em[@class='icon edit']"));
		editProfile.click();
		WebElement update = driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']"));
		update.clear();
		update.sendKeys("Chithraa");
		update.clear();
		update.sendKeys("ChithraPavai");
		driver.findElement(By.id("saveBasicDetailsBtn")).click();
		System.out.println("profile updated successfully");
	//	profileView.click();
		
		
		
	}
	
	

}
