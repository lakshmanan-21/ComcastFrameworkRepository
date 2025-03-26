package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/laksh/Documents/dropdownlist.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement element=	driver.findElement(By.id("cars"));
	Select obj=new Select(element);
System.out.println(obj.isMultiple());
obj.selectByVisibleText("Opel");
obj.selectByVisibleText("Audi");
obj.selectByIndex(1);
//obj.deselectByIndex(3);
//obj.deselectByIndex(2);
//obj.deselectByIndex(1);
System.out.println(obj.getAllSelectedOptions());
System.out.println(obj.getFirstSelectedOption());
	}

}
