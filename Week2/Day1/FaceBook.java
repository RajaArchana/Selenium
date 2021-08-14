package assignment4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("English (UK)"));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Archana");
		driver.findElement(By.name("lastname")).sendKeys("R");
		driver.findElement(By.name("reg_email__")).sendKeys("9874563210");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Selenium@2021");
		WebElement day = driver.findElement(By.id("day"));
		Select drop1= new Select(day);
		drop1.selectByVisibleText("29");
		WebElement month = driver.findElement(By.id("month"));
		Select drop2= new Select(month);
		drop2.selectByValue("1");
		WebElement year = driver.findElement(By.id("year"));
		Select drop3= new Select(year);
		drop3.selectByValue("1995");
		WebElement check = driver.findElement(By.name("sex"));
		check.click();

	}

}
