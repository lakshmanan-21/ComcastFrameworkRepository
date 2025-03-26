package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[contains(text(),'Shadow Root Elements')]")).click();
      driver.findElement(By.xpath("(//section[contains(text(),'Shadow Root')])[2]")).click();
      
      Thread.sleep(2000);
     SearchContext shadow_host = driver.findElement(By.xpath("(//form/div)[1]")).getShadowRoot(); 
      shadow_host.findElement(By.cssSelector("input[type='text']")).sendKeys("Raman");
      
      
	}

}
