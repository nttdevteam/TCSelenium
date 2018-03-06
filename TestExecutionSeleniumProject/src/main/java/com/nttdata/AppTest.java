package com.nttdata;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nttdata.pages.TestExecutionTrackerLogin;

public class AppTest {
	private WebDriver driver;
  @Test
  public void verifySearchButton() throws IOException {
	  /*final FirefoxProfile firefoxProfile = new FirefoxProfile();
	  firefoxProfile.setPreference("xpinstall.signatures.required", false);
	  driver = new FirefoxDriver(firefoxProfile);*/
	  TestExecutionTrackerLogin tracker= new TestExecutionTrackerLogin(driver);
	  driver.get("http://localhost:8085/TransportCompany/");
	  tracker.enterUsername("test");
	  tracker.enterPassword("test");
	  /*tracker.clickSubmitButton();*/

  }
  @BeforeClass
  public void beforeClass() throws IOException {
	 /* if (Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "./Driver/internetexplorerdriver.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
	}*/
	 
	 driver = new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	//  driver.quit();
  }

}
