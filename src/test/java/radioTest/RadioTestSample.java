package radioTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioTestSample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement age= driver.findElement(By.id("isAgeSelected")) ;
		
		if(!age.isSelected())
		{age.click();			
		}
		driver.findElement(By.xpath("//input[@class='cb1-element'])[2]")).click();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.findElement(By.xpath("//input[@value='5 - 15']")).click();
}
}
