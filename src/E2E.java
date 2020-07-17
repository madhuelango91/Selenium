import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//madhu//software//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		//Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.xpath("//a[@value='CJB']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.tagName("a")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Select sel=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		sel.selectByValue("5");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		//driver.findElement();
	}

}
