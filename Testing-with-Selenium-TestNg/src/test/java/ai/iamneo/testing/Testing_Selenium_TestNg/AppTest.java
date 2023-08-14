package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception
	 {
			driver = new RemoteWebDriver(new URL("http://localhost:"), chromeOptions);
	}

	@Test
//Checking the title of iamNeo (Home - iamneo)
	public void iamNeo() throws InterruptedException 
	{

		driver.get("http://iamneo.ai");

        // Verify page title
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "We are Hiring!", "Page title doesn't match. FAIL.");

	}
	@Test
//Moving to FACEBOOK
	public void nextPage() throws InterruptedException 
	{
		 	
driver.get("https://www.facebook.com");

        

        

        

	}
	@Test
//Back to iamNeo
	public void backPage() throws InterruptedException 
	{
		 // Navigate back to iamneo.ai
        driver.navigate().back();

	}
	@Test
//Current URL
public void currentURL() throws InterruptedException 
{
		 // Print the current URL
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);
// Navigate forward
        driver.navigate().forward();

        // Reload the page
        driver.navigate().refresh();


}

	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}

}


