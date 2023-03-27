

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


import io.percy.selenium.Percy;



public class Example {
	
	@Test
	public void getstring()
	{
		
		 ChromeOptions chromeOptions =new ChromeOptions();
		    chromeOptions.addArguments("--remote-allow-origins=*");
		    WebDriver driver =new ChromeDriver(chromeOptions);
		    Percy percy = new Percy(driver);
		    driver.get("https://www.saucedemo.com/");
		    percy.snapshot("saucedemopage");
	  }
	
	@Test
	public void getUrl()
	{
		
		 ChromeOptions chromeOptions =new ChromeOptions();
		    chromeOptions.addArguments("--remote-allow-origins=*");
		    WebDriver driver =new ChromeDriver(chromeOptions);
		    Percy percy = new Percy(driver);
		    driver.get("https://www.tesla.com/");
		    System.out.println(driver.getCurrentUrl());
		    percy.snapshot("teslapage");
	  }
	
}
