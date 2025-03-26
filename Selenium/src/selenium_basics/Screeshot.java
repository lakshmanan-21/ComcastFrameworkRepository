package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screeshot {

	public static void main(String[] args) throws IOException 
	{
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://demowebshop.tricentis.com/login");
       TakesScreenshot ts=(TakesScreenshot)driver;
       File sourcefile=ts.getScreenshotAs(OutputType.FILE);
       File destfile=new File("./Screenshots/Homepage.png");
       FileHandler.copy(sourcefile, destfile);
       driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	   File sfile=ts.getScreenshotAs(OutputType.FILE);
       File dfile=new File("./Screenshots/Searchpage.png");
       FileHandler.copy(sfile, dfile);
       driver.close();
       

	}

}
