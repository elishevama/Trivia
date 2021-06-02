package project1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.sql.Driver;
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
	    	click();
	    	driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("animal");
	    	//driver.findElement(By.cssSelector("#myform1 > div > div > div > input")).sendKeys("animal");
		//driver.findElement ((By) By.name("question")).sendKeys("animal");
		driver.findElement((By) By.id("nextquest")).click();
		
	    } catch (Exception e) {
	    	System.out.println("animal list");
	    	
	    }
		
		if(driver.getPageSource().contains("Back")==true) {
	   assertEquals(true,driver.findElement(By.name("question")).isEnabled());
			
		}
	//	else
			//fail("ERROR");
			
		}

		private void click() {
			// TODO Auto-generated method stub
			
		}



		@Test
		public void SanityTest2 () {
		Object junitTest;
		
		
	    WebDriver driver=new ChromeDriver();
	    Scanner scanner=new Scanner(System.in);
	    
		
	    try {
	    	
	    	driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("dog");
	    	driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("cat");
	    	driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("zebra");
	    	driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("bird");
	    	//driver.findElement ((By)By.name("answer1")).sendKeys("dog");
	    	//driver.findElement ((By)By.name("answer1")).sendKeys("cat");
	    	//driver.findElement ((By)By.name("answer1")).sendKeys("zebra");
	    	//driver.findElement ((By)By.name("answer1")).sendKeys("bird");
	    	
	   
			TimeUnit Theard = null;
			Theard.sleep(5000);
			WebElement radioBtn=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input"));
			radioBtn.click();
	    	driver.findElement((By) By.id("nextquest")).click();
	    	
	    	
	    	if(driver.getPageSource().contains("Back")==true) {
	    	assertEquals(true,driver.findElement(By.name("question")).isEnabled());
	    		
	    	}else
	    		fail("Error");
	    	
	    	
	    }catch (Exception e) {
	    	
	    }
	    	
	    	
	    	
	    }
	   
		
		@Test
        public void SanityTest3 () {
        Object junitTest;


          WebDriver driver=new ChromeDriver();
           Scanner scanner=new Scanner(System.in);
           


        try {
        	click();
        	driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("food");
        	driver.findElement((By) By.id("nextquest")).click();
        	
      	  
      	  
        }catch (Exception e) {
        	System.out.println("this is the second question");
        	
        	
        }
        if(driver.getPageSource().contains("Back")==true) {
     	   assertEquals(true,driver.findElement(By.name("question")).isEnabled());
     			
     		}
     		//else
     			//fail("ERROR");	
        
	
		}
		
		@Test
        public void SanityTest4 () {
        Object junitTest;
        

        WebDriver driver=new ChromeDriver();
        Scanner scanner=new Scanner(System.in);
        
        try {
        	driver.findElement(By.cssSelector("#answers > div:nth-child(2) > div.col-sm-11 > input")).sendKeys("apple");
        	driver.findElement(By.cssSelector("#answers > div:nth-child(3) > div.col-sm-11 > input")).sendKeys("beans");
        	driver.findElement(By.cssSelector("#answers > div:nth-child(4) > div.col-sm-11 > input")).sendKeys("corn");
        	driver.findElement(By.cssSelector("#answers > div:nth-child(5) > div.col-sm-11 > input")).sendKeys("yogurt");
        	
        	
        	TimeUnit Theard = null;
			Theard.sleep(5000);
			WebElement radioBtn1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
			radioBtn1.click();
			driver.findElement((By) By.id("nextquest")).click();
        	
        	
        }catch (Exception e) {
        	
        	
        }

		}
}


	

	
	

        
        


    
       
         
		
		
		
	
	
	

	
		
	

