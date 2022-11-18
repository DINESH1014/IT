package org.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTraining2 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//Question 1
	
		driver.get("https://www.amazon.in/");
		
	WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
	searchbox.sendKeys("iphone");
	
   WebElement searchbox2 = driver.findElement(By.id("nav-search-submit-button"));
   
	searchbox2.click();

	//	Question 2 
	driver.get("https://www.facebook.com/");
	
	WebElement useridbox = driver.findElement(By.xpath("//input[@id='email']"));
	useridbox.sendKeys("greens");
	
	WebElement passwordbox = driver.findElement(By.xpath("//input[@id='pass']"));
	passwordbox.sendKeys("12345");
	
	WebElement loginbox = driver.findElement(By.xpath("//button[@value='1']"));
	loginbox.click();

	// Question 3 
	//not geting output
      driver.get("http://demo.automationtesting.in/Register.html");
      
      WebElement Firstnamebox = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']"));
	
      Firstnamebox.sendKeys("Dinesh");
      
      WebElement genderbox = driver.findElement(By.xpath("//input[@name='radiooptions'][1]"));
  	
      genderbox.click();
    
		
	//	Question 4 
		
		//page 404 error 
	 //  driver.get("http://toolsqa.com/automation-practice-form/");	
		
	//	Question 5 
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement Intq = driver.findElement(By.xpath("//div[@id='heading20']"));
		Intq.click();
		Thread.sleep(3000);
		WebElement cts = driver.findElement(By.xpath("//a[contains(text(),'CTS Interview Question ')]"));
		cts.click();
		
		
		// Question 6
	//	 not able to click 
		driver.get("https://www.redbus.in/");
		
		
	//	Question 7 
	driver.get(" https://www.cleartrip.com/trains");	
		
	WebElement Frombox = driver.findElement(By.xpath("//input[@id='from_station']"));
	Frombox.sendKeys("Chennai");
		
	WebElement Tobox = driver.findElement(By.xpath("//input[@id='to_station']"));
	Tobox.sendKeys("Bangalore");
	
	WebElement Searchbox = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
	Searchbox.click();
	
		
		
		//Question 8 
		
		// resume 1 has two same path
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement Modelr = driver.findElement(By.xpath("//div[@id='heading201']"));
		Modelr.click();
		
		//Question 9 	
	
		
		driver.get("https://www.flipkart.com/");
		
		WebElement Emailbox = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		Emailbox.sendKeys("8696957483");
		
		WebElement Passwrd = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		Passwrd.sendKeys("1223575859");
		
		WebElement Loginbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		Loginbtn.click();
		
	//Question 10
		// not able to click products
		//driver.get("https://www.amazon.in/");
		
	//Question 11
			
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	
		WebElement firstnamebox = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstnamebox.sendKeys("Dinesh");
	
		WebElement lastnamebox = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastnamebox.sendKeys("Hari");
	
		WebElement usernamebox = driver.findElement(By.xpath("//input[@id='username']"));
		usernamebox.sendKeys("Dineshhari");
		
		WebElement Password  = driver.findElement(By.xpath("//input[@name='Passwd']"));
		Password.sendKeys("123456789");
		
		WebElement Confirmpwrd = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		Confirmpwrd.sendKeys("123456789");
	
		
		//Question 12
		
	//	not clickable the register 
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement Signbox = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		Signbox.click();
	
		
	//	Question 13 
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement Mobnum = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		Mobnum.sendKeys("4648339393");
		Thread.sleep(5000);
		WebElement Submitbox = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		Submitbox.click();
		
		
//	Ques 14
		driver.get("https://www.swiggy.com/");
		
		WebElement Signup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		Signup.click();
	
		WebElement Phno = driver.findElement(By.xpath("//input[@id='mobile']"));
		Phno.sendKeys("1323536336");

		WebElement Name = driver.findElement(By.xpath("//input[@id='name']"));
		Name.sendKeys("Dinesh");
	
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("Dineshhari@gmail.com");
	
		WebElement Passwrd1 = driver.findElement(By.xpath("//input[@id='password']"));
		Passwrd1.sendKeys("dineshhari");
	
		WebElement Continuebtn = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		Continuebtn.click();
	
	
	
	
	}	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
		

    
		
	
      

	
	

	        
	    


