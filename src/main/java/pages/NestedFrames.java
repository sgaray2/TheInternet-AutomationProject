package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrames {

private WebDriver driver;
private String topFrame = "frame-top";
private String leftFrame = "frame-left";
private String rightFrame = "frame-right";
private By leftFrameTxt = By.xpath("//body[contains(text(),'LEFT')]");
private By rightFrameTxt = By.xpath("//body[contains(text(),'RIGHT')]");


public NestedFrames(WebDriver driver) { this.driver=driver;}

public String getLeftFrameMessage() {
	driver.switchTo().frame(topFrame);
	driver.switchTo().frame(leftFrame);
	return driver.findElement(leftFrameTxt).getText();
}

public String getRightFrameMessage() {
	driver.switchTo().frame(topFrame);
	driver.switchTo().frame(rightFrame);
	return driver.findElement(rightFrameTxt).getText();
}
}
