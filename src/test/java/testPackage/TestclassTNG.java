package testPackage;



import java.io.IOException;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pomPackage.LoginPage;
import pomPackage.NewCustomer;
import pomPackage.Register;
import pomPackage.RegisterPage;
import testutility.FileClass;
import testutility.StartBrowser;


public class TestclassTNG extends BaseClass{
	

	// WebDriver driver;
	 
	
	

//	@BeforeTest
//	public void beforetest() {
//	driver= StartBrowser.Chromebrowser("Chrome","https://www.demo.guru99.com/V4/",10);
//	
//	}
		
	@Test
	public void test() throws IllegalStateException, IOException {
		
		LoginPage login= new LoginPage(driver);
		login.Sendemail("lokhandedhananjay4@gmail.com");
		login.Sendpass("159753@Flower");
		login.ClickonLogin();
		
//		LoginPage Login= new LoginPage(driver);
//		Login.SenduserName(FileClass.filedata(2, 0));
//		Login.Sendpassword(FileClass.filedata(2, 1));
//		Login.ClickOnLogin();
//		//Boolean result= Login.IsDisplayed();
//		String ExceptedUrl= "https://www.demo.guru99.com/V4/manager/Managerhomepage.php";
//		String ActualURl=driver.getCurrentUrl();		
//		Assert.assertEquals(ExceptedUrl,ActualURl);
		
	}
	
//	@Test
//	public void test1() throws IllegalStateException, IOException {
//		
//		LoginPage login= new LoginPage(driver);
//		login.Sendemail("lokhandedhananjay4@gmail.com");
//		login.Sendpass("159753@flower");
//		login.ClickonLogin();
//		
	
//	@Test
//	public void test1() throws IllegalStateException, IOException {
//		RegisterPage register= new RegisterPage(driver);
//		register.Sendemail("lokhandedhananjay4@gmail.com");	
//		register.SenduserName("Dhanu1997");
//		register.Sendpassword("159753@Flower");
//		register.Sendpasswordconfirm("159753@Flower");
//		register.Clickonregisternow();
//	}
	
//	@Test
//	public void Test1() {
//		
//		
//		NewCustomer Customer=new  NewCustomer(driver);
//		Customer.ClickOnNewcustomer();
//		/*Customer.SendCustomername("Dhananjay Lokhande");
//		Customer.ClickOngender();
//		Customer.SendDOb("28101997");
//		Customer.SendAddress("PlotNo.138 krushnapur, Bidkin");
//		Customer.SendCity("SambhajiNagar");
//		Customer.SendState("Maharashtra");
//		Customer.SendPin("431105");
//		Customer.SendMobileNO("9597503487");
//		Customer.SendEmail("Dhanu@gmail.com");
//		Customer.SendPassword("Dhanu@123");*/
//		
//	}
//	@AfterTest
//	public void aftertest() {
//		//driver.quit();
//	}
		
	
		
	}


