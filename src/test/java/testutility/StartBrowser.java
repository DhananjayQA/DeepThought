package testutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StartBrowser {
	static WebDriver driver;
	
	public static WebDriver Chromebrowser(String Browser,String URL,int TimeOut) {
	
		String	Chrome="Chrome";
		if(Chrome.equals(Browser)) {
			
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Public\\\\Downloads\\\\chromedriver.exe");
		
	 driver = new ChromeDriver();
		}
	 
	    String Edge="Edge";
	    if(Edge.equals(Browser)) {
	    	
	    	driver=new EdgeDriver();
	    
		}
	    
	
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeOut));
		
		
		return driver;
		
	}

}
