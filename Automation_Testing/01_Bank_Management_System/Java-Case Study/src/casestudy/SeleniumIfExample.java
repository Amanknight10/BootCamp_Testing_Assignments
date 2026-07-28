package casestudy;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://example.com/login");

        boolean isDisplayed = driver.findElement(org.openqa.selenium.By.id("errorMsg")).isDisplayed();

        if (isDisplayed) {
            System.out.println("Login failed - error message shown.");
        }
        driver.quit();
	}

}
