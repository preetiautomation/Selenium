import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildTraverseXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\hcl\\qaf-blank-project-maven\\resources\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com");

		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("India");

	}

}
