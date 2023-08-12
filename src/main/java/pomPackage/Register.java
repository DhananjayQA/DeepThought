package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mainutility.ExpWait;

public class Register {
	
	@FindBy(xpath="//a[ text()= \"Register\"]")
     private WebElement Register;
	
	private WebDriver driver;
	
public  Register(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

public void Clickonregister() {
	Register.click();
	
	ExpWait.ExplicitWait(10, "//a[ text()= \"Register\"]", driver);
}
}


