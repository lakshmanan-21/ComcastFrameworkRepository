package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
 
		//ChromeDriver driver=new ChromeDriver(); 
     WebDriver driver =new ChromeDriver();
   driver.get("https://www.google.co.in");
   
      String title=driver.getTitle();
      System.out.println(title);
      String currenturl=driver.getCurrentUrl();
      System.out.println(currenturl);
      
     String pagesource= driver.getPageSource();
     System.out.println(pagesource);
    // driver.close();
     driver.navigate().to("https://demowebshop.tricentis.com/login");
     Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      driver.navigate().forward();
      Thread.sleep(2000);
      
      driver.navigate().refresh();
      Thread.sleep(4000);
     
      driver.manage().window().maximize();
      Thread.sleep(2000);
      driver.manage().window().minimize();
      Thread.sleep(2000);
      //driver.manage().window().maximize();
      //Thread.sleep(2000);
    
	}
 
}
