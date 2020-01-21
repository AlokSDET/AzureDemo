package demoazure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium {

	@Test
	public void test1() {
		System.out.println("azure pipeline1");
		Assert.assertEquals(true, true);
	}

	@Test
	public void test2() {
		System.out.println("azure pipeline2");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		driver.quit();
	}

	@Test
	public void test3() {
		System.out.println("azure pipeline3");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		driver.close();
	}

}
