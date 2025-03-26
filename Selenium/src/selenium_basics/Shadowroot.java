package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadowroot {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		driver.findElement(By.xpath("(//section[contains(@class,'poppins text-[15px]')])[10]")).click();
driver.findElement(By.xpath("(//section[contains(text(),'Shadow Root')])[2]")).click();
SearchContext shadowhost = driver.findElement(By.xpath("(//form/div)[1]")).getShadowRoot();
shadowhost.findElement(By.cssSelector("input[type='text']")).sendKeys("Raman");
SearchContext shadowhost1 = driver.findElement(By.xpath("(//form/div)[2]")).getShadowRoot();
shadowhost1.findElement(By.cssSelector("input[type='text']")).sendKeys("seetha");


	}

}
