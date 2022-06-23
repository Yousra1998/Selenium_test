package com.selenium.exemple;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */

	public WebDriver driver;

	@Test
	public void testing_elements() {
		/*
		 * driver.findElement(By.linkText("Gmail")).click();
		 * driver.findElement(By.linkText("Connexion")).click(); WebElement
		 * adresse=driver.findElement(By.id("identifierId")); WebElement
		 * suivant=driver.findElement(By.id("identifierNext"));
		 * adresse.sendKeys("yousra.jaadna@gmail.com"); suivant.click();
		 */

		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		email.sendKeys("yousra_noor@live.fr");
		password.sendKeys("Bomba8577*");
		driver.findElement(By.name("login")).click();
		

	}

	@BeforeClass
	public void open_browser() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--headless");


	
		
		driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// driver.get("https://www.google.com/");

		driver.get(
				"https://www.facebook.com/?stype=lo&jlou=AffrxLSk_vCQc2XacaIZx87vGdMmXrokmrc4DDXj8mu67v8f7J6V2vQ8vZSkUKJb2RWWumrvIJbKGXKAnRg5Bb-MiG7wi4Kbboyo66aCrzscsw&smuh=23597&lh=Ac9ICx9fbxLASe-F2s0");
		String actualTitle = driver.getTitle();
        String title = "Facebook - Connexion ou inscription";
        
        if (actualTitle.contentEquals(title)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
	}

	/*
	 * @AfterClass public void close_browser() { driver.close(); }
	 */

	public AppTest() {

	}

}
