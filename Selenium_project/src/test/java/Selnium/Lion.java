package Selnium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lion {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver1.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//Thread.sleep(2000);
		
		System.out.println("opened");
		//driver.close();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getPageSource()
		
	}

}
