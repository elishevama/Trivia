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
	    	driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("a");
	    	//driver.findElement(By.cssSelector("#myform1 > div > div > div > input")).sendKeys("a");
		//driver.findElement ((By) By.name("question")).sendKeys("a");
		driver.findElement((By) By.id("nextquest")).click();
		
	    } catch (Exception e) {
	    	System.out.println(e.getMessage());
	    	
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
	    	
	    	driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("b");
	    	driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("c");
	    	driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("d");
	    	driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("e");
	    	
	    	
	   
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
	    	System.out.println(e.getMessage());
	    	
	    }
	    	
	    	
	    	
	    }
	   
		
		@Test
        public void SanityTest3 () {
        Object junitTest;


          WebDriver driver=new ChromeDriver();
           Scanner scanner=new Scanner(System.in);
           


        try {
        	click();
        	driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("f");
        	driver.findElement((By) By.id("nextquest")).click();
        	
      	  
      	  
        }catch (Exception e) {
        	System.out.println(e.getMessage());
        	
        	
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
        	driver.findElement(By.cssSelector("#answers > div:nth-child(2) > div.col-sm-11 > input")).sendKeys("g");
        	driver.findElement(By.cssSelector("#answers > div:nth-child(3) > div.col-sm-11 > input")).sendKeys("k");
        	driver.findElement(By.cssSelector("#answers > div:nth-child(4) > div.col-sm-11 > input")).sendKeys("l");
        	driver.findElement(By.cssSelector("#answers > div:nth-child(5) > div.col-sm-11 > input")).sendKeys("m");
        	
        	
        	TimeUnit Theard = null;
			Theard.sleep(5000);
			WebElement radioBtn1=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
			radioBtn1.click();
			driver.findElement((By) By.id("nextquest")).click();
        	
        	
        }catch (Exception e) {
        	System.out.println(e.getMessage());
        }
        
        }
        	
        	
        
        
        @Test
        public void SanityTest5 () {
         Object junitTest;


        WebDriver driver=new ChromeDriver();
        Scanner scanner=new Scanner(System.in);
   


     try {
	click();
	driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("n");
	driver.findElement((By) By.id("nextquest")).click();
	
	  
	  
     }catch (Exception e) {
	System.out.println(e.getMessage());
	
	
  }
    if(driver.getPageSource().contains("Back")==true) {
	   assertEquals(true,driver.findElement(By.name("question")).isEnabled());
			
	   
		}
        
    
    }
		//else
		//	fail("ERROR");	
       


    @Test
     public void SanityTest6 () {
      Object junitTest;


      WebDriver driver=new ChromeDriver();
       Scanner scanner=new Scanner(System.in);

      try {
	driver.findElement(By.cssSelector("#answers > div:nth-child(2) > div.col-sm-11 > input")).sendKeys("o");
	driver.findElement(By.cssSelector("#answers > div:nth-child(3) > div.col-sm-11 > input")).sendKeys("p");
	driver.findElement(By.cssSelector("#answers > div:nth-child(4) > div.col-sm-11 > input")).sendKeys("s");
	driver.findElement(By.cssSelector("#answers > div:nth-child(5) > div.col-sm-11 > input")).sendKeys("q");
	
	
	TimeUnit Theard = null;
	Theard.sleep(5000);
	WebElement radioBtn2=driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input"));
	radioBtn2.click();
	driver.findElement((By) By.id("nextquest")).click();
	
	
    }catch (Exception e) {
    	System.out.println(e.getMessage());
    
    
    	{
    	}
    }
    	}
    
  	
    


   
    

    @Test
    public void SanityTest7 () {
     Object junitTest;


    WebDriver driver=new ChromeDriver();
    try {
    driver.findElement(By.className("w3-btn w3-round-xlarge w3-hover-purple w3-khaki w3-padding-large playCB")).click();
    
    
    }catch (Exception e) {
    	System.out.println(e.getMessage());
    	if(driver.getPageSource().contains("Back")==true) {
   	   assertEquals(true,driver.findElement(By.name("question")).isEnabled());
    		   
    }
    	
    }	
    	
    	
    }
    {
    
    }



  
     @Test
     public void SanityTest8 () {
     Object junitTest;

     
     WebDriver driver=new ChromeDriver();
     try {
    WebElement RadioBtn= driver.findElement(By.name("answertest2"));
    RadioBtn.click();
    WebElement NextButton= driver.findElement(By.id("btnnext"));
    NextButton.click();
	
	
   
     }catch(Exception e) {
    	 System.out.println(e.getMessage());
    	 
     }

     }
     		


   
     @Test
     public void SanityTest9 () {
     Object junitTest;
     
     WebDriver driver=new ChromeDriver();
     try {
    	 WebElement RadioBtn1= driver.findElement(By.name("answertest1"));
    	 RadioBtn1.click();
    	 WebElement NextButton= driver.findElement(By.id("btnnext"));
    	 NextButton.click();
    	 
     }catch(Exception e) {
    	 System.out.println(e.getMessage());
     

     
     
     }
     

}


     @Test
     public void SanityTest10 () {
     Object junitTest;
     
     WebDriver driver=new ChromeDriver();
     try {
    	 WebElement RadioBtn2= driver.findElement(By.name("answertest0"));
    	 RadioBtn2.click();
    	 WebElement NextButton= driver.findElement(By.id("btnnext"));
    	 NextButton.click();
    	 
     }catch(Exception e) {
    	 System.out.println(e.getMessage());
    	 
     
     }
     
     }
     
}