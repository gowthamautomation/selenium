package org.screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenSho {
public static void main(String[] args) throws IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omrbranch.com/");
	
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	File shot=new File("C:\\Users\\HARIsh\\Pictures\\Screenshots.png");
	FileUtils.copyFile(screenshotAs, shot);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}	
	
	
	
	
	
	
	
	
	
	
	

