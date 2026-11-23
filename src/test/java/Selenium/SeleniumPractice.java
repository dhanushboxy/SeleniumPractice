package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/?utm_source=chatgpt.com");
		
		String Product = "Sauce Labs Backpack";
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement prod = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		prod.click();
		
		//WebElement prod2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		//prod2.click();
		
		WebElement cart = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
		cart.click();
		
		String text = driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']")).getText();
		
		if (text.equals(Product)) {
			System.out.println("product is added");
		
			
		} else {
			System.out.println("product not added correctly");

		}
	}
	

}
