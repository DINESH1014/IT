package org.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletraining {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		System.out.println("Dinesh");
		
	//	Question 1
		
		driver.get("https://www.facebook.com/");
		
	  WebElement emailtextbox = driver.findElement(By.id("email"));
		
        emailtextbox.sendKeys("Greens");
        
       WebElement emailpassword =  driver.findElement(By.id("pass"));
        
        emailpassword.sendKeys("12345");
        
    //Question 2
        driver.get("https://www.redbus.in/ ");
        
        WebElement fromtxtbox = driver.findElement(By.id("src"));
        
        fromtxtbox.sendKeys("Chennai");
        
        WebElement Totxtbox = driver.findElement(By.id("dest"));
        Totxtbox.sendKeys("Bangalore");
        
     //Question 3
        
		driver.get("https://www.google.com/");
		
		WebElement txtbox = driver.findElement(By.name("q"));
		
		txtbox.sendKeys("GreensTechnology");

	//Question 4
	
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
	WebElement userclick  =	driver.findElement(By.xpath("//input[@id='DUMMY1']"));
		userclick.click();
		
	WebElement userid = driver.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']"));
	userid.sendKeys("Dinesh");
	
	WebElement Passwrd = driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
	Passwrd.sendKeys("12345");
		
	//Question 5 
		
	driver.get(" https://netbanking.hdfcbank.com/ ");
		
		WebElement useridtxtbox = driver.findElement(By.xpath("//input[@id='fldLoginUserId']"));
		
		//customer id not entered in textbox
		
	    useridtxtbox.sendKeys("dinesh1234");

	//Question 6 
		
			driver.get("https://www.swiggy.com/");
		
		WebElement txtboxid = driver.findElement(By.id("location"));
		
		txtboxid.sendKeys("Chennai");
		
	//	Question 7 
		driver.get("https://www.snapdeal.com/login");
		
		WebElement usertxtbox = driver.findElement(By.id("userName"));
		
		usertxtbox.sendKeys("12345");
		
	//Question 8
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		Thread.sleep(7000);
		WebElement usernametxtbox = driver.findElement(By.name("username"));
		
		usernametxtbox.sendKeys("Dinesh");
		
		WebElement passwrdtxtbox = driver.findElement(By.name("password"));
		
	    passwrdtxtbox.sendKeys("12345");

	//Question 9 
		
	//	not getting output 
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		 WebElement Firstnamebox = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']"));
			
	      Firstnamebox.sendKeys("Dinesh");
	      
       WebElement lastnamebox = driver.findElement(By.className("form-control ng-pristine ng-touched ng-invalid ng-invalid-required"));
		// not entered
		lastnamebox.sendKeys("Dhanush");
		
       WebElement addrbox = driver.findElement(By.className("form-control ng-pristine ng-valid ng-touched"));
		// not entered
		addrbox.sendKeys("Chennai");
		
       WebElement phonebox = driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched"));
		//not entered
        phonebox.sendKeys("12334758");
        
	//Question 10
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement useridbox = driver.findElement(By.id("username"));
		
		useridbox.sendKeys("dinesh");
		
		WebElement passwordtxtbox = driver.findElement(By.id("password"));
		passwordtxtbox.sendKeys("12345");
		
		//driver.quit();
		
		
		
	

	
}
}