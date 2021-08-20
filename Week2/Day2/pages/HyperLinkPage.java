package assignment5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Go to Home Page
		WebElement home = driver.findElement(By.xpath("//a[text()='Go to Home Page']"));
		String homeUrl = home.getAttribute("href");
		home.click();
		if(homeUrl.contains("home")) {
			System.out.println("It enters into home page");
			driver.findElement(By.xpath("//img[@alt='Link']")).click();
		}else {
			System.out.println("It doesnt enters into home page");

		}
		
		// Find where am supposed to go without clicking me?
		WebElement button = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']"));
		button.click();
		String buttonUrl = driver.getTitle();
		if(buttonUrl.contains("TestLeaf - Interact with Buttons")) {
			System.out.println("It enters into button page");
			driver.findElement(By.id("home")).click();
			driver.findElement(By.xpath("//img[@alt='Link']")).click();
		}else {
			System.out.println("It doesnt enters into button page");
		}
		
		// Verify am I broken?
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		String error = driver.getTitle();
		if(error.contains("HTTP Status 404 – Not Found")) {
			System.out.println("It enters into error page");
			driver.get("http://leafground.com/pages/Link.html");
		}else {
			System.out.println("It doesnt enters into error page");
		}

		// Go to Home Page (Interact with same link name)
		//How many links are available in this page?
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println("links are available in this page "+size);
	}

}
