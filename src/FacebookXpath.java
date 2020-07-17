import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//madhu//software//chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Madhu");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'globalContainer\']/div[3]/div/div/div")).getText());
	}

}
//*[@id="globalContainer']/div[3]/div/div/div