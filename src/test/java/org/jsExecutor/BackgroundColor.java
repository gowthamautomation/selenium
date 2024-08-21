package org.jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundColor {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");

		JavascriptExecutor js=(JavascriptExecutor) driver;

		WebElement email = driver.findElement(By.id("email"));
		 js.executeScript("arguments[0].setAttribute('value','gowthammech444@gmail.com')",email);

js.executeScript("arguments[0].setAttribute('style','backGround:yellow')", email);
		

		
		
		
	}

}
