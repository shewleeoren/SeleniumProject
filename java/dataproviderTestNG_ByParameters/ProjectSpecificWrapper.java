package dataproviderTestNG_ByParameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

     public class ProjectSpecificWrapper {
	 public ChromeDriver driver;
	 @Parameters({"url","uname","pwd"})
	 @BeforeMethod
     public void login(String url,String uname,String pwd) {
	     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      driver = new ChromeDriver();
	     //maximize
	      driver.manage().window().maximize();
	     //load URL
	      driver.get(url);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	       //Enter Username - (Element level)
			driver.findElementById("username").sendKeys(uname);

			//Enter Password - (Element level)
			driver.findElementById("password").sendKeys(pwd);

			// Click Login Button - (Element level)
			driver.findElementByClassName("decorativeSubmit").click();

			// click crm.sfa link
			driver.findElementByLinkText("CRM/SFA").click();

}
	 @AfterMethod
	 public void closeBrowser() {
		driver.close(); 
	 }

	 //@DataProvider
	 @DataProvider
  public void getData() {
		 
		//create object of 2D Array/declare 2D Array and write size of array(Row & column)
			String [][] data = new String[3][3];
			
		 
	 }



}
