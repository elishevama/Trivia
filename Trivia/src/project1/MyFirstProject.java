package project1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstProject {
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

	private static void fail(String string) {
		// TODO Auto-generated method stub
		
		WebElement FirstQuestionBox=driver.findElement((SearchContext) By.className("form-control"));
		
		FirstQuestionBox.sendKeys("A");
		WebElement NextButton = driver.findElement((SearchContext) By.id("nextquest"));
		NextButton.click();
	}

}
