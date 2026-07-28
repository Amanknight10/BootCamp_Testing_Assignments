package Browser_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser_Commands_All_Demo {
	WebDriver driver;

	@Test(priority = 0)

	public void NavigateDemo() {

		driver = new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/downloads/");

		String URL = driver.getCurrentUrl();
		System.out.print(URL);
		driver.quit();

	}

	@Test(priority = 1)

	public void NavigateBackDemo() {

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.navigate().to("https://login.yahoo.com/");
		System.out.println(driver.getCurrentUrl());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.quit();
	}

	@Test(priority = 2)

	public void NavigateForward() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
}