package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {

private WebDriver driver;
private By securePageMessage = By.id("flash");
private By failedAuthMessage = By.cssSelector("div[class='flash error']");

public SecurePage(WebDriver driver) {this.driver=driver;}

public String getSecureMessage() {
	return driver.findElement(securePageMessage).getText();
}

public String getFailedAuthMessage() {
	return driver.findElement(failedAuthMessage).getText();
}
}
