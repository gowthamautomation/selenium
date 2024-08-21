package org.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/javatraininginchennaiomr");
		
		WebElement element = driver.findElement(By.xpath("//iframe[@src='https://omrbranch.com/public/html/automation.html']"));
		
		driver.switchTo().frame(element);
		
		WebElement element2 = driver.findElement(By.xpath("//h2[text()='Automation']"));
		String text = element2.getText();
		System.out.println(text);
		
		driver.switchTo().frame("core-java");
		
		String CoreJava = driver.findElement(By.xpath("//h4[text()='Core Java']")).getText();
		System.out.println(CoreJava);
		
		driver.switchTo().frame("oops");
		
		String OOPS = driver.findElement(By.xpath("//p[text()='1.1 OOPS']")).getText();
		System.out.println(OOPS);


		String Inheritance  = driver.findElement(By.xpath("//li[text()='Inheritance']")).getText();
		System.out.println(Inheritance);

		String Abstraction = driver.findElement(By.xpath("//li[text()='Abstraction']")).getText();
		System.out.println(Abstraction);
		
		
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		
		for (int i = 0; i <= elements.size(); i++) {
			
			System.out.println(i);

		}
		

		
		
		
	}

}
