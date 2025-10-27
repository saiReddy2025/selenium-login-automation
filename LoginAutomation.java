import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginAutomation {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://example.com/login");
System.out.println("Opened login page successfully!");
driver.quit();
}
}
