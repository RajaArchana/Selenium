package assignment4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		driver.findElement(By.id("input-username")).sendKeys("ArchanaRaja");
		driver.findElement(By.id("input-firstname")).sendKeys("Archana");
		driver.findElement(By.id("input-lastname")).sendKeys("R");
		driver.findElement(By.id("input-email")).sendKeys("archu.raja95@gmai.com");
		WebElement country = driver.findElement(By.id("input-country"));
		Select drop1= new Select(country);
		drop1.selectByVisibleText("Antarctica");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@2021");

	}

}
