package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailAssignment3 {

	public static void main(String[] args) throws InterruptedException {

		//		Set the system property and Launch the URL
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");

		//		Click the 'sort on date' checkbox
		driver.findElement(By.id("chkSelectDateOnly")).click();

		//		clear and type in the from station text field
		WebElement source = driver.findElement(By.id("txtStationFrom"));
		source.clear();
		source.sendKeys("Coimbatore");
		source.sendKeys(Keys.ENTER);

		//		clear and type in the to station text field
		WebElement destination = driver.findElement(By.id("txtStationTo"));
		destination.clear();
		destination.sendKeys("Chennai");
		destination.sendKeys(Keys.ENTER);

		//		Add a java sleep for 2 seconds
		Thread.sleep(2000);

		//		Store all the train names in a list
		List<WebElement> trains = driver.findElements(By.xpath("//table[@class = \"DataTable TrainList TrainListHeader\"]/tbody/tr//td[2]"));
		//Get the size of it
		System.out.println("The number of trains in the list" +trains.size());
		for (WebElement eachtrain : trains) {
			String trainNames = eachtrain.getText();
		
			System.out.println("The train names in the list" + trainNames);
			List<String> trainlist = Arrays.asList(trainNames);
			System.out.println("The Original list:" + trainlist);

			//		Add the list into a new Set		
			Set<String> trainSet = new HashSet<String>(trainlist);

			System.out.println("The trainset" + trainSet);

			//		And print the size of it

			System.out.println("The size of the trains after adding to the set" +trainlist.size());
		}
		}
	}


