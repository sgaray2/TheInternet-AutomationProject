package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class Base {
private WebDriver driver;
protected Properties props;
private String browserName;
private String environmentUrl;
protected HomePage home;
private String dir;

public Base() {
	
	try {
		dir = System.getProperty("user.dir");
		props= new Properties();
		FileInputStream fis;
		fis = new FileInputStream(dir + "/src/main/java/configurations/config.properties");
		props.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("an error has ocurred with the properties file" + e.getMessage());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("An unexpected error has ocurred" + e.getMessage());
	}
}

@BeforeMethod
//before any test it will execute this
public void browserSetUp() {
	browserName= props.getProperty("browser");
	environmentUrl = props.getProperty("URL");
	
	if(browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	//going to the selected url
	driver.get(environmentUrl);
	
	//Providing the handle to the home page
	home = new HomePage(driver);
}

@AfterMethod
//this method will execute after all the tests
public void tearDown() {
	driver.quit();
}
}
