package webDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String url = "http://newtours.demoaut.com/";
		driver.get(url);
		try {
			WebElement regButton = driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
			regButton.click();

			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Jelena");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Obradovic");
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234568");
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("hockeyasica_dancer@yahoo.com");
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Pecska 5");
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Belgrade");
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Serbia");
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("11000");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Jelena");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Jelena");
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Jelena");

			WebElement SubmitButton = driver.findElement(By.xpath("//input[@name='register']"));
			SubmitButton.click();

		} catch (Exception ex) {
			System.out.println(ex.toString());
		} finally {
			driver.quit();
		}

	}
}
