package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Locators 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		//driver.get("file:///C:/Users/laksh/Documents/xmlPath2.html");
	driver.manage().window().maximize()	;
	//WebElement searchtextfield= driver.findElement(By.name("q"));
	//searchtextfield.sendKeys("mobiles");
	//WebElement search=driver.findElement(By.id("small-searchterms"));
	//search.sendKeys("mobiles");
	//driver.findElement(By.linkText("Register")).click();
	//driver.findElement(By.linkText("Log in")).click();
	//driver.findElement(By.partialLinkText("cart")).click();
	//driver.findElement(By.name("NewsletterEmail")).sendKeys("mobiles");
	//driver.findElement(By.className("password")).sendKeys("1234567");
	//driver.findElement(By.name("RememberMe")).click();
	//driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("computers");
	//driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
	//driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Lakshmanan");
	//driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Selvabala");
	//driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Raman");
	//driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Seetha");
	//driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("Jspiders");
	//driver.findElement(By.xpath("/html/body/div[2]/input[2f]")).sendKeys("Bangalore");
	//driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("lakshmanvenkat98@gmail.com");
	//driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
	//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("computers");
//driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();	
//driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("computers");
//driver.findElement(By.xpath("(//input[contains(@class,'button-1')])[1]")).click();
//driver.findElement(By.xpath("(//a[starts-with(text(),'Electronics' )] )[1]")).click();	
//driver.findElement(By.xpath("//input[starts-with(@name,'Newsletter')]")).sendKeys("lakshmanvenkat98@gmail.com");	
//driver.findElement(By.xpath("//input[starts-with(@value,'Subscribe')]")).click();	
	}

}
