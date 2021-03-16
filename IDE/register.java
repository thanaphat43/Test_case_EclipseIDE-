import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class register {

	@Test
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
        driver.get("https://alumni-2.000webhostapp.com/alumni_james/index.php/Control/regis/");
	    driver.manage().window().setSize(new Dimension(1296, 1000));
	    driver.findElement(By.id("Input3")).click();
	    driver.findElement(By.id("Input3")).sendKeys("614259035");
	    driver.findElement(By.id("Input2")).click();
	    driver.findElement(By.id("Input2")).click();
	    driver.findElement(By.name("cname")).click();
	    driver.findElement(By.name("cname")).sendKeys("ธนกฤต");
	    driver.findElement(By.name("lname")).click();
	    driver.findElement(By.name("lname")).sendKeys("ตินพ");
	    driver.findElement(By.name("nname")).click();
	    driver.findElement(By.name("nname")).sendKeys("เติ้ล");
	    driver.findElement(By.cssSelector(".form-group:nth-child(8) label")).click();
	    driver.findElement(By.name("cardid")).click();
	    driver.findElement(By.name("cardid")).sendKeys("614259035");
	    driver.findElement(By.name("dates")).click();
	    driver.findElement(By.name("dates")).sendKeys("2021-01-27");
	    driver.findElement(By.name("years")).click();
	    driver.findElement(By.name("years")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("years"));
	      dropdown.findElement(By.xpath("//option[. = '2558']")).click();
	    }
	    driver.findElement(By.name("years")).click();
	    driver.findElement(By.id("form-control")).click();
	    driver.findElement(By.id("form-control")).sendKeys("177/1");
	    driver.findElement(By.name("province")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("province"));
	      dropdown.findElement(By.xpath("//option[. = 'จันทบุรี']")).click();
	    }
	    driver.findElement(By.name("province")).click();
	    driver.findElement(By.name("joblv")).click();
	    driver.findElement(By.name("joblv")).sendKeys("นักศึกษา");
	    driver.findElement(By.name("jobname")).click();
	    driver.findElement(By.name("jobname")).sendKeys("SE");
	    driver.findElement(By.name("jobaddress")).click();
	    driver.findElement(By.name("jobaddress")).sendKeys("นครปฐม");
	    driver.findElement(By.name("jobprov")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("jobprov"));
	      dropdown.findElement(By.xpath("//option[. = 'จันทบุรี']")).click();
	    }
	    driver.findElement(By.name("jobprov")).click();
	    driver.findElement(By.name("hphone")).click();
	    driver.findElement(By.name("hphone")).sendKeys("0123456789");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("test@test.com");
	    driver.findElement(By.name("facebook")).click();
	    driver.findElement(By.name("facebook")).sendKeys("test");
	    driver.findElement(By.cssSelector(".btn-primary")).click();
	    driver.close();
	}

}
