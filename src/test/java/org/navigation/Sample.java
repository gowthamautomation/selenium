package org.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Navigation navigate = driver.navigate();
	navigate.to("https://www.amazon.in/");
	navigate.to("https://www.flipkart.com/");	
   navigate.to("https://www.meesho.com/");
   navigate.back();
   navigate.back();
   navigate.forward();
   navigate.refresh();
   
	
	
	
	
	
}
}