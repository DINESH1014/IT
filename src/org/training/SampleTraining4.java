package org.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleTraining4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
//	ques 1 upto more option .
	driver.get("https://www.flipkart.com/");
	
	WebElement Xbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	Xbtn.click();
	Thread.sleep(3000);
	WebElement Morebtn = driver.findElement(By.xpath("//div[@class='exehdJ']"));

	Actions action = new Actions(driver);
	action.moveToElement(Morebtn).perform();
	
//ques 2
	/*driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
	
	WebElement a = driver.findElement(By.id("credit2"));
	WebElement a1 = driver.findElement(By.id("java-class"));
	
	Actions actions = new Actions(driver);
	actions.dragAndDrop(a, a1).perform();
	
	WebElement b = driver.findElement(By.id("fourth"));
	WebElement b1 = driver.findElement(By.id("selenium"));
	
	Actions actions1 = new Actions(driver);
	actions1.dragAndDrop(b, b1).perform();
	
	
	WebElement c = driver.findElement(By.id("fifth"));
	WebElement c1 = driver.findElement(By.id("selenium-class"));
	
	Actions actions2 = new Actions(driver);
	actions2.dragAndDrop(c, c1).perform();
	
	
	
	WebElement d = driver.findElement(By.id("credit1"));
	WebElement d1 = driver.findElement(By.id("selenium-interface"));
	
	Actions actions3 = new Actions(driver);
	actions3.dragAndDrop(d, d1).perform();
	
	WebElement txt = driver.findElement(By.xpath("//a[contains(text(),'Succesfully Matched!')]"));
	String ab = txt.getText();
	System.out.println(ab);
*/	
	
	
}
}