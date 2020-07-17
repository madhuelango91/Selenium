import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//madhu//software//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Madhumitha");
		driver.findElement(By.id("password")).sendKeys("Madhu");
		driver.findElement(By.id("Login")).click();
	}

}
