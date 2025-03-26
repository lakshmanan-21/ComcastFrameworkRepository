package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Class {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 WebElement element=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));

Actions action=new Actions(driver);
//action.doubleClick(element).build().perform();
WebElement element1=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	action.contextClick(element1).build().perform();	 
	}

}
