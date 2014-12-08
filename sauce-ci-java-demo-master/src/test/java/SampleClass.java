import com.saucelabs.selenium.client.factory.SeleniumFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;



public class SampleClass {
	
	 private WebDriver webDriver;
	
	 
	 @Before
	    public void setUp() throws Exception {
	        webDriver = SeleniumFactory.createWebDriver();
	    }

	    @After
	    public void tearDown() throws Exception {
	        webDriver.quit();
	    }

@Test
	public void Democlass (){
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://en.wikipedia.org/wiki/Main_Page";
		  driver.get(baseUrl);
		  driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("software testing");
		  driver.findElement(By.xpath("//*[@id='searchButton']")).click();
		  driver.close();
}
}
