package day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String pageTitle=driver.getTitle();
		
		System.out.println("Page Title "+pageTitle);
		System.out.println("Page Title length "+pageTitle.length());
		System.out.println("Page Title validation status report"+pageTitle.equals("Google"));
		
		String pageUrl=driver.getCurrentUrl();
		
		System.out.println("Page url "+pageUrl);
		System.out.println("Page url"+pageTitle.equals("https://www.google.com/"));
		
		String pageContent=driver.getPageSource();
		

	}

}
