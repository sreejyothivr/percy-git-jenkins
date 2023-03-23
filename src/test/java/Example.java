

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import io.percy.selenium.Percy;



public class Example {
	
	@Test
	public void getstring()
	{
	
//	WebDriver driver;
//	driver=new ChromeDriver();
//	Percy percy = new Percy(driver);
//   driver.get("https://www.google.com/");
//	System.out.println(driver.getTitle());
//	percy.snapshot("Java example");
		
		 ChromeOptions chromeOptions =new ChromeOptions();
		    chromeOptions.addArguments("--remote-allow-origins=*");
		    WebDriver driver =new ChromeDriver(chromeOptions);
		    Percy percy = new Percy(driver);
		    driver.get("https://www.saucedemo.com/");
		    percy.snapshot("Java example");
	  }}
