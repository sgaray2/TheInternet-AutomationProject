package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
	private WebDriver driver;
	private By uploadInput = By.cssSelector("#file-upload");
	private By uploadBtn = By.id("file-submit");
	private By fileUploadedMessage = By.xpath("//h3[contains(text(),'File Uploaded!')]");
	private By fileUploadedName = By.cssSelector("#uploaded-files");

public FileUploadPage(WebDriver driver) {
	this.driver = driver;
}

public void clickUploadBtn() {
	driver.findElement(uploadBtn).click();
}

public void uploadFile(String filePath) {
	driver.findElement(uploadInput).sendKeys(filePath);	
}

public String getFileUploadedMessage() {
	return driver.findElement(fileUploadedMessage).getText();
}

public String getFileUploadedName() {
	return driver.findElement(fileUploadedName).getText();
}
}
