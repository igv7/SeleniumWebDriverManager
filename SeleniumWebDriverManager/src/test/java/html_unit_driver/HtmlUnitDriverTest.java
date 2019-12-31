package html_unit_driver;

import java.lang.reflect.Field;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;


public class HtmlUnitDriverTest {
	
	public static void main(String[] args) throws Exception {
		
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_2);
		driver.get("https://selenium.dev/");
		
		System.out.println("Title is: " +driver.getTitle());
		
		WebClient webClient = (WebClient) get(driver, "webClient");
		System.out.println("Browser version is: " +webClient.getBrowserVersion());
		System.out.println("Is Browser Firefox: " +webClient.getBrowserVersion().isFirefox());
		System.out.println("Is Browser IE: " +webClient.getBrowserVersion().isIE());
		
		driver.quit();
	}
	
	private static Object get(Object object, String field) throws Exception {
		Field f = object.getClass().getDeclaredField(field);
		f.setAccessible(true);
		return f.get(object);
	}

}
