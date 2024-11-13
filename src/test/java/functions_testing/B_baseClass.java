package functions_testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class B_baseClass {
	WebDriver driver;

	public void browserLounch() throws Throwable {

		// WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 
	 //driver = new HtmlUnitDriver();

		//driver = new EdgeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testing.retteralarm.de/admin/users/login");
		driver.manage().window().maximize();
		

	}



}
