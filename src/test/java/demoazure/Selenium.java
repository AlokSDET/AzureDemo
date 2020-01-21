package demoazure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

		driver.navigate().to("http://www.google.com");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));

		wait.until(ExpectedConditions.elementToBeClickable(searchField));

		searchField.sendKeys("Google");

		WebElement searchButton = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));

		wait.until(ExpectedConditions.elementToBeClickable(searchButton));

		try {
			searchButton.click();
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	@Test
	public void test3() {
		System.out.println("azure pipeline3");
		driver.navigate().to("http://www.google.com");

		System.out.println(driver.getCurrentUrl());
	}

}
