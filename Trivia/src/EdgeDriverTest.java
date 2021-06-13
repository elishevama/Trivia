import static org.junit.Assert.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.javafx.scene.control.InputField;

import javafx.scene.control.RadioButton;

public class EdgeDriverTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1() {
     System.setProperty("webdriver.edge.driver", "C:\\Users\\elisheva\\git\\Trivia\\Trivia\\Trivia\\driver\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://shemsvcollege.github.io/Trivia/");
	
	}
	@Test
	public void test2() {
		
		
		EdgeDriver driver =new EdgeDriver();
		
		WebElement StartButton = driver.findelement(By.id("startB"));
		
		StartButton.click();
	
}
	@Test
	public void test3() {
		
			EdgeDriver driver =new EdgeDriver();
			try {
				driver.findelement(By.name("question")).sendKeys("what the most fast car");
				WebElement NextButton=driver.findelement(By.id("nextquest"));
				NextButton.click();
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
}
	@Test
	public void tes4() {
		
			EdgeDriver driver =new EdgeDriver();
			try {
				driver.findelement(By.name("question")).sendKeys("מה עולה המנוי במועדון שלכם");
				
			}catch(InputMismatchException e ) {
				System.out.println("can't contin hebrew Characters");
				WebElement NextButton=driver.findelement(By.id("nextquest"));
				NextButton.click();
				
			}
	}
			@Test
			public void tes5() {
				
				EdgeDriver driver =new EdgeDriver();
				try {
					driver.findelement(By.name("question")).sendKeys("what is your most important think in the life you never give up with him");
					
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Write up to 50 characters");
				}
				
	
}
			@Test
			public void tes6() {
				
				EdgeDriver driver =new EdgeDriver();
				try {
					driver.findelement(By.name("answer1")).sendKeys("*!?");
					
				}catch(InputMismatchException e) {
					System.out.println("invalid value");
				}
			}
			@Test
			public void tes7() {
				
				EdgeDriver driver =new EdgeDriver();
				try {
				RadioButton StoreButton = new RadioButton("store");
				driver.findelement(By.className("col-sm-1"));
				((WebElement) StoreButton).click();
				driver.findelement(By.id("nextquest")).click();
				
				
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
				@Test
				public void tes8() {
					
					EdgeDriver driver =new EdgeDriver();
					Scanner scanner=new Scanner(System.in);
					try {
						driver.findelement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input")).sendKeys("oil");
						driver.findelement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("letter");
						driver.findelement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("cellphone");
						driver.findelement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("wind");
						WebElement NextButton= driver.findelement(By.id("nextquest"));
						NextButton.click();
						
						
					
                       }catch(Exception e) {
                    	   System.out.println(e.getMessage());
                       }
				}




				@Test
				public void tes9() {
					
					EdgeDriver driver =new EdgeDriver();
					Scanner scanner=new Scanner(System.in);
					try {	
						WebElement PlayButton=driver.findelement(By.className("w3-btn w3-round-xlarge w3-hover-purple w3-khaki w3-padding-large playCB"));

				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				}
					@Test
					public void tes10() {
						
						EdgeDriver driver =new EdgeDriver();
						try {
							driver.findelement(By.name("answertest2")).click();
							WebElement NextButton = driver.findelement(By.id("btnnext"));
							NextButton.click();
							driver.findelement(By.name("answertest1")).click();
							WebElement NextButton1 = driver.findelement(By.id("btnnext"));
							NextButton1.click();
							driver.findelement(By.name("answertest0")).click();
							WebElement NextButton2 = driver.findelement(By.id("btnnext"));
							NextButton.click();
							
						}catch(Exception e) {
							System.out.println(e.getMessage());
						}
}
}