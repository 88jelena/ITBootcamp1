package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projekat1 {

	public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
		        // 1. Launch a new web browser
		        // 2. Open http://newtours.demoaut.com/
		        // 3. Get Page Title name and Title length
		        // 4. Print Page Title and Title length on the Eclipse Console
		        // 5. Get Page URL and verify if the it is a correct page opened
		        // 6. Get Page Source (HTML Source code) and Page Source length
		        // 7. Print Page Length on Eclipse Console
		        // 8. Close the browser
		        driver.get("http://newtours.demoaut.com/");
		        driver.getTitle();
		        driver.getTitle().length();
		        System.out.println("Ttitle is " + driver.getTitle() + " " + driver.getTitle().length());

		        if (driver.getCurrentUrl().equals("http://newtours.demoaut.com/"))
		            System.out.println("U redu je");
		        else
		            System.out.println("Nije u redu");
		        driver.close();
		    }

		}
