package secondXpathSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		WebElement impBox = driver.findElement(By.xpath("//input[@type='text']"));
		impBox.sendKeys("Hello Welcome");
	}

}
