package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Keyupanddown {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/books");
		Actions action=new Actions(driver);
		WebElement searchtextfield=driver.findElement(By.id("small-searchterms"));
		//action.moveToElement(searchtextfield).click().sendKeys("mobiles").perform();
		action.moveToElement(searchtextfield).click().keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).perform();
		
	}

}
