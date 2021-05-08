package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElement {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		//		driver.findElement(By.id("email")).sendKeys("PAVAN");
		//
		//		driver.findElement(By.name("pass")).sendKeys("TestYantra");

		//driver.findElementByLinkText("Create a Page").click();

		driver.findElement(By.partialLinkText("Create a")).click();




	}

}
