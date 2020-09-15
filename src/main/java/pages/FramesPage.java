package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
private WebDriver driver;
private By nestedFramesLink = By.cssSelector("a[href='/nested_frames']");
	
public FramesPage(WebDriver driver) {
	this.driver=driver;
}

public NestedFrames clickNestedFramesLink() {
	driver.findElement(nestedFramesLink).click();
	return new NestedFrames(driver);
}
}
