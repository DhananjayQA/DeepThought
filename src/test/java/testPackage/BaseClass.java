package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import testutility.StartBrowser;

public class BaseClass {
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
	driver= StartBrowser.Chromebrowser("Chrome","https://www.demo.guru99.com/V4/",10);

	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}

}
