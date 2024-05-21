package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();   
		//navigate to google
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();
	
		
		
		
	}

}
