package secondXpathSample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("(//button[contains(text(), 'Click me!')])[1]")).click();
		Alert alert = (Alert) driver.switchTo().alert();
		System.out.println("Alert Text : " + alert.getText());
		
		//handling confirmation alert
	
		driver.findElement(By.xpath("(//button[contains(text(), 'Click me!')])[2]")).click();
		Alert confirm = (Alert) driver.switchTo().alert();
		System.out.println("Alert Text : " + confirm.getText());
		confirm.dismiss();
		
		//prmomt alerrt
		
		driver.findElement(By.xpath("(//button[contains(text(), 'Prompt')])")).click();
		Alert prompt = (Alert) driver.switchTo().alert();
		System.out.println("Alert Text : " + prompt.getText());
		
		
		
		
	}

}
