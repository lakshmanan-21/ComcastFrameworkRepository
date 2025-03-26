package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

        //driver.findElement(By.xpath("(//input)[1]/../../div/input[1]")).sendKeys("Peter");
	//driver.findElement(By.xpath("(//input)[2]/preceding-sibling::input")).sendKeys("jon");
//driver.findElement(By.xpath("(//input)[1]/following-sibling::input")).sendKeys("Henry");
//driver.findElement(By.xpath("(//input)[4]/parent::div/input[1]")).sendKeys("JSpiders");

//driver.findElement(By.xpath("(//input)[3]/following-sibling::input")).sendKeys("Bangalore");
	Thread.sleep(2000);	
  driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();

	}

}
