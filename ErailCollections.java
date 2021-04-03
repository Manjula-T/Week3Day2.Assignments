package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailCollections {

	public static void main(String[] args) {

		//		Launch the browser

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//		Launch the URL - https://erail.in/
		driver.get("https://erail.in/");

		//		Uncheck the check box - sort on date
		driver.findElement(By.id("chkSelectDateOnly")).click();

		//		clear and type in the source station 
		WebElement source = driver.findElement(By.id("txtStationFrom"));
		source.clear();
		source.sendKeys("Coimbatore");
		source.sendKeys(Keys.ENTER);

		//		clear and type in the destination station
		WebElement destination = driver.findElement(By.id("txtStationTo"));
		destination.clear();
		destination.sendKeys("Chennai");
		destination.sendKeys(Keys.ENTER);

		//		Find all the train names using xpath and store it in a list
		List<WebElement> trains = driver.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']//tbody/tr//td[2]"));


		System.out.println("The number of trains" +trains.size());
		for (WebElement eachtrain : trains) {
			String trainNames = eachtrain.getText();
			ArrayList<String> sortedList = new ArrayList<String>();
			sortedList.add(trainNames);
		// Use Java Collections sort to sort it and then print it
			Collections.sort(sortedList);
			System.out.println(sortedList);
		}	

	}

}
