package ProvaQA;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegador {
	
	static WebDriver driver;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com.br");					
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {		 
		driver.close();			
	}
}
