import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.datoms.io/login");
		System.out.println(driver.getTitle());
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("Username");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password");
		WebElement login = driver.findElement(By.id("form_submit_btn"));
		login.click();
		driver.close();
		
	}

}
