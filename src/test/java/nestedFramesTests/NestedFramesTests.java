package nestedFramesTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NestedFrames;
import pages.FramesPage;
import resources.Base;

public class NestedFramesTests extends Base{
private FramesPage framesPage;
private NestedFrames nestedFrames;
	
@Test(priority=1)	
//this test case check the text inside the left frame.
public void verifyLeftFrame() {
	framesPage = home.clickFramesLink();
	nestedFrames = framesPage.clickNestedFramesLink();
	Assert.assertEquals(nestedFrames.getLeftFrameMessage(), 
			"LEFT", 
			"The expected message does not match with the actual message");
}

@Test(priority=2)
public void verifyRightFrame() {
	framesPage = home.clickFramesLink();
	nestedFrames = framesPage.clickNestedFramesLink();
	Assert.assertEquals(nestedFrames.getRightFrameMessage(), "RIGHT", "The expected message does not match with the actual message");
}
}
