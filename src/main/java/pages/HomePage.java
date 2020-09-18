package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
private WebDriver driver;
private By formAuthLink = By.cssSelector("a[href='/login']");
private By framesLink = By.cssSelector("a[href='/frames']");
private By fileUploadLink = By.cssSelector("a[href='/upload']");
private By horizontalSliderLink = By.cssSelector("a[href='/horizontal_slider']");

public HomePage(WebDriver driver) {this.driver=driver;}

public LoginPage clickFormAuthLink() {
	driver.findElement(formAuthLink).click();
	return new LoginPage(driver);
}

public FramesPage clickFramesLink() {
	driver.findElement(framesLink).click();
	return new FramesPage(driver);
}

public FileUploadPage clickFileUploadLink() {
	driver.findElement(fileUploadLink).click();
	return new FileUploadPage(driver);
}

public HorizontalSliderPage clickHorizontalSliderLink() {
	driver.findElement(horizontalSliderLink).click();
	return new HorizontalSliderPage(driver);
}
}
