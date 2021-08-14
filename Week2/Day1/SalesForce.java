package assignment4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		//Login page
		driver.findElement(By.name("UserFirstName")).sendKeys("Archana");
		driver.findElement(By.name("UserLastName")).sendKeys("Raja");
		driver.findElement(By.name("UserEmail")).sendKeys("archu.raja95@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Google");
		driver.findElement(By.name("UserPhone")).sendKeys("9874563210");
		WebElement userTitle = driver.findElement(By.name("UserTitle"));
		Select drop1= new Select(userTitle);
		drop1.selectByVisibleText("IT Manager");
		WebElement CompanyEmployees = driver.findElement(By.name("CompanyEmployees"));
		Select drop2= new Select(CompanyEmployees);
		drop2.selectByVisibleText("15 - 100 employees");
		//WebElement CompanyCountry = driver.findElement(By.name("CompanyCountry"));
		//Select drop3= new Select(CompanyCountry);
		//drop3.selectByVisibleText("United States");
		WebElement check = driver.findElement(By.className("checkbox-ui"));
		check.click();

	}

}
