package learnTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenChromeBrowser {

	@Test
	public void openChromeBrower() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	//Create object ChromeDriver class
	ChromeDriver driver = new ChromeDriver();
	
	//Maximize window
	driver.manage().window().maximize();
	//load/enter URL
	
	driver.get("http://leaftaps.com/opentaps/control/login");
		 
	}

}
