
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.percy.selenium.Percy;

public class Example2 {

	WebDriver driver;
	Percy percy;

	@Parameters("Browser")
	@BeforeTest(alwaysRun = true)
	
	public void setup(String browser) {
		if (browser.equals("edge")) {
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver();
		//driver = new ChromeDriver(chromeOptions);
		
		}
		
		else if(browser.equals("chrome"))
	{
			//driver=new ChromeDriver();
//		percy = new Percy(driver);
			ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
			
		}
		percy = new Percy(driver);
	}

	@Test
	public void sauceDemoLaunch() {

//		 ChromeOptions chromeOptions =new ChromeOptions();
//		    chromeOptions.addArguments("--remote-allow-origins=*");

		driver.get("https://www.ey.com/en_in");
		percy.snapshot("saucedemopage");
		
	}

	@Test
	public void teslaLaunch() {

		driver.get("https://www.qburst.com/");
		System.out.println(driver.getCurrentUrl());
		percy.snapshot("google page");
	}

}
