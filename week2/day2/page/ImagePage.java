package assignment5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Click on this image to go home page
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following::img")).click();
		String homeUrl = driver.getTitle();
		if (homeUrl.contains("TestLeaf - Selenium Playground")) {
			System.out.println("It enters into home page");
			driver.findElement(By.xpath("//img[@alt='Images']")).click();
		} else {
			System.out.println("It doesnt enters into home page");

		}

		// Am I Broken Image?

		// Click me using Keyboard or Mouse
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following::img")).click();
		String home = driver.getTitle();
		if (home.contains("TestLeaf - Selenium Playground")) {
			System.out.println("It enters into home page");
			driver.findElement(By.xpath("//img[@alt='Images']")).click();
		} else {
			System.out.println("It doesnt enters into home page");

		}

	}

}
