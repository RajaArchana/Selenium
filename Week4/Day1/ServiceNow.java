package assignment16;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev113545.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Load ServiceNow application URL given above
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//div[@class='login']//following::input")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("w6hnF2FRhwLC");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();

		// Search “incident “ Filter Navigator
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();

		// Click “All”
		WebElement frame2 = driver.findElement(By.xpath("//main[@class='navpage-main']//iframe"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//b[text()='All']")).click();

		// Click New button
		driver.findElement(By.xpath("//button[text()='New']")).click();

		// Select a value for Caller and Enter value for short_description
		driver.findElement(By.xpath("//span[@class='icon icon-search']")).click();
		Set<String> windowHandleset = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandleset);
		driver.switchTo().window(windowHandlesList.get(1));
		Thread.sleep(30000);
		driver.findElement(By.xpath("(//a[@role='button'])[7]")).click();
		driver.switchTo().window(windowHandlesList.get(0));
		Thread.sleep(30000);
		driver.switchTo().frame(frame2);

		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Short Description");

		// Read the incident number and save it a variable
		String incidentNum = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");

		// Click on Submit button
		driver.findElement(By.xpath("//div[@class='form_action_button_container']/button")).click();

		// Search the same incident number in the next search screen as below
		driver.findElement(By.xpath("//div[@class='input-group']/input")).sendKeys(incidentNum, Keys.ENTER);

		// Verify the incident is created successful and take snapshot of the created
		// incident.
		String incidentNum1 = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		if (incidentNum.equalsIgnoreCase(incidentNum1)) {
			System.out.println("the incident is created successful");
			WebElement click = driver.findElement(By.xpath("//body[@class='       windows chrome      ']"));
			File src1 = click.getScreenshotAs(OutputType.FILE);
			File dst = new File("C:/Users/Archana Rajasekaran/Pictures/Frame/service.png");
			FileUtils.copyFile(src1, dst);
			System.out.println("ScreenShot end");
		} else {
			System.out.println("not created");
		}
		driver.close();
	}

}
