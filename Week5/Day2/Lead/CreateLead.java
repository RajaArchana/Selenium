package Assignment3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test(dataProvider = "sendData")
	public void runCreateLead(String fName, String lName, String cmpName, String pName) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pName);
		driver.findElement(By.name("submitButton")).click();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcel.getRead();
	}
	
}
