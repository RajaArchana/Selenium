package assignment18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);

		WebElement item1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement item5 = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions builder = new Actions(driver);
		builder.dragAndDrop(item1, item5).build().perform();
	}

}
