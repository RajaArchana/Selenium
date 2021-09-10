package Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MergeLead extends BaseClass {

	@Test
	public void runMergeLead() throws InterruptedException {
driver.findElement(By.linkText("Merge Leads")).click();
		
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::img")).click();
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandlesSet);
		driver.switchTo().window(windowHandlesList.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(windowHandlesList.get(0));
		
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following::img")).click();
		Set<String> windowHandleSet = driver.getWindowHandles();
		List<String> windowHandleList = new ArrayList<String>(windowHandleSet);
		driver.switchTo().window(windowHandleList.get(1));
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/following::a")).click();
		driver.switchTo().window(windowHandleList.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String tilte = driver.getTitle();
		if (tilte.contains("View Contact | opentaps CRM")) {
			System.out.println("Verified-----" + tilte);
		} else {
			System.out.println("Somethhing went wrong");
		}

	}
}
