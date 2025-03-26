package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Shadowroot1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//h1[text()='Login']")).click();
     Actions action=new Actions(driver);
     action.sendKeys(Keys.TAB).perform();
     Thread.sleep(2000);
     action.sendKeys("lakshmanan").perform();
     action.sendKeys(Keys.TAB).perform();
     Thread.sleep(2000);
     action.sendKeys("selvabala").perform();
    
     
     
	}

}
