
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Seach {
	@Test
	void testSeachWithNameAndLocation() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Mannyjung\\\\\\\\Desktop\\\\\\\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("http://th.indeed.com");
		browser.findElement(By.id("text-input-what")).click();
		browser.findElement(By.id("text-input-what")).sendKeys("Selenium");
		browser.findElement(By.id("text-input-where")).click();
		browser.findElement(By.id("text-input-where")).clear();
		browser.findElement(By.id("text-input-where")).sendKeys("Bangkok");
		browser.findElement(By.xpath("//*[@type='submit']")).click();
		String result = browser.findElement(By.id("searchCountPages")).getText();

		//Thread.sleep(4000);
		browser.close();
		assertEquals("Page 1 of 67 jobs",result);
	}

	
}
