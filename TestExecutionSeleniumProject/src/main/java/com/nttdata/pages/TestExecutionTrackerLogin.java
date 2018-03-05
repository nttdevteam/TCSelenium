package com.nttdata.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TestExecutionTrackerLogin {
	
	WebDriver driver;
	public TestExecutionTrackerLogin(WebDriver driver) {
		this.driver = driver;
	}
	public void enterUsername(String uname) throws IOException {
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("SHEEL");
					
	}
	
	public void enterPassword(String pass) throws IOException {
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("AAA");
		
	}
	
		
	public void clickSubmitButton() throws IOException
	{
		driver.findElement(By.xpath("html/body/div[1]/form/input[3]")).click();
		
	}
}