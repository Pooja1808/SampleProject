package secondXpathSample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWIndow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println("Print WIndow" +parentWin);
		
		WebElement tabBtn = driver.findElement(By.xpath("//button[contains(text(),'new Tab')]"));		
		tabBtn.click();
		System.out.println("Page Title" +driver.getTitle());
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("No of windows" +tabs.size());
		
		for (String child:tabs)
		{
			System.out.println("Windows....." +child);
			if(!child.equalsIgnoreCase(parentWin))
			{
				driver.switchTo().window(child);
				System.out.println("Child win title...." +driver.getTitle());
				driver.findElement(By.xpath("(//span[contains(text(),'Java'])[1]")).click();
		}
		}
		driver.close();
		driver.switchTo().window(parentWin);
		System.out.println("Page win title...." +driver.getTitle());
		
		driver.findElement(By.xpath("(//button[contains(text(),'new Window'])")).click();
		
		Set<String> tab1=driver.getWindowHandles();
		System.out.println("No of windows...." +tab1.size());
		
		for(String child:tab1)
		{
			System.out.println("Windows...." + child);
			if(!child.equalsIgnoreCase(parentWin))
			{
				driver.switchTo().window(child);
				System.out.println("child win title..." + driver.getTitle());
		}
		
		}
		driver.close();
		driver.switchTo().window(parentWin);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("");
		
		//driver.quit();
	}

}
