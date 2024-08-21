package org.mouseOverAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");

		Actions action = new Actions(driver);

		WebElement dg = driver.findElement(By.xpath("//a[text()=' String ']"));
		WebElement dp = driver.findElement(By.id("java-class"));
		action.dragAndDrop(dg, dp).perform();
		// list
		WebElement dgg = driver.findElement(By.xpath("//a[text()=' List ']"));
		WebElement dpp = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		action.dragAndDrop(dgg, dpp).perform();

		WebElement action1 = driver.findElement(By.xpath("//a[text()=' Actions ']"));
		WebElement element = driver.findElement(By.id("selenium-class"));
		action.dragAndDrop(action1, element).perform();

		WebElement action2 = driver.findElement(By.xpath("//a[text()=' Webdriver ']"));
		WebElement element1 = driver.findElement(By.id("selenium-interface"));
		action.dragAndDrop(action2, element1).perform();

		WebElement rc = driver.findElement(By.xpath("//button[text()='Right click to enter past date']"));
		action.contextClick(rc).perform();
		Alert ok = driver.switchTo().alert();
		ok.accept();

	}

}
