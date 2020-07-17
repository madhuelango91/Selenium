import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//madhu//software//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.get("http://yahoo.com");
		driver.navigate().to("http://target.com");
		driver.close();
		driver.quit();
	}

}
