package org.training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletraining3 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
/*	driver.get("https://adactinhotelapp.com/");
		
	//ques1
		WebElement Text = driver.findElement(By.xpath("//p [text()='Adactin Launches The Adactin Hotel App! ']"));
		String S = Text.getText();
		System.out.println(S);
	//ques 2
		driver.get("https://amazon.in");
		
		WebElement Text2 = driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use & Sale')]"));
		String a = Text2.getText();
		System.out.println(a);
*/		
	//ques 3
		
		driver.get("http://traininginchennai.in/selenium-training-in-chennai.html");
		
		WebElement Text3 = driver.findElement(By.xpath("//span[text()='Overview']"));
		Text3.click();
		Thread.sleep(3000);
		WebElement Text4 = driver.findElement(By.xpath("//p[contains(text(),'With our best online')]"));
		String D = Text4.getText();
		System.out.println(D);
		
		
		
	/*	driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement a = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
a.click();
Thread.sleep(3000);
        Alert z = driver.switchTo().alert();
        z.accept();
        

*/		
		
		
		
		
		
		
	
}
}