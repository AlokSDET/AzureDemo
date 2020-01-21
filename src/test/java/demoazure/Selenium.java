package demoazure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium {

	WebDriver driver;

	@Test
	public void test1() {
		System.out.println("azure pipeline");
		Assert.assertEquals(true, true);
	}

	@Test
	public void test2() {
		System.out.println("azure pipeline1");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://www.google.com");
		driver.close();
	}

}
