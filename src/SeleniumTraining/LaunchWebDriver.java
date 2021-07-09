package SeleniumTraining;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class LaunchWebDriver {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hardi\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = 	new ChromeDriver();
	Actions action = new Actions(driver);
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	action.moveToElement(driver.findElement(By.xpath("//div[contains(text(), 'Fashion')]"))).build().perform();
	action.moveToElement(driver.findElement(By.linkText("Men's Top Wear"))).build().perform();
	driver.findElement(By.linkText("All")).click();
	driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
	System.out.println("Welcome To All Menu");
	driver.quit();
	//driver.findElement(By.linkText("Men's Top Wear")).click();

	
	
	
	//driver.findElement(By.xpath("//a[@id='createacc']")).click();
	//driver.findElement(By.id("usernamereg-firstName")).sendKeys("Tom");
	//driver.findElement(By.id("usernamereg-lastName")).sendKeys("Jerry");
	//driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys("TomJerry123");
	//driver.findElement(By.name("password")).sendKeys("Yahoo@123");
	//driver.findElement(By.id("usernamereg-phone")).sendKeys("9595959595");
	//Select sel = new Select(driver.findElement(By.id("usernamereg-month")));
	//sel.selectByVisibleText("September");
	//driver.findElement(By.id("usernamereg-day")).sendKeys("12");
	//driver.findElement(By.name("yyyy")).sendKeys("1990");
	//driver.findElement((By.name("freeformGender"))).sendKeys("M");
	//System.out.println("Details Entered Successfully");
	//driver.switchTo().frame("singleframe");
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing");
	//driver.quit();
	//System.out.println("Operation Completed Successfully");
	
	
	
	
	
	
	}

}
