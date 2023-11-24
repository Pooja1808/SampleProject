package first;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.internal.util.xml.impl.Input;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https//www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement scrBox = driver.findElement(By.name("q")).sendKeys("Java Tutorial");
		Thread.sleep(2000);
		List<WebElement> listElement = 	driver.findElement(By.xpath("(//ul[@role='listbox'])[1]//li//descendant::div[@class='wM6W7d']"));
		System.out.println("Number of Elements...." +listElement.size());
		for(int i=0;i<listElement.size();i++)
		{
		System.out.println("");
		}
	}

}
