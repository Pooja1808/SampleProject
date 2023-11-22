package secondXpathSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(8000);
		List<WebElement> items = driver.findElements(By.xpath("//div[contains(@class,'_2VHNef')]"));
		System.out.println(items.size());
		for (WebElement item : items)
		{
			System.out.println(item.getText());
			
		}
			
	}

}
