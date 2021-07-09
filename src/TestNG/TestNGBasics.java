package TestNG;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGBasics {
	
   
	WebDriver driver;
	@BeforeClass
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hardi\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println("Before Annotations Invoked");
	}
	
	@Test
	public void getTitleTest()
	{
	String Title = driver.getTitle();
	Title.compareTo("Google");
	System.out.println("Validation of Title");
	}
	
	@Test(priority=1)
	public void checkLogoVisible()
	{
		Boolean logo=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		Assert.assertTrue(true);
		System.out.println("Logo Displayed Clearly");
	}
	@Test(priority=3)
	public void checkSearchBox()
	{
		Boolean searchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).isDisplayed();
		Assert.assertTrue(true);
		System.out.println("Search Box Present");
	}
	@Test(priority=4)
	public void checkSearchButton()
	{
		Boolean checkSearchButton = driver.findElement(By.xpath("//*[@value='Google Search' and @class='gNO89b' and @name='btnK']")).isDisplayed();
		Assert.assertTrue(true);
		System.out.println("Search Button Displayed");
	}
	@Test(invocationCount=3)
	public void iAmFeeling()
	{
		Boolean checkLuckyButton =driver.findElement(By.xpath("//input[@class='RNmpXc' and @name='btnI']")).isDisplayed();
		Assert.assertTrue(true);
		System.out.println("Lucky Button Displayed");
	}
	@Test(priority=2)
	public void gmailLink()
	{
		Boolean gmailLink = driver.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertTrue(true);
		System.out.println("Gmail Link Displayed");
	}
	
	@AfterClass
	public void teardown()
	{
		System.out.println("After Annotations Invoked");
		driver.quit();
	}
	
	
	
	
	
	
	

}
