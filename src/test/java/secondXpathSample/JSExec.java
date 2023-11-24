package secondXpathSample;

import java.time.Duration;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import net.bytebuddy.asm.Advice.Return;

public class JSExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String strTit = (String)js.executeScript("return document.title");
		System.out.println(strTit);
		
		WebElement searchBox = (WebElement)js.executeScript(
				"return document.getElementByName('search')[1]");
		
		searchBox.sendKeys("Phone");
		
}
}
