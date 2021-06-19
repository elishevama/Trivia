package project1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirfeoxSanityjunit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	System.setProperty("webdriver.gecko.driver",  "C:\\Users\\elisheva\\git\\Trivia\\Trivia\\Trivia\\driver\\geckodriver");
	 
		
		
		WebDriver driver= new FirefoxDriver();
		
		
		driver.get("https://shemsvcollege.github.io/Trivia/");
		System.out.println(driver.getTitle());
		
		WebElement TriviaStartButton = driver.findElement(By.id("startB"));
		TriviaStartButton.click();
		
			
		
		if(driver.getPageSource().contains("Next")==true) {
			
		}
		else
			fail("ERROR");
		}
	
	@Test
    public void SanityTest1 () {
   	
    WebDriver driver= new FirefoxDriver();
    
    try {
   	 driver.findElement(By.name("question")).sendKeys("a");
   	 WebElement NextButton = driver.findElement(By.id("nextquest"));
   	 NextButton.click();
   	 
    }catch(Exception e) {
   	 System.out.println(e.getMessage());
}
	}

    @Test
    public void SanityTest2 () {
   	
    WebDriver driver= new FirefoxDriver();
    try {
   
    
    driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[1]/div[2]/input")).sendKeys("b");
    driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[2]/div[2]/input")).sendKeys("c");
    driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[3]/div[2]/input")).sendKeys("d");
    driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[4]/div[2]/input")).sendKeys("e");
    
    WebElement NextButton = driver.findElement(By.className("w3-btn w3-round-xlarge w3-hover-purple w3-khaki w3-padding-large negativeCB"));
    NextButton.click();
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    }



    
     }
    @Test
    public void SanityTest3() throws InterruptedException {
   	
    WebDriver driver= new FirefoxDriver();
    TimeUnit Theard = null;
	Theard.sleep(3000);
	WebElement RadioButton=driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[1]/div[1]/input"));
	RadioButton.click();
	driver.findElement((By) By.id("nextquest")).click();
	
}

    @Test
    public void SanityTest4() {
    WebDriver driver= new FirefoxDriver();
    try {
      	 driver.findElement(By.cssSelector("#myform1 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).sendKeys("f");
      	 WebElement NextButton = driver.findElement(By.id("nextquest"));
      	 NextButton.click();
      	 
       }catch(Exception e) {
      	 System.out.println(e.getMessage());
    }
    }
    @Test
    public void SanityTest5 () {
   	
    WebDriver driver= new FirefoxDriver();
    try {
   
    
    driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[1]/div[2]/input")).sendKeys("g");
    driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[2]/div[2]/input")).sendKeys("h");
    driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[3]/div[2]/input")).sendKeys("i");
    driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[4]/div[2]/input")).sendKeys("j");
    
    WebElement NextButton = driver.findElement(By.id("nextquest"));
    NextButton.click();
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    }

    
}
    @Test
    public void SanityTest6() throws InterruptedException {
   	
    WebDriver driver= new FirefoxDriver();
    TimeUnit Theard = null;
	Theard.sleep(4000);
	WebElement RadioButton=driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[4]/div[1]/input"));
	RadioButton.click();
	driver.findElement((By) By.id("nextquest")).click();
}

    @Test
    public void SanityTest7() {
    WebDriver driver= new FirefoxDriver();
    try {
    	driver.findElement(By.xpath("/html/body/div/section[1]/main/div/div[2]/form/div/div/div/input")).sendKeys("k");
    	WebElement NextButton = driver.findElement(By.id("nextquest"));
      	 NextButton.click();
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    }
    
    }
   // private  Adder adder;
    
    @BeforeClass
    public static void setupDate() {
    	
    }

    @Test
    
    public void SanityTest8 () {
   	
    WebDriver driver= new FirefoxDriver();
    try {
   
    
    driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[1]/div[2]/input")).sendKeys("l");
    driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[2]/div[2]/input")).sendKeys("m");
    driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[3]/div[2]/input")).sendKeys("n");
    driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[4]/div[2]/input")).sendKeys("o");
    
    WebElement NextButton = driver.findElement(By.id("nextquest"));
    NextButton.click();
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    
}
    }
    @Test
    public void SanityTest9() throws InterruptedException {
   	
    WebDriver driver= new FirefoxDriver();
    TimeUnit Theard = null;
	Theard.sleep(7000);
	WebElement RadioButton=driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[4]/div[1]/input"));
	RadioButton.click();
	driver.findElement((By) By.id("nextquest")).click();
}
    @Test
    public void SanityTest10()  {
   	
    WebDriver driver= new FirefoxDriver();
    WebElement PlayButton = driver.findElement(By.className("w3-btn w3-round-xlarge w3-hover-purple w3-khaki w3-padding-large playCB"));
    PlayButton.click();
    
}
    @Test
    public void SanityTest11()  {
   	
    WebDriver driver= new FirefoxDriver();
    WebElement RadioButton = driver.findElement(By.name("answertest2"));
    RadioButton.click();
    WebElement NextButton= driver.findElement(By.id("btnnext"));
    NextButton.click();
}
    @Test
    public void SanityTest12()  {
   	
    WebDriver driver= new FirefoxDriver();
    WebElement RadioButton = driver.findElement(By.name("answertest1"));
    RadioButton.click();
    WebElement NextButton= driver.findElement(By.id("btnnext"));
    NextButton.click();
}
    @Test
    public void SanityTest13()  {
   	
    WebDriver driver= new FirefoxDriver();
    WebElement RadioButton = driver.findElement(By.name("answertest0"));
    RadioButton.click();
    WebElement NextButton= driver.findElement(By.id("btnnext"));
    NextButton.click();   
}
    

	}


