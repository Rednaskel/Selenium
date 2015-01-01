import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Main {

	public static void main(String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://mail.google.com");
		
		driver.findElement(By.id("Email")).sendKeys("kosinski.aleksander@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("XxX");
		driver.findElement(By.id("signIn")).click();
		
		
		
	}
	
}
