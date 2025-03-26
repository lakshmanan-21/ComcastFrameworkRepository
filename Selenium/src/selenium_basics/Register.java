package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("Gender")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Lakshmanan");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("SelvaBala");
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("lakshmanvenkat98@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("1234lasds");
		Thread.sleep(2000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("1234lasds");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		
	}

}
