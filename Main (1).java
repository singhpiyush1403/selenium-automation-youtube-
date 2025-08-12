
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("http://Youtube.com");
		
		driver.findElement(By.name("search_query")).sendKeys("Pawan Singh New Songs");
		 
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[@id='video-title']")).click();
		
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
		Thread.sleep(300000);
		
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
