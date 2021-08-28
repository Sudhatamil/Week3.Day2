package Week3.Day2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		String titleofthepage = driver.getTitle();
		System.out.println(titleofthepage);
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.xpath("//input[@name='searchVal']"));
		search.sendKeys("Bags",Keys.ENTER);
		//search.click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		WebElement element=driver.findElement(By.xpath("//div[@class='length']"));
		String text=element.getText();
		System.out.println(text);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='brand']"));
		WebElement output;
		System.out.println("List of brands");
		Set<String> setofbags=new LinkedHashSet<String>();
		for(int i=0;i<list.size();i++)
		{
			output=list.get(i);
			String strbrandname=output.getText();
			setofbags.add(strbrandname);
		}
			
		for(String eachbags:setofbags)
		{
			System.out.println(eachbags);
		}
	
	
	}

}
