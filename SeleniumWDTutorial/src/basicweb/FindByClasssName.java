package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByClasssName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/DesktopW7/Documents/Libs/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String baseURL ="http://demostore.x-cart.com";
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		driver.findElement(By.className("title")).click();
		
		driver.findElement(By.className("leaf")).click();
		
	}

}
