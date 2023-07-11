package pomPackage;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class NewCustomer {
	
	

	
	@FindBy(xpath="//a[text()=\"Edit Customer\"]")
	private WebElement Newcustomer;
	
	/*@FindBy(xpath="//input[@name=\"name\"]")
	private WebElement customername;
	
	@FindBy(xpath="//input[@value=\"m\"]")
	private WebElement gender;
	
	@FindBy(xpath="//input[@name=\"dob\"]")
	private WebElement DOB;
	
	@FindBy(xpath="//textarea[@name=\"addr\"]")
	private WebElement addrs;
	
	@FindBy(xpath="//input[@name=\"city\"]")
	private WebElement city;
	
	@FindBy(xpath="//input[@name=\"state\"]")
	private WebElement state;
	
	@FindBy(xpath="//input[@name=\"pinno\"]")
	private WebElement PIN;
	
	@FindBy(xpath="//input[@name=\"telephoneno\"]")
	private WebElement mobno;
	
	@FindBy(xpath="//input[@name=\"emailid\"]")
	private WebElement email;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement pass;
	
	@FindBy(xpath="//input[@name=\"sub\"]")
	private WebElement submit;*/
	
	
	public NewCustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void ClickOnNewcustomer() {
		Newcustomer.click();
		//WebDriverWait cus=ait.until(ExpectedConditions.visibilityOf(Newcustomer));

	}
	/*public void SendCustomername(String Customer) {
		customername.sendKeys(Customer);
		//Wait.until(ExpectedConditions.visibilityOf(customername));

	}
	public void ClickOngender() {
		gender.click();	
	}
	public void SendDOb(String Dob) {
		DOB.sendKeys(Dob);	
	}
	public void SendAddress(String Addr) {
		addrs.sendKeys(Addr);	
	}
	public void SendCity(String City) {
		city.sendKeys(City);	
	}
	public void SendState(String State ) {
		state.sendKeys(State);	
	}
	public void SendPin(String Pin) {
		PIN.sendKeys(Pin);	
	}
	public void SendMobileNO(String MobNo) {
		mobno.sendKeys(MobNo);	
	}
	public void SendEmail(String Email) {
		email.sendKeys(Email);	
	}
	public void SendPassword(String Pass) {
		pass.sendKeys(Pass);	
	}*/
}
