package webDriver;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	
        driver.get(DataYT.url);
		try {
			driver.findElement(By.xpath(DataYT.xPath)).click();
			
			
			WebElement searchBar = driver.findElement(By.id("search"));
	        searchBar.sendKeys("Rick Astley");
	        
	       
	        WebElement searchButton = driver.findElement(By.xpath(DataYT.xP1));
	        searchButton.click();
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        
	        WebElement playSong = driver.findElement(By.xpath(DataYT.xP2));
	        playSong.click();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        WebElement pause = driver.findElement(By.xpath(DataYT.xP3));
	        Thread.sleep(12000);
	        pause.click();
	        
	        List<WebElement> lst2=driver.findElements(By.className("ytd-watch-next-secondary-results-renderer"));
            lst2.get(4).click();
            
            WebElement subButton = driver.findElement(By.xpath("//ytd-subscribe-button-renderer[@class='style-scope ytd-video-secondary-info-renderer']//yt-formatted-string[@class='style-scope ytd-subscribe-button-renderer'][contains(text(),'Subscribe')]"));
            subButton.click();
            
	        
	   //      List <WebElement> list1 = new ArrayList<>();
//	         List <WebElement> list2 = driver.findElements(By.className("");
//	         System.out.println(list2.get(2));
	         //liste ako necemo da se bakcemo sa nizovima
	        
	       
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        
		} catch (Exception ex) {
            System.out.println(ex.toString());
  } finally {
      System.out.println();
	

  }
	}

}
