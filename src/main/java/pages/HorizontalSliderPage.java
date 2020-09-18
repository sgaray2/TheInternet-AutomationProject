package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
private WebDriver driver;
private By sliderInput = By.cssSelector("input[type='range']");
private By sliderValue = By.cssSelector("#range");

public HorizontalSliderPage(WebDriver driver) {
	this.driver = driver;
}

public String getSliderValue(String value) {
	
	while(!driver.findElement(sliderValue).getText().equalsIgnoreCase(value)) {
		driver.findElement(sliderInput).sendKeys(Keys.ARROW_RIGHT);
	}
	return driver.findElement(sliderValue).getText();
}
}
