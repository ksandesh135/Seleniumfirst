package day1.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Openfirefoxbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\sandesh\\aaceleration\\practiceprogram\\eclipseprogram\\Seleniumbasic\\executables\\geckodriver.exe");
		FirefoxDriver fdriver= new FirefoxDriver();
		fdriver.get("https://www.google.com");

	}

}
