package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

	//private Select dd;

	//public static void main(String[] args){
	@Test
	public void dropDown() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//object creation:
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize
		driver.manage().window().maximize();
		//ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//print current Title:
		driver.getTitle();
		System.out.println(driver.getTitle() );
		//Enter Username  (Element level) 
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter password  (Element level)
		driver.findElementById("password").sendKeys("crmsfa");
		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();
		// click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		//company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		//First Name
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		//Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		//Create of select Class object(Dropdown)
		//Select Source
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		dd.selectByVisibleText("Employee");
		//dd.selectByValue("LEAD_COLDCALL");
		//dd.selectByIndex(6);
		//Select Industry
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dd1 = new Select(industry);
		dd1.selectByVisibleText("Finance");
	
		// choose ownership
	   WebElement ele = driver.findElementByName("ownershipEnumId");
		Select dd3 = new Select(ele);
		dd3.selectByVisibleText("Sole Proprietorship");
		//Click CreateLead
		driver.findElementByName("submitButton").click();

	}

}
