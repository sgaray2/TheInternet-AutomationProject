package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
private WebDriver driver;
private By username = By.id("username");
private By password = By.id("password");
private By loginBtn = By.cssSelector("button[type='submit']");

public LoginPage(WebDriver driver) {
this.driver = driver;	
}

public void setUserName(String user) {
	driver.findElement(username).sendKeys(user);
}

public void setUserPassword(String pwd) {
	driver.findElement(password).sendKeys(pwd);
}

public SecurePage clickLoginBtn() {
	driver.findElement(loginBtn).click();
	return new SecurePage(driver);
}
}
