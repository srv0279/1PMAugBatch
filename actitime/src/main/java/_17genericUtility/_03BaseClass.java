package _17genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import _15POMRepo._02HomePageLogout;
import _15POMRepo._02LoginPage;

public class _03BaseClass {
	public WebDriver driver;
	public _02FileUtility futils = new _02FileUtility();
	public _02ExcelUtiltity eUtils = new _02ExcelUtiltity();
	public _04WebDriverUtility wUtilits = new _04WebDriverUtility();
	
	@BeforeSuite()
	public void bsConfig()
	{
		System.out.println("Connect to Database");
	}
	@BeforeClass()
	public void bcConfig() throws IOException
	{
		
		String url = futils.fetchDataFromPropertyFile("url");
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
	}
	@BeforeMethod()
	public void bmConfig() throws IOException
	{
		String username = futils.fetchDataFromPropertyFile("username");
		String password = futils.fetchDataFromPropertyFile("password");

		_02LoginPage login = new _02LoginPage(driver);
		login.loginAction(username, password);
		
	}
	@AfterMethod()
	public void amConfig()
	{
		_02HomePageLogout home  = new _02HomePageLogout(driver);
		home.logoutAction();
	}
	@AfterClass()
	public void acConfig()
	{
		driver.quit();
	}
	@AfterSuite()
	public void asConfig()
	{
		System.out.println("DataBase is Closed");
	}

}
