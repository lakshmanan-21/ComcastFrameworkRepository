package selenium_basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/laksh/Documents/doc.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement element=	driver.findElement(By.id("cars"));
		Select obj=new Select(element);
List<WebElement> drop=obj.getOptions();
for(WebElement dropdown:drop)
{
	System.out.println(dropdown.getText());
}

	}
}
