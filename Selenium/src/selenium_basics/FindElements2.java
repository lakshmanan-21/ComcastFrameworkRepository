package selenium_basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {

	public static void main(String[] args) {

 WebDriver driver=new ChromeDriver();
 driver.get("https://demowebshop.tricentis.com/login");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 List<WebElement> links=driver.findElements(By.xpath("//a"));
 System.out.println(links.size());
  for(int i=0;i<=links.size()-1;i++)
  {
	  String linktext=links.get(i).getAttribute("href");
	  System.out.println(linktext);
  }
 
 
	}

}
