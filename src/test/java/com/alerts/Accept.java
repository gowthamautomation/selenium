package com.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accept {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/");
		driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("//a[@class='mailicon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

}
