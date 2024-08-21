package org.mouseOverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OracleTraining {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.greenstechnologys.com/index.html");
		
		WebElement element = driver.findElement(By.xpath("//a[text()='COURSES']"));

		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		action.moveToElement(element2).perform();
		
	}

}
