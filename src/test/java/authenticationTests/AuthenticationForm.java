package authenticationTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;
import resources.Base;

public class AuthenticationForm extends Base{
private LoginPage loginPage;
private SecurePage securePage;

//Verifies the success message for a given user.
@Test(priority=1)
public void sucessAuthentication() {
//going to login page
loginPage = home.clickFormAuthLink();	
//getting the username from the properties file and sending as a parameter to setUserName method.
loginPage.setUserName(props.getProperty("username"));
//getting the password from the properties file and sending as a parameter to setUserPassword method.
loginPage.setUserPassword(props.getProperty("password"));
securePage = loginPage.clickLoginBtn();

//verifying if the actual text that I am getting from securePage is the same that I expect.
Assert.assertTrue(securePage.getSecureMessage()
		          .contains("You logged into a secure area!"), 
		          "The text does not match the expected secure message");
}

//Verifies error message when username and password are incorrect
@Test(priority=2)
public void failedAuthentication() {
loginPage = home.clickFormAuthLink();
loginPage.setUserName(props.getProperty("incorrectUser"));
loginPage.setUserPassword(props.getProperty("incorrectPassword"));
securePage = loginPage.clickLoginBtn();

//verifying the error message when username and password are incorrect
Assert.assertTrue(securePage.getFailedAuthMessage()
		           .contains("Your username is invalid!"), 
		           "the text does not match the expected error message for incorrect username and password");
}

//Verifies the error message when the username is correct but the password is incorrect
@Test(priority=3)
public void incorrectPasswordAuth() {
loginPage = home.clickFormAuthLink();
loginPage.setUserName(props.getProperty("username"));
loginPage.setUserPassword(props.getProperty("incorrectPassword"));
securePage = loginPage.clickLoginBtn();
Assert.assertTrue(securePage.getFailedAuthMessage()
		.contains("Your password is invalid!"), 
		"the text does not match the expected error message for incorrect password");  
}
}
