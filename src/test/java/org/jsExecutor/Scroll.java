package org.jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Terms Of Use']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);

		WebElement element1 = driver.findElement(By.xpath("//a[text()='iPhone 15']"));
		js.executeScript("arguments[0].scrollIntoView()", element1);

		
		
		
		
		
	}

}
