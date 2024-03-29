package secondXpathSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		WebElement salElem = driver.findElement(By.xpath("//td[contains(text(), 'B.Wagner')//following-sbling::td[5]]"));
		System.out.println("Salary...." +salElem);
		List<WebElement> items = driver.findElements(By.xpath("//td[text()='B.Wagner']//following-siblings::td"));
		System.out.println("Number of items...." +items.size());
		for(WebElement cell: items)
		{
			System.out.println(cell.getText());
		}
	}

}
