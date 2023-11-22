package secondXpathSample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOptions {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		  driver.get("https://demo.opencart.com/"); //WebElement srcBox =
		  //driver.findElement(By.name("search"));
		  //actions.contextClick(srcBox).perform();
		  
		  WebElement menu=driver.findElement(
		  By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
		  //actions.moveToElement(menu).perform();
		  
		  WebElement menuitem = driver.findElement(
		  By.xpath("//ul[@class='list-unstyled']//a[contains(text(),'Monitors(2)')]"));
		  
		  //actions.click(menuitem).perform();
		  
		 
		
		 actions.moveToElement(menu).click(menuitem).build().perform();

		//driver.get("https://stqatools.com/demo/DoubleClick.php");
		
		/*
		 * Thread.sleep(2000); WebElement btn= driver.findElement(
		 * By.xpath("//button[text()='Click Me / Double Click Me!']"));
		 * 
		 * actions.doubleClick(btn).perform();
		 * actions.doubleClick(btn).doubleClick(btn).build().perform();
		 */
		
		
		TakesScreenshot screen =(TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+ "/screenshots/FullScreenImg.png";
		FileUtils.copyFile(src, new File(path));
		Thread.sleep(2000);
		WebElement image= driver.findElement(
				By.cssSelector("div.col-12.text-center"));	

		actions.scrollToElement(image).perform();
		//actions.scrollByAmount(10,400).perform();
		
		File scr1 = image.getScreenshotAs(OutputType.FILE);
		String path1 = System.getProperty("user.dir")+"/screenshots/" +System.currentTimeMillis() +".png";
		
		FileUtils.copyFile(scr1, new File(path1));
	}

}
