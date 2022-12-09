package _16basicTestScriptTest;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import _17genericUtility._03BaseClass;

public class _01ToVerifyHomePageTest extends _03BaseClass {
	

	@Test()

	public void mainTest() throws IOException {
		
		String expectedTitle = eUtils.fetchDataFromExcelSheet("sheet2", 1, 0);
		wUtilits.waitForTitleWebDriver(driver, "Enter");
			
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass : The Title is verified");
			
	}
}
