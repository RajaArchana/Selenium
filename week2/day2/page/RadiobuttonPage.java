package assignment5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadiobuttonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//Are you enjoying the classes?
		driver.findElement(By.id("yes")).click();
		
		//Find default selected radio button
		boolean value=driver.findElement(By.xpath("//label[text()='Find default selected radio button']/following::input")).isSelected();
		System.out.println(value);
		if(value) {
			
		}
		boolean value1=driver.findElement(By.xpath("//label[text()='Find default selected radio button']/following::input[2]")).isSelected();
		System.out.println(value1);
}
}
