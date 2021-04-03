package week3.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitForElementDisappearances {

	public static void main(String[] args) {

		// launch Chrome

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();

		// Launch URL http://www.leafground.com/pages/disapper.html
		driver.get("http://www.leafground.com/pages/disapper.html");

		//Explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// wait for the Button to get disappear
		WebElement element = driver.findElement(By.id("btn"));
		wait.until(ExpectedConditions.invisibilityOf(element));

		// After button disappeared , Verify the text I know you can do it! Button is disappeared!
		String text = driver.findElement(By.xpath(" //strong[contains(text(),'Button is disappeared')]")).getText();
		System.out.println("The Actual text:" + text);
		String ExpectedText ="I know you can do it! Button is disappeared!";
		System.out.println("The Expected text:" + ExpectedText);
		if (ExpectedText.equals(text))
		{
			System.out.println("The text is verified");
		}
		else
		{
			System.out.println("The text is not verified");
		}
		//Close Browser
		driver.close();
	}

}
