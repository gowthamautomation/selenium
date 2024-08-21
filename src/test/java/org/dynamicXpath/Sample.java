package org.dynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]/preceding::input[3]")).sendKeys("Gowtham");
		
		
		
		
		
	}

}
