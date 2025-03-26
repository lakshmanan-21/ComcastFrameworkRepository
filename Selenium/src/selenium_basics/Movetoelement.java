package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Movetoelement {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demowebshop.tricentis.com/login");
WebElement element=driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
Actions action=new Actions(driver);
action.moveToElement(element).click().build().perform();
WebElement book=driver.findElement(By.linkText("Computing and Internet"));
action.moveToElement(book).click().build().perform();

	}

}
