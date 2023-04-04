
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.percy.selenium.Percy;

public class Example {

	WebDriver driver;
	Percy percy;

	@BeforeTest
	public void setup() {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		percy = new Percy(driver);

	}

	@Test
	public void sauceDemoLaunch() {

//		 ChromeOptions chromeOptions =new ChromeOptions();
//		    chromeOptions.addArguments("--remote-allow-origins=*");

		driver.get("https://www.saucedemo.com/");
		percy.snapshot("saucedemopage");
		
	}

	@Test
	public void teslaLaunch() {

		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		percy.snapshot("google page");
	}

}
