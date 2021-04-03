package week3.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitForElementToAppears {

	public static void main(String[] args) {

	// LAunch the Browser
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//get the URL http://www.leafground.com/pages/appear.html
	driver.get("http://www.leafground.com/pages/appear.html");
	
	//Explicit Wait
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	
	//one of the button is disappeared , wait for the element to get appear 
	WebElement text = driver.findElement(By.xpath("//button [@id = 'btn']/b"));
	wait.until(ExpectedConditions.visibilityOf(text));
	
	//get that text
	System.out.println("The Element which appeared is :" + text.getText());
	
	//Close the browser
	driver.close();
	
		

	}

}
