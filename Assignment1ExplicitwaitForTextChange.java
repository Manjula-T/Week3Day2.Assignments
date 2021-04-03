package week3.day2.assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1ExplicitwaitForTextChange {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.id("btn"));
		wait.until(ExpectedConditions.textToBePresentInElement(element, "Click ME!"));
		System.out.println(element.isDisplayed());
		element.click();
		System.out.println("The element while clicking is:" +element.getText());
		String actualText = driver.switchTo().alert().getText();
		String expectedText="Click ME!";
		if(actualText ==expectedText) {
			System.out.println("Text is verified in alert pop up");
		}
		else
			System.out.println("Text mismatch");		

	}

}
