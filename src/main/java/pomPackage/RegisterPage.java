package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement EmailAddress;
	
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement Password;
	
	@FindBy(xpath="//input[@name=\"password-confirm\"]")
	private WebElement Passwordconfirm;
	
	@FindBy(xpath="//button[@id=\"register\"]")
	private WebElement Registerbutton;

	private WebDriver driver;
	
	
public  RegisterPage(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
		this.driver=driver;
		
	}

public void Sendemail(String user) {
	EmailAddress.sendKeys(user);
}

public void SenduserName(String user) {
	UserName.sendKeys(user);
}
public void Sendpassword(String user) {
	Password.sendKeys(user);
}
public void Sendpasswordconfirm(String user) {
	Passwordconfirm.sendKeys(user);
}
public void Clickonregisternow() {
	Registerbutton.click();
}

}
