package org.mouseOverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dummy {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement element = driver.findElement(By.id("email"));

		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys("gowtham").keyUp(Keys.SHIFT).perform();

	}
}