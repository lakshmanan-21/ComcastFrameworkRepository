package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_Locators {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();

      Thread.sleep(2000);

driver.findElement(By.id("RememberMe")).click();
if(driver.findElement(By.id("RememberMe")).isSelected())
{
	System.out.println("CheckBox is selected suucessfullyh");
}
 if(driver.findElement(By.id("small-searchterms")).isDisplayed())
 {
	 driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
 }
if(driver.findElement(By.xpath("(//input[@type='submit'])[1]")).isEnabled())
{
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
}



	}

}
