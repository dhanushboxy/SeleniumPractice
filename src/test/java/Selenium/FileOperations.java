package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileOperations {
	
	public static void main(String[] args) throws IOException {
		
		
		File f = new File("C:\\Users\\Hp\\OneDrive\\Pictures\\Screenshots//Myfloder");
		
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		
		File f1 = new File("C:\\Users\\Hp\\OneDrive\\Pictures\\Screenshots//Myfloder//A//B//C//D");
		boolean mkdirs = f1.mkdirs();
		System.out.println(mkdirs);
		
		File f2 = new File("C:\\Users\\Hp\\OneDrive\\Pictures\\Screenshots//Myfloder//A//B//C//D//image.txt");
		boolean newFile = f2.createNewFile();
		System.out.println(newFile);
		
		FileUtils.write(f2, "hi dhanush how are you ");
		
		List<String> lines = FileUtils.readLines(f2);
		System.out.println(lines);
		
		for (String x : lines) {
			System.out.println(x);
			
		}
	
	}
	

}
