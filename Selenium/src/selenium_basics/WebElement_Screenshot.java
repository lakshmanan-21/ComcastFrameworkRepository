package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElement_Screenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://demowebshop.tricentis.com/login");
	WebElement searchtextfield=driver.findElement(By.id("small-searchterms"));
    searchtextfield.sendKeys("mobiles");
    TakesScreenshot ts=(TakesScreenshot)driver;
    File sfile=searchtextfield.getScreenshotAs(OutputType.FILE);
    File dfile=new File("./Screenshots/searchtextfield.png");
    FileHandler.copy(sfile, dfile);
    WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
    File sourcefile=button.getScreenshotAs(OutputType.FILE);
    File destinationfile=new File("./Screenshots/button.png");
    FileHandler.copy(sourcefile, destinationfile);
    driver.close();
    
	}

}
