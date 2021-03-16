package TC4_profile;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


class profile {

	@Test
	void test() throws InterruptedException {
		WebDriver driver = null;
        String browser = "firefox";

        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Asus ROG\\\\Desktop\\\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if(browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus ROG\\Desktop\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get("https://alumni-2.000webhostapp.com/alumni_james/index.php");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.cssSelector("tbody:nth-child(3) .b2")).click();
        
        
        driver.get("https://alumni-2.000webhostapp.com/alumni_james/index.php");
	    driver.manage().window().setSize(new Dimension(1552, 840));
	    driver.findElement(By.name("search")).click();
	    driver.findElement(By.name("search")).sendKeys("2563");
	    driver.findElement(By.cssSelector(".btn")).click();
	    String result1 = driver.findElement(By.id("name")).getText();
        Thread.sleep(2000);
        assertEquals("∏π¿—∑√  ª‘Ëπ∑Õß",result1);
        driver.close();
	}

}
