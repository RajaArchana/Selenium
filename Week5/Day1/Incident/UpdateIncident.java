package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdateIncident extends SignUp {

	@Test
	public void runUpdate() throws InterruptedException {
		
        //Search for the existing incident and click on the incident
		WebElement frame = driver.findElement(By.xpath("//main[@class='navpage-main']//iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//b[text()='All']")).click();
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
        //Update the incidents with Urgency as High and State as In Progress
		WebElement urgency = driver.findElement(By.id("incident.urgency"));
		Select drop= new Select(urgency);
		drop.selectByVisibleText("1 - High");
		System.out.println("the update incident");
		WebElement state = driver.findElement(By.id("incident.state"));
		Select drop1= new Select(state);
		drop1.selectByVisibleText("In Progress");
		System.out.println("the update incident In Progress");
		driver.findElement(By.xpath("//div[@class='form_action_button_container']//button")).click();
		
         //Verify the priority and state 
		//driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		String urgencyText = driver.findElement(By.xpath("//option[@selected='SELECTED']")).getText();
		if(urgencyText.contains("1 - High")) {
		System.out.println("the update incident is high----");
		}else {
			System.out.println("the update incident is not high----");
		}
		String stateText = driver.findElement(By.xpath("(//option[@selected='SELECTED'])[2]")).getText();
		if(stateText.contains("In Progress")) {
			System.out.println("the update incident is In Progress----");
			}else {
				System.out.println("the update incident is not In Progress----");
			}
	}

}
