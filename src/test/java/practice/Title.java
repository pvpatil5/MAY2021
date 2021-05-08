package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d1 = new ChromeDriver();
		
		//Maximize window
		d1.manage().window().maximize();
		
		//Load URL
		d1.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		d1.get("https://www.github.com");
		
		//get title of current page	
		String title = d1.getTitle();

		
	if	(title.equalsIgnoreCase("Facebook – log in or sign up")) 
	{
		System.out.println("Title is matching Test Case Pass");
	}
	else
		System.out.println("Test Case fail");
		

	}

}
