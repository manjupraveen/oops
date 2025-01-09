package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxEg {
	public WebDriver driver;
	public void initialiseBrowser() {
		driver= new FirefoxDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
	}

	public static void main(String[] args) {
		FirefoxEg firefoxeg = new FirefoxEg();
		firefoxeg.initialiseBrowser();

	}

}
