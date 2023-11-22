package secondXpathSample;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenImageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		//Method1: this will disable image loading
		options.addArguments("--blink-settings=imagesEanabled=false");
		//Method2: we can set direct preference
		
		  Map<String, Object> prefs = new HashMap<String, Object>();
		  prefs.put("profile.managed_default_content_settings.images", 2);
		  options.setExperimentalOption("prefs", prefs);
		 
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://demo.opencart.com/");
	
	}

}
