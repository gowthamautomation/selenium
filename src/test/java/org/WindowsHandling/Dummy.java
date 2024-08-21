package org.WindowsHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Blue'])[1]")).click();

	   Set<String> all = driver.getWindowHandles();
		for (String x : all) {
			if(!x.equals(all))
			driver.switchTo().window(x);
			
		}
		
		
		
		
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();

	}
}
