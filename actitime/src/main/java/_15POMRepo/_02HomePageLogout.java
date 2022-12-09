package _15POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02HomePageLogout {
	
	public _02HomePageLogout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="logoutLink")
	private WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	public void logoutAction()
	{
		logoutButton.click();
	}
}
