package mainutility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWait {
	
	 WebDriver driver;
	
	public static void ExplicitWait(int timeout,String user, WebDriver driver) {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(user)));
		
	
	}

}
