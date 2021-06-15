import java.awt.Label;
import java.util.InputMismatchException;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;


public class FunctionalityTest  {
	
public  void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedrivernew/chromedriver.exe");
	
		
	}
	
    @Test
    public void Test1 () {
    	
    	WebDriver driver =new ChromeDriver();
    	try {
    		driver.get("https://shemsvcollege.github.io/Trivia/");
    		WebElement TriviaStartButton = driver.findElement(By.id("startB"));
    		TriviaStartButton.click();
    	}catch(Exception e) {
    		
    	}
		
    	
    }
    @Test
    public void Test2 () {
    	WebDriver driver =new ChromeDriver();	
    	Scanner input = new Scanner (System.in);
    	
    	try {
    		click();
    	driver.findElement(By.cssSelector("#myform1 > div > div > div > input")).sendKeys("what is the most expensive product in the world?");
    	driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
    	
    	
    	
    }catch(Exception e) {
    	System.out.println(e.getMessage());
    }
    	
	
	}

	private void click() {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	public void Test3 () {
		WebDriver driver =new ChromeDriver();	
		Scanner input = new Scanner (System.in);
		

		try {
			driver.findElement(By.name("question")).sendKeys("איזה מטבע זה");
			
			
		}catch(InputMismatchException e) {
			System.out.println("can't contin hebrew Characters");
		}
}
	@Test
	public void Test4 () {
		WebDriver driver =new ChromeDriver();
		Scanner input = new Scanner (System.in);
		
		
		try {
			driver.findElement(By.cssSelector("#myform1 > div > div > div > input")).sendKeys("!#*");
			
		}catch(InputMismatchException e ) {
		System.out.println("invalid value");
			
			
		}
		
}
	@Test
	public void Test5 () {
		WebDriver driver =new ChromeDriver();
		Scanner input = new Scanner (System.in);
		
		try {
			driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys("what is your last education institution that you most enjoyed?");
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please write 50 Characters");
		}
}	
	@Test
	public void Test6 () {
		WebDriver driver =new ChromeDriver();
		Scanner input = new Scanner (System.in);
		
		try {
			driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input")).sendKeys(" ");
			
		}catch(Exception e) {
		System.out.println("Question field is empty,write a question");
		}
}
	@Test
	public void Test7 () {
		WebDriver driver =new ChromeDriver();
		Scanner input = new Scanner (System.in);
		try {
			driver.findElement(By.cssSelector("#myform1 > div > div > div > input")).sendKeys("1234");
		
	      }catch(InputMismatchException e ) {
        	System.out.println("invalid value");
		
}
}
	@FXML
	
	private Label myLabel;
	
	@FXML
	private RadioButton rButton1,rButton2,rButton3,rButton4;
	
	@Test
	public void Test8 () {
		WebDriver driver =new ChromeDriver();
	try {
		//RadioButton CollegeButton=new RadioButton("College");
	    WebElement radioButton=driver.findElement(By.name("answer"));
		//radioButton.clear();
		if(rButton1.isSelected()) {
			myLabel.setText("College");
		}
			//RadioButton MasterButton=new RadioButton("Master");
			else if(rButton2.isSelected()) {
				myLabel.setText("Master");
			}
		
				//RadioButton keyButton=new RadioButton("Key");
				else if(rButton3.isSelected()) {
					myLabel.setText("key");	
				}
	        	//RadioButton PublicButton=new RadioButton("Public");
	        	else if(rButton4.isSelected()){
	        		myLabel.setText("Public");
	        	}
	WebElement rButton3=driver.findElement(By.name("answer"));
	rButton3.click();
	rButton3.isSelected();
		
		WebElement NextButton = driver.findElement(By.id("nextquest"));
		NextButton .click();
		
	       }catch(Exception e) {
		    System.out.println(e.getMessage());
	        		
			}
			
		
		}
		
	
	
	

	
	@Test
	public void Test9 () {
		WebDriver driver =new ChromeDriver();
		Scanner input = new Scanner (System.in);
		
		try {
			driver.findElement(By.name("answer1")).sendKeys("אוטו");
			
		}catch(InputMismatchException e) {
			System.out.println("write only in english language");	
	}
}
	@Test
	public void Test10 () {
		WebDriver driver =new ChromeDriver();
		Scanner input = new Scanner (System.in);
		
		try {
			driver.findElement(By.name("answer1")).sendKeys("*");
			
		}catch (InputMismatchException e) {
			System.out.println("can't contain * in the answer field");	
		}
		
	}

	
	@Test
	public void Test11 () {
		WebDriver driver =new ChromeDriver();
		Scanner input = new Scanner (System.in);
		
		try {
			driver.findElement(By.name("answer1")).sendKeys("46");
			
		}catch (InputMismatchException e) {
			System.out.println("invalid value");	
	
}
	}
	@Test
	public void Test12 () {
		WebDriver driver =new ChromeDriver();
		try {
			
		
		WebElement QuizButton = driver.findElement(By.className("w3-btn w3-round-xlarge w3-hover-purple w3-khaki w3-padding-large playCB"));
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
}
	@Test
	public void Test13 () {
		WebDriver driver =new ChromeDriver();
		
		try {
	WebElement SecondQuestion = driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input"));
	SecondQuestion.sendKeys("toys");
	WebElement NextButton = driver.findElement(By.id("nextquest"));
	WebElement FirstAnswer=driver.findElement(By.name("answer1"));
	FirstAnswer.sendKeys("car");
	WebElement SecondAnswer = driver.findElement(By.name("answer1"));
	SecondAnswer.sendKeys("bear");
	WebElement ThirdAnswer = driver.findElement(By.name("answer1"));
	ThirdAnswer.sendKeys("dog");
	WebElement FourthAnswer = driver.findElement(By.name("answer1"));
	FourthAnswer.sendKeys("lego");
	WebElement BackButton = driver.findElement(By.id("backquest"));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
}
	@Test
	public void Test14 () {
		WebDriver driver =new ChromeDriver();
		Scanner input = new Scanner (System.in);
		
		try {
			
			WebElement SecondQuestion = driver.findElement(By.name("question"));
			SecondQuestion.clear();
			SecondQuestion.sendKeys("nature");
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
			
	}
	
	@Test
	public void Test15 () {
		WebDriver driver =new ChromeDriver();
		

		try {
			WebElement PlayButton = driver.findElement(By.className("w3-btn w3-round-xlarge w3-hover-purple w3-khaki w3-padding-large playCB"));
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
	
}
	}
		@Test
		public void Test16 () {
			WebDriver driver =new ChromeDriver();
			WebElement TryAgainButton = driver.findElement(By.className("w3-btn w3-round-xlarge w3-hover-purple w3-khaki w3-padding-large playCB"));
			TryAgainButton.click();
	}
	@Test
	public void Test17 () {
		WebDriver driver =new ChromeDriver();
		

		try {
			WebElement QuitButton = driver.findElement(By.className("w3-btn w3-round-xlarge w3-hover-purple w3-khaki w3-padding-large playCB"));
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
	
}
		driver.quit();
	}
	}
	