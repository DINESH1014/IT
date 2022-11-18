package org.training;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");	
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	

   	driver.get("http://greenstech.in/selenium-course-content.html");
   /*	JavascriptExecutor e = (JavascriptExecutor) driver;
   	
   	WebElement bottom = driver.findElement(By.xpath("//div[contains(@title,'Recent Interview Question')]"));
   	
   	e.executeScript("arguments[0].scrollIntoView(true)", bottom);
   	
	WebElement top = driver.findElement(By.xpath("//a[@class='login-myact contactus']"));
   	
   	e.executeScript("arguments[0].scrollIntoView(true)", top);
   	
   	
   	e.executeScript("arguments[0].set attribute('value','dinesh')", txtbox);
   	*/
		
		
		WebElement Xbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Xbtn.click();
		Thread.sleep(5000);
		WebElement appln = driver.findElement(By.xpath("//a[contains(text(),'Appliances')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(appln).perform();
		
	/*driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");

	WebElement countrylist = driver.findElement(By.xpath("//select[@id='country-list']"));

	Select s = new Select(countrylist);

	 List<WebElement> a = s.getOptions();
	for (WebElement webElement : a) {
		String text = webElement.getText();
		//System.out.println(text);
	
	
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		
		for (WebElement j : allSelectedOptions) {
			
			String t = j.getText(text);
			System.out.println(t);
*/		
		
//	driver.get("http://output.jsbin.com/osebed/2");	
		
	
/*	WebElement state = driver.findElement(By.id("fruits"));
		Select s = new Select(state);
		List<WebElement> list = s.getOptions();
		for (WebElement x : list) {
		    String text = x.getText();
			//System.out.println(text);
		//s.selectByIndex(0);
		s.selectByVisibleText("Orange");
		s.selectByValue("grape");
		WebElement f = s.getFirstSelectedOption();
		String a = f.getText();
		System.out.println(a);
		
		for (WebElement x1 : list) {
			String a1 = x1.getAttribute("value");
			s.selectByValue("apple");
		}
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement  all : allSelectedOptions) {
			String b = all.getText();
			//System.out.println(b);
		}
			
*/			
		}
		
		
		
		
		}
		
	

	
