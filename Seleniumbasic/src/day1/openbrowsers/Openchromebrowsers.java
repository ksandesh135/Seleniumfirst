package day1.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openchromebrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\sandesh\\aaceleration\\practiceprogram\\eclipseprogram\\Seleniumbasic\\executables\\chromedriver.exe");
		ChromeDriver cdriver= new ChromeDriver();
		cdriver.get("https://www.google.com");
		cdriver.navigate().refresh();
		cdriver.close();
	    
		
	}

}
