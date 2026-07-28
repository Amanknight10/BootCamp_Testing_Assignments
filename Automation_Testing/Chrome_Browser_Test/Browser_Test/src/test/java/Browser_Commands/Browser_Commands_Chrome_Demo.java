
package Browser_Commands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser_Commands_Chrome_Demo {
	@Test(priority = 0)
	public void ChromeBrowserTest() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

		String BrowserTitle = driver.getTitle();
		System.out.println(BrowserTitle);

		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);

		String PageContent = driver.getPageSource();
		System.out.println(PageContent);
		driver.quit();
	}

	@Test(priority = 2)
	public void FireFoxBrowserTest() {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();

		String BrowserTitle = driver.getTitle();
		System.out.println(BrowserTitle);

		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);

		String PageContent = driver.getPageSource();
		System.out.println(PageContent);
		driver.quit();

	}

	@Test(priority = 1)
	public void EdgeBrowserTest() {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/projects/");
		driver.manage().window().maximize();

		String BrowserTitle = driver.getTitle();
		System.out.println(BrowserTitle);

		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);

		String PageContent = driver.getPageSource();
		System.out.println(PageContent);
		driver.quit();

	}
}
