package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Wait {

public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/login");
//Thread.sleep(3000);
WebElement searchtext=driver.findElement(By.id("small-searchterms"));
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
wait.until(ExpectedConditions.elementToBeClickable(searchtext));
driver.findElement(By.id("small-searchterms")).sendKeys("computers");
driver.findElement(By.xpath("//input[@type='submit']")).click();
//Thread.sleep(2000);
WebElement searchpage=driver.findElement(By.xpath("//h1[text()='Search']"));
wait.until(ExpectedConditions.visibilityOf(searchpage));
driver.close();
driver.quit();
		
		
		



	}

}
