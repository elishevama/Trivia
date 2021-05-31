package project1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyFirstProject {
	
	public  void main(String[] args) {
		
	}
	
	private static By driver;
	
	@Test
	public void SanityTest () {
	Object junitTest;

	

		WebDriver driver =new ChromeDriver();
		driver.get("https://shemsvcollege.github.io/Trivia/");
		
		WebElement TriviaStartButton = driver.findElement(By.id("startB"));
		TriviaStartButton.click();
		
	if(driver.getPageSource().contains("Next")==true) {
	
	}
	else
		fail("ERROR");
	}
	

		
		@Test
		public void SanityTest1 () {
		Object junitTest;
		
		
	    WebDriver driver=new ChromeDriver();
	    Scanner scanner=new Scanner(System.in);
	    
	    try {	
		driver.findElement ((By) By.name("question")).sendKeys("dog");
		
		
		
	    
		driver.findElement((By) By.id("nextquest")).click();
		
	    } catch (Exception e) {
	    	
	    }
		
		if(driver.getPageSource().contains("Back")==true) {
	   assertEquals(true,driver.findElement(By.name("question")).isEnabled());
			
		}
		//else
			//fail("ERROR");
			
	}


		

	
			
		}
		
	
	
	

	
		
	

