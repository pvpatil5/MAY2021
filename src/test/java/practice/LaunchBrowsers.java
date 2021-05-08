package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {


	public static void main(String[] args) throws InterruptedException {

		//LAunching  Firefox browser chrome browser

		//ChromeDriver driver = new ChromeDriver();

		FirefoxDriver driver= new FirefoxDriver();

		//Maximize window
		driver.manage().window().maximize();

		// Used to launch the URL

		driver.get("https://www.facebook.com");

		//	driver.navigate().to("https://www.facebook.com");

		//		driver.navigate().refresh();
		//		
		//		Thread.sleep(3000);
		//		
		//		driver.navigate().to("https://www.flipkart.com");
		//		
		//		Thread.sleep(3000);
		//		
		//		driver.navigate().back();
		//		
		//		Thread.sleep(3000);
		//		
		//		driver.navigate().forward();
		//		
		Thread.sleep(3000);
		//		


		driver.close();

	}

}
