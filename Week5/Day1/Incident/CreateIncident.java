package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateIncident extends SignUp {

	@Test
	public void runCreate() throws InterruptedException {
		
		WebElement frame = driver.findElement(By.xpath("//main[@class='navpage-main']//iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//b[text()='All']")).click();
		
        //Click on Create new option and fill the manadatory fields
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//span[@class='icon icon-search']")).click();
		Set<String> windowHandleset = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandleset);
		driver.switchTo().window(windowHandlesList.get(1));
		Thread.sleep(30000);
		driver.findElement(By.xpath("(//a[@role='button'])[7]")).click();
		driver.switchTo().window(windowHandlesList.get(0));
		Thread.sleep(30000);
		driver.switchTo().frame(frame);
		String text = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Short Description");
		driver.findElement(By.xpath("//div[@class='form_action_button_container']//button")).click();
		Thread.sleep(30000);
		
       //Verify the newly created incident ( copy the incident number and paste it in search field and enter then verify the instance number created or not)
		driver.findElement(By.xpath("//td[@name='number']//input")).sendKeys(text,Keys.ENTER);
	}
	
	
}
