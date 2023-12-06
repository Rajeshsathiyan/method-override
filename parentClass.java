package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parentClass {
	 WebDriver driver;
	 
	 public void launchApp() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://stage.tixbox.com/en/");
		 System.out.println("Parent class -->stage server");
		 
	 }
	 
}
		
