package _15POMRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01ToGenerateStaleElementRefrenceException {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("RAJU");
		driver.navigate().refresh();
		search.sendKeys("sanju");
		

	}

}
