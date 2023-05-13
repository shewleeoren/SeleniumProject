package packageAUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://mrbool.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//select content element and store variable
		WebElement content = driver.findElementByClassName("menulink");
		Actions action = new Actions(driver);
		
		//perform moveToElement (Mouse Hover On) action, pass the element and use perform() metho
		action.moveToElement(content).perform();
		//Then click the Articles element
		driver.findElementByXPath("//a[text()='Articles' ]").click();
		//wait 4 seconds
		Thread.sleep(4000);
		//close the browser
		driver.close();
		

	}

}
