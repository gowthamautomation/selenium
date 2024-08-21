package org.jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.greenstechnologys.com/index.html");
		
		WebElement salem = driver.findElement(By.xpath("//span[text()='Greens Technologys Salem ']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", salem);
		
		WebElement adayar = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		js.executeScript("arguments[0].scrollIntoView(true)", adayar);

		
		
		
		
		
		
		
		
	}

}
