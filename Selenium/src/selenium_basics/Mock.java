package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mock {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.cssSelector("button[id='loginBtn']")).click();
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("lakshmanvenkat98@gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("BWd8ChWXj7t@Ayc");
		driver.findElement(By.cssSelector("button[id='Login']")).click();
		driver.findElement(By.cssSelector("a[id='men']")).click();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement link=driver.findElement(By.cssSelector("a[href='/sub-category/men-tshirt']"));
		action.doubleClick(link).build().perform();
		WebElement wishlist=driver.findElement(By.xpath("(//*[local-name()='svg']/*[name()='path'])[47]"));
		action.scrollToElement(wishlist).perform();
		//driver.findElement(By.xpath("(//*[local-name()='svg']/*[name()='path'])[47]")).click();
       action.doubleClick(wishlist).build().perform();
       driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
       driver.findElement(By.xpath("(//*[local-name()='svg']/*[name()='path'])[2]")).click();
       driver.findElement(By.cssSelector("button[id='buynow_fl'")).click();
       driver.findElement(By.xpath("//span[text()='Add New Address']")).click();
       driver.findElement(By.cssSelector("input[id='Name']")).sendKeys("Lakshmanan");
       driver.findElement(By.cssSelector("input[id='House/Office Info']")).sendKeys("Gopalan Coworks");
       driver.findElement(By.cssSelector("input[id='Street Info']")).sendKeys("kathreguppe, banashankari 3rd stage, bangalore");
       driver.findElement(By.cssSelector("input[id='Landmark']")).sendKeys("karnataka");
      WebElement dropDown = driver.findElement(By.cssSelector("select[id='Country']"));
      // WebElement country=driver.findElement(By.cssSelector("option[id='India']"));
       Select objsel=new Select(dropDown);
       objsel.selectByVisibleText("India");
      // driver.findElement(By.cssSelector("option[id='India']")).isSelected();

		







	}

}
