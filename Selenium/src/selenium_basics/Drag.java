package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Drag {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://demo.guru99.com/test/drag_drop.html");
WebElement source=driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[5]"));
Actions action=new Actions(driver);
WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
action.clickAndHold(source).moveToElement(target).click().build().perform();

	}

}
