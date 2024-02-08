package Selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver1.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println("opened");
		driver.navigate().refresh();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Vishnu");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Vishnu591@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("8768545678");
		WebElement s= driver.findElement(By.xpath("//*[@id=\"male\"]"));
		s.click();
		WebElement v=driver.findElement(By.xpath("//*[@id=\"sunday\"]"));
		v.click();
		//driver.close();
	}

}
