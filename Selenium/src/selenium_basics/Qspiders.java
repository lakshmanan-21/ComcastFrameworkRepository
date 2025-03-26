package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspiders 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kvb.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a)[1][text()='About Us']")).click();


	}

}
