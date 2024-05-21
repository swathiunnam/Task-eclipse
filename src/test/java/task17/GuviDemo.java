package task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximise browser
		driver.manage().window().maximize();
		//open guvi
		driver.get("https://www.guvi.in/register");
		//id locator
		driver.findElement(By.id("//input[@id='name']")).sendKeys("Test");


	}

}
