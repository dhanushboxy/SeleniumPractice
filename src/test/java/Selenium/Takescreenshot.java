package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/?utm_source=chatgpt.com");
		

		
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Users\\Hp\\eclipse-workspace\\SeleniumPractice//Screenshot/image.jpeg");
		
		FileUtils.copyFile(screenshotAs, f);
		
		
	}

}
