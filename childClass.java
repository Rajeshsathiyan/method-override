package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childClass extends parentClass{
 WebDriver driver;
	 
	 public void launchApp() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://stage.tixbox.com/accounts/login#!/app/events");
		 System.out.println("child class-->admin App");
	 }
}
