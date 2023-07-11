package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainutility.ExpWait;

public class LoginPage {
	
	@FindBy(xpath="//input[@name=\"uid\"]")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement Password;
	
	@FindBy(xpath="//input[@name=\"btnLogin\"]")
	private WebElement Login;

	private WebDriver driver;
	
	//@FindBy(xpath="//a[text()=\"New Customer\"]/parent::li/parent::ul/parent::div")
	//private WebElement Newcustomer;
	
	

	public  LoginPage(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
		this.driver=driver;
		
	}
	
	public void SenduserName(String user) {
		UserName.sendKeys(user);
	}
	public void Sendpassword(String pass) {
		ExpWait.ExplicitWait(10, "//input[@name=\"password\"]",driver);

		Password.sendKeys(pass);
	}
	public void ClickOnLogin() {
		Login.click();
	}

	/*public Boolean IsDisplayed() {
		return Newcustomer.isDisplayed();
	}*/
}
