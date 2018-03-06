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
		driver.findElement(By.name("uname")).clear();
		driver.findElement(By.name("uname")).sendKeys("test");
					
	}
	
	public void enterPassword(String pass) throws IOException {
		
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("test");
		
	}
	
		
	public void clickSubmitButton() throws IOException
	{
		driver.findElement(By.xpath("html/body/div[1]/form/input[3]")).click();
		
	}
}