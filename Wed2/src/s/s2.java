package s;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


class s {

	void test() {
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
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).sendKeys("∏π¿—∑√Ï");
        driver.findElement(By.cssSelector(".btn")).click();
	}
	
}
