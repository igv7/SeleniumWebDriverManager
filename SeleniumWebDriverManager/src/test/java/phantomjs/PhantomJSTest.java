package phantomjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSTest {
	
	static String projectPath = "/Users/Igor/git/SeleniumWebDriverManager/SeleniumWebDriverManager";
	static String url = "https://selenium.dev/";
	
	public static void main(String[] args) {
		
		System.setProperty("phantomjs.binary.path", projectPath+"/lib/phantomjs/phantomjs.exe");
		
//		PhantomJSDriver driver = new PhantomJSDriver();
		WebDriver driver = new PhantomJSDriver();
		driver.get(url);
		System.out.println("Title of the web page is: "+driver.getTitle());
		
		driver.quit();
	}

}
