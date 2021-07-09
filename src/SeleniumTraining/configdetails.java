package SeleniumTraining;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class configdetails {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hardi\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = 	new ChromeDriver();
		
		Properties prop=new Properties();
		
		FileInputStream Ip = new FileInputStream("C:\\Users\\hardi\\Documents\\Learning Selenium\\Learning Selenium\\src\\SeleniumTraining\\configDetails.properties");	
		
		prop.load(Ip);
		
		String fname = prop.getProperty("firstName");
		
		String lname = prop.getProperty("lastName");
		
		String uname = prop.getProperty("username");
		
		String pwd = prop.getProperty("password");
		String pnumber = prop.getProperty("phonenumber");
		String month = prop.getProperty("month");
		
		String day =prop.getProperty("day");
		String year = prop.getProperty("year");
		String gender = prop.getProperty("gender");
	
	
		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='createacc']")).click();
		driver.findElement(By.id("usernamereg-firstName")).sendKeys(fname);
		driver.findElement(By.id("usernamereg-lastName")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.id("usernamereg-phone")).sendKeys(pnumber);
		
		Select sel = new Select(driver.findElement(By.id("usernamereg-month")));
		sel.selectByVisibleText(month);
		
		driver.findElement(By.id("usernamereg-day")).sendKeys(day);
		driver.findElement(By.name("yyyy")).sendKeys(year);
		driver.findElement((By.name("freeformGender"))).sendKeys(gender);
		System.out.println("Details Entered Successfully");		
		System.out.println("File Loaded Successfully");
				
	}

}
