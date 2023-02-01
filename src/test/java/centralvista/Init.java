package centralvista;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Init {
	private static WebDriver driver;
	 public static WebDriver getDriver() {
	        return driver;
	 }

	
	  @BeforeSuite
    public void beforeSuite() {
        System.out.println("Central Vista");
        System.setProperty("webdriver.chrome.driver", "D:\\testing\\WebAutomation-main\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://10.21.197.162:4200");
    }
//    @BeforeSuite
//    public void beforeSuite() {
//        System.out.println("Central Vista");
//       // Firefox Driver
//        System.out.println("Execution after setting driver path in system variables");
//		WebDriver driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://10.226.35.114/admin-dashboard/#/login");
//    }
	
//	@AfterSuite
//	public void teardown()
//	{
//		driver.quit();
//	}

}
