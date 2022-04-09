package week3.day2.assignment;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioBagsMen {

		public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver(); 	
		
		driver.get("https://www.ajio.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		//Search for bags
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags");
		
		driver.findElement(By.xpath("//span[@Class='ic-search']")).click();
		
		Thread.sleep(3000);
		//click on men
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		
		Thread.sleep(1000);
		
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		
		Thread.sleep(3000);
		
		//printing number of bags found under men/Fashion bags
		
		String noOfItemsFound = driver.findElement(By.xpath("//div[@class='products']//div[@class='length']")).getText();
		
		System.out.println("Below is the count of items found: " +noOfItemsFound);
		
		//Defining a list to pick Brands list
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		
		//Print the count of the brands Found. 
		System.out.println("Below are the no of brands: " +brands.size() );
		System.out.println("Below are the list of brands:");
		
		// Get the list of brand of the products displayed in the page and print the list.
		for (WebElement brandeach : brands) {
			System.out.println(brandeach.getText());
		}
		
		
		// Get the list of names of the bags
		
		List <WebElement> namesOfBagsList = driver.findElements(By.xpath("//div[@class='nameCls']")); 
		
		
		//seperator
		System.out.println("***************************************************************************************");
		
		//Print the count of the Bag names  
		System.out.println("Below are the no of Bag Names found: " +namesOfBagsList.size() );
		
		System.out.println("Below are the list of Bag Names:");
		
		//printing all the values
		for (WebElement nameOfBag : namesOfBagsList) {
			System.out.println(nameOfBag.getText());
		}
		
		driver.quit();
		
	}

}
