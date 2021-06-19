package project1;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import javax.naming.spi.DirStateFactory.Result;

import org.junit.Assert.*;

import org.apache.commons.exec.util.DebugUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IntegrationTest {

	public static void main(String[] args, Object Theard) throws MalformedURLException {
		// TODO Auto-generated method stub
      
		//public static void ShareLink
			
		WebDriver driver =new ChromeDriver();

		WebElement ShareButton = driver.findElement(By.xpath("//*[@id=\"fackBook2\"]/img"));
		
		
		if(ShareButton.isDisplayed()) {
			System.out.println("image is displaed");
			
			System.out.println("the image text is"+ ShareButton.getAttribute("alt"));
		}
		else {
			System.out.println("the image is not displayed");
		}
		
		
		FB.ShareLink(
		    		  
			    new URL("https://shemsvcollege.github.io/Trivia/bugg.html")
			    );
		
	}
		     
    
		    	    
			

	private static void ShareCallback() {
		// TODO Auto-generated method stub
		
	}
				
		
	}
	
