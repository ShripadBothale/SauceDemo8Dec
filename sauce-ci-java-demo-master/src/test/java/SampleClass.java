
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;




public class SampleClass {
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
