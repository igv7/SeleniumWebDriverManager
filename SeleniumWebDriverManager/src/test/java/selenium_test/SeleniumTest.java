package selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
	static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		
		setBrowser();
		setBrowserConfig();
		runTest();
	}
	
	/**
	 * Description
	 * @author Igor
	 * @date
	 */
	
	public static void setBrowser() {
		browser = "Firefox";
//		browser = "Chrome";
	}
	
	public static void setBrowserConfig() {
		//Not needed downloading "driver.exe"
		if (browser.contains("Chrome")) {
			WebDriverManager.chromedriver().setup(); //Version 79.0.3945.36
			//Version 80.0.3987.16
			//WebDriverManager.chromedriver().version("80.0.3987.16").setup();
		driver = new ChromeDriver();
		}
		
		if (browser.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
	}

	public static void runTest() {
		driver.get("https://google.com");
//		driver.close();
		driver.quit();
	}

}
