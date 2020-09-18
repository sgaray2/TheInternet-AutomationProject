package horizontalSliderTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;
import resources.Base;

public class SliderTests extends Base{
HorizontalSliderPage horizontalSliderPage;

	@Test(priority=1)
	public void verifyFifthValue() {
		horizontalSliderPage = home.clickHorizontalSliderLink();
		Assert.assertEquals(horizontalSliderPage.getSliderValue("5"), "5", "The expected result does not match with the actual result");
	}
	
	@Test(priority=2)
	public void verifySecondValue() {
		horizontalSliderPage = home.clickHorizontalSliderLink();
		Assert.assertEquals(horizontalSliderPage.getSliderValue("2"), "2", "The expected result does not match with the actual result");
	}
	
	@Test(priority=3)
	public void verifyFourthValue() {
		horizontalSliderPage = home.clickHorizontalSliderLink();
		Assert.assertEquals(horizontalSliderPage.getSliderValue("4"), "4", "The expected result does not match with the actual result");
	}
}
