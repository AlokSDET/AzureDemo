package demoazure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selenium {

	WebDriver driver;

	@BeforeClass()
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@AfterClass()
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void test1() {
		System.out.println("azure pipeline1");
		driver.get("http://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@Test
	public void test2() {
		System.out.println("azure pipeline2");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Google");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();

	}

	@Test
	public void test3() {
		System.out.println("azure pipeline3");
		System.out.println(driver.getCurrentUrl());
	}

}
