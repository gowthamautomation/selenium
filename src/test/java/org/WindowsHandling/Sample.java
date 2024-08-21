package org.WindowsHandling;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Black'])[1]")).click();

		// to find parent window id
		// String parentwindow = driver.getWindowHandle();

		// to find all windows id(parent+child)
		Set<String> all = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(all);
		String x = li.get(1);
		driver.switchTo().window(x);

		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
	}
}
