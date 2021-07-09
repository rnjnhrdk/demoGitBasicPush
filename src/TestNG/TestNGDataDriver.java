package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDataDriver {

	WebDriver driver;
	
	
@BeforeClass
public void setup()
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hardi\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://phptravels.org/register.php");
	
}
@Test
public void demoTravelsTest(String fname, String lname, String email, String countryCode, String phoneNumber, String company, String compAddress, String compCity, String compState, String compCountry)
{
	driver.findElement(By.xpath("//input[@name='firstname']")).clear();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
	
	driver.findElement(By.xpath("//input[@name='lastname']")).clear();
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);
	
	driver.findElement(By.xpath("//input[@name='email']")).clear();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
	
	Select Code = new Select(driver.findElement(By.xpath("//div[@class='selected-dial-code']")));
	Code.selectByValue(countryCode);
	
	driver.findElement(By.xpath("//input[@name='phonenumber']")).clear();
	driver.findElement(By.xpath("//input[@name='phonenumber']")).sendKeys(phoneNumber);
	
	driver.findElement(By.xpath("//input[@name='companyname']")).clear();
	driver.findElement(By.xpath("//input[@name='companyname']")).sendKeys(company);
	
	driver.findElement(By.xpath("//input[@name='address1']")).clear();
	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(compAddress);
	
	driver.findElement(By.xpath("//input[@name='city']")).clear();
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys(compCity);
	
	driver.findElement(By.xpath("//input[@name='state']")).clear();
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys(compState);
	
	Select comCountry = new Select(driver.findElement(By.xpath("//select[@name='country']")));
	comCountry.selectByValue(compCountry);
	
	
	
	
	
	
	
}




}
