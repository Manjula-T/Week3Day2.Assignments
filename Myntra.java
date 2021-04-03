package week3.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// 1) Open https://www.myntra.com/
		driver.get("https://www.myntra.com/");
		// 2) Mouse over on WOMEN
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		//3) Click Jackets & Coats
		driver.findElement(By.linkText("Jackets & Coats")).click();
		Thread.sleep(3000);

		// 4) Find the total count of item
		List<WebElement> list = driver.findElements(By.xpath("//div[@class ='product-productMetaInfo']"));
		System.out.println("The total count of Jackets & Coats are:" +list.size());

		// 6) Check Coats

		driver.findElement(By.xpath("//label[text()='Coats']/div")).click();

		//7) Click + More option under BRAND	
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();

		// 8) Type MANGO and click checkbox
		driver.findElement(By.xpath("//div[@class = 'FilterDirectory-titleBar']/input")).sendKeys("Mango");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[contains(text(),'MANGO')])[2]//div")).click();

		// 9) Close the pop-up x

		driver.findElement(By.xpath(" //span[@class ='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();

		//10) Confirm all the Coats are of brand MANGO
		WebElement seacrhFilterMango = driver.findElement(By.xpath("//div[contains(text(),'MANGO')]"));

		if (seacrhFilterMango.getText().equals("MANGO"))
		{
			System.out.println("All the coats are of brand Mango");
		}
		else
		{
			System.out.println("All the coats are not brand Mango");
		}

		//11) Sort by Better Discount
		driver.findElement(By.className("sort-sortBy")).click();
		driver.findElement(By.xpath("//label[text()='Better Discount']")).click();

		// 12) Find the price of first displayed item
		WebElement firstItem = driver.findElement(By.xpath("//div[@class= 'product-price']//span[@class ='product-discountedPrice'][1]"));
		System.out.println("The first displayed item' price" +firstItem.getText());

		//13) Mouse over on size of the first item
		WebElement element2 = driver.findElement(By.xpath("//div[@class='product-productMetaInfo'][1]"));
		action.moveToElement(element2).perform();

		//14) Click on WishList Now
		driver.findElement(By.xpath("//span[@class ='myntraweb-sprite product-notWishlistedIcon sprites-notWishlisted'][1]")).click();
		//15) Close Browser
		driver.close();

	}

}
