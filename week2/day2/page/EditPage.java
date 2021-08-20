package assignment5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//Enter your email address
		driver.findElement(By.id("email")).sendKeys("archu.raja95@gmail.com");
		
		//Append a text and press keyboard tab
		WebElement value1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		String text1= value1.getAttribute("value");
		value1.clear();
		String send = text1 + "added text";
		value1.sendKeys(send);
		
		//Get default text entered
		WebElement value = driver.findElement(By.name("username"));
		String text= value.getAttribute("value");
		System.out.println("Get default text entered-----"+text);
		
		//Clear the text
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		 
		//Confirm that edit field is disabled
		boolean disable = driver.findElement(By.xpath("(//input[@type='text'])[5]")).isDisplayed();
		if(disable == true) {
			System.out.println("The edit field is disabled");
		}else {
			System.out.println("The edit field is not disabled");
		}
		 
	}

}
