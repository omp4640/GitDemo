import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver,chrome.driver", "/C:\\Users\\omp46\\Downloads\\Testing\\chromedriver_win32.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Om prakash");
		driver.findElement(By.name("inputPassword")).sendKeys("omp@123");
		driver.findElement(By.className("signInBtn")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Name']")).sendKeys("omprakash");
		driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("om@123");
		driver.findElement(By.xpath("//input[@placeholder = 'Phone Number']")).sendKeys("9939240928");
		driver.findElement(By.className("reset-pwd-btn")).click();
		driver.findElement(By.cssSelector("p.infoMsg")).getText();	

	}

}
