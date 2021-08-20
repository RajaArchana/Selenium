package assignment5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//Select the languages that you know?
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input")).click();
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input[3]")).click();
		
		//Confirm Selenium is checked
		boolean value=driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		if(value) {
			System.out.println("Selenium is checked");
		}else {
			System.out.println("Selenium is not checked");
		}
		
		//DeSelect only checked 
		int deselect=driver.findElements(By.xpath("//label[text()='DeSelect only checked']/following::input")).size();
		for (int i = 1    ; i <= deselect; i++) {
			boolean value11=driver.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)["+i+"]").isSelected();
			if(value11)
            driver.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)["+i+"]").click();
        }

		//Select all below checkboxes
		int size = driver.findElementsByXPath("//label[text()='Select all below checkboxes ']/following::input").size();
        for (int i = 1    ; i <= size; i++) {
            driver.findElementByXPath("(//label[text()='Select all below checkboxes ']/following::input)["+i+"]").click();
        }

	}

}
