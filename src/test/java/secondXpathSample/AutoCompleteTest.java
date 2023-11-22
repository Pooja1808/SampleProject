package secondXpathSample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoCompleteTest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		//to test in headless mode
		options.addArguments("...headless");
		options.setBrowserVersion("115");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		System.out.println("Page Tile" + driver.get("https://www.google.com/"));

	}

}
