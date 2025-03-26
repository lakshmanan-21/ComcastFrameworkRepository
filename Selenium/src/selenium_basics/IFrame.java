package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/laksh/Documents/IFrame.html");
		//driver.switchTo().frame(0);
		//driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//driver.switchTo().defaultContent();
		//driver.findElement(By.linkText("Google")).click();
//driver.switchTo().frame("frame1");
//driver.findElement(By.linkText("Register")).click();
//Thread.sleep(2000);
//driver.switchTo().parentFrame();
//driver.findElement(By.linkText("Google")).click();
driver.switchTo().frame(driver.findElement(By.id("FR1")));
driver.findElement(By.id("newsletter-email")).sendKeys("lakshmanvenkat98@gmail.com");
driver.findElement(By.id("newsletter-subscribe-button")).click();




	}

}
