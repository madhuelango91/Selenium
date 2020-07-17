import java.util.concurrent.TimeUnit;
import javax.sound.sampled.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldCoinIndex {
	


	public static void main(String[] args) throws LineUnavailableException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//madhu//software//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldcoinindex.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement baseTable = driver.findElement(By.id("myTable"));
		WebElement baseRow = baseTable.findElement(By.xpath("//div[@class='tradetable tradetable-mob']/table/tbody/tr[1]"));
		//System.out.println("Row number is :" +baseRow.getText());
		WebElement nameColumn = baseRow.findElement(By.xpath("//div[@class='tradetable tradetable-mob']/table/tbody/tr[1]/td[3]"));
		System.out.println("Row name is: " +nameColumn.getText());
		WebElement volumeColumn = baseRow.findElement(By.xpath("//div[@class='tradetable tradetable-mob']/table/tbody/tr[1]/td[10]"));
		System.out.println("Volume is: " +volumeColumn.getText());
		if(volumeColumn.getText().equals("$ 3.09B")) {
			Sound.tone(15000,1000);
		}
	}
	
	
	
	
	
	
	
}
