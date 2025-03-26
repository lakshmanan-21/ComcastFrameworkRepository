package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.linkText("Shopsy")).click();
		Set<String> childwindow=driver.getWindowHandles();
		for(String window:childwindow)
		{
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("Shopsy"))
			{
				
				driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sarees for women");
				Thread.sleep(2000);
				Actions action=new Actions(driver);
				WebElement element=driver.findElement(By.xpath("//span[text()='sarees for women']"));
				action.moveToElement(element).click().build().perform();
				//driver.findElement(By.cssSelector("input[type='text']")).submit();
				Thread.sleep(2000);
			}
		}
			driver.switchTo().window(parentwindow);
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sarees");
			driver.findElement(By.cssSelector("input[type='text']")).submit();
		
			
			
			
		


	}

}
