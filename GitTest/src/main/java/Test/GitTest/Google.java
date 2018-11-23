package Test.GitTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Work_Data\\eclipse-jee-oxygen-3a-win32-x86_64\\soft\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Browser is Launching...");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String t=driver.getTitle();
		System.out.println("Tttle is :"+t);
		
		if(t.equals("Google"))
		{
			System.out.println("Test is Case Pass");
		}
			else
			{
				System.out.println("Test Case is failed");
			}
		driver.close();
		
		}
	}


