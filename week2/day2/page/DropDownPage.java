package assignment5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		WebElement drop = driver.findElement(By.id("dropdown1"));
		Select drop1 = new Select(drop);
		drop1.selectByIndex(1);
		WebElement dropdown1 = driver.findElement(By.name("dropdown2"));
		Select drop2 = new Select(dropdown1);
		drop2.selectByVisibleText("Appium");
		WebElement dropdown2 = driver.findElement(By.name("dropdown3"));
		Select drop3 = new Select(dropdown2);
		drop3.selectByValue("3");
		WebElement dropdownsize = driver.findElement(By.className("dropdown"));
		Select size = new Select(dropdownsize);
		List<WebElement> optionsize=size.getOptions();
		int num=optionsize.size();
		System.out.println("Get the number of dropdown options----"+num);
		WebElement senKeys = driver.findElement(By.xpath("//div[5]/select"));
		senKeys.click();
		senKeys.sendKeys("Loadrunner");
	    senKeys.sendKeys(Keys.ENTER);
		
		WebElement dropdownsend = driver.findElement(By.xpath("//div[6]/select"));
		Select drop4 = new Select(dropdownsend);
		drop4.selectByValue("2");
		
		
	}

}
