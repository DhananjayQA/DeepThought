package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainutility.ExpWait;

public class LoginPage {
	@FindBy(xpath="//input[ @id=\"username\"]")
    private WebElement Email;
	@FindBy(xpath="//input[ @id=\"password\"]")
    private WebElement Password;
	@FindBy(xpath="//button[ @id= \"login\"]")
    private WebElement Loginbutton;
	
	private WebDriver driver;
	
public  LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

public void Sendemail(String user) {
	Email.sendKeys(user);
	
	ExpWait.ExplicitWait(10, "//input[ @id=\"username\"]", driver);
}
	
public void Sendpass(String pass) {
	Password.sendKeys(pass);
}
public void ClickonLogin() {
	Loginbutton.click();
	
	
}
}



