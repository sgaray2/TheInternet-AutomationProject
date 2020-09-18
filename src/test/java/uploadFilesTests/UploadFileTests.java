package uploadFilesTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FileUploadPage;
import resources.Base;

public class UploadFileTests extends Base {
FileUploadPage fileUploadPage;

	@Test
	public void uploadPDFFile() {
		fileUploadPage = home.clickFileUploadLink();
		fileUploadPage.uploadFile("C:\\Users\\Beba\\eclipse-workspace\\TheInternetProject\\src\\main\\java\\testFiles\\Kursliste.pdf");
		fileUploadPage.clickUploadBtn();
		Assert.assertEquals(fileUploadPage.getFileUploadedMessage(), 
				"File Uploaded!", 
				"The expected result does not match with the actual result");
		Assert.assertEquals(fileUploadPage.getFileUploadedName(), 
				"Kursliste.pdf", 
				"The file name does not match with the expected file name");
	}
}
