package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteIncident extends SignUp{

	@Test
	public void runDelete() throws InterruptedException {
        //Search for the existing incident and navigate into the incident
		WebElement frame = driver.findElement(By.xpath("//main[@class='navpage-main']//iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//b[text()='All']")).click();
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
        //Delete the incident
		String text = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath("//div[@class='form_action_button_container']//button[3]")).click();
		driver.findElement(By.xpath("//div[@id='delete_confirm_form']")).click();
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		System.out.println("Deleted");
		
        // Verify the deleted incident
		driver.findElement(By.xpath("//input[@id='incident_table_header_search_control']")).sendKeys(text);
		String msg = driver.findElement(By.xpath("//tr[@class='list2_no_records']/td")).getText();
		if(msg.contains("No records to display")) {
			System.out.println("Incident is deleted");
		}else {
			System.out.println("Incident is not deleted");
		}
		
		
	}

}
