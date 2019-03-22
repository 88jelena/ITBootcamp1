package webDriver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projekat2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Unesite neki broj");
        int n = sc.nextInt();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        try {
            
            String title = driver.getTitle();
            int titlelength = driver.getTitle().length();
            System.out.println("Title is " + driver.getTitle());
            System.out.println("Title length is " + driver.getTitle().length());
            String pageSource = driver.getPageSource();
            int pageSourceLength = driver.getPageSource().length();
            driver.navigate().to("https://proctorio.com/");
            System.out.println("Page Source length is " + driver.getPageSource().length());
            if (driver.getCurrentUrl().equals("https://www.facebook.com/"))
                System.out.println("Correct page is opened");
            else
                System.out.println("Incorrect page is opened");
        } catch (Exception ex) {

        } finally {
            driver.quit();

        }
		

	}

}
