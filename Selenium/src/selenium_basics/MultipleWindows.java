package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException 
	{

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/login");
Thread.sleep(2000);
String parentwindow=driver.getWindowHandle();
driver.findElement(By.linkText("Facebook")).click();
Thread.sleep(2000);
Set<String> childwindows = driver.getWindowHandles();
for(String window:childwindows)
{
	driver.switchTo().window(window);
	if(driver.getTitle().contains("Facebook"))
	{
		System.out.println(driver.getTitle() );
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("lakshvenkat98@gmail.com");
		Thread.sleep(3000);
		driver.close();
			
	}
}
driver.switchTo().window(parentwindow);
Thread.sleep(2000);
driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(2000);
		
	}

}
