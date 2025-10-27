import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();

            // Real login page
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            System.out.println("Login page opened successfully!");
            Thread.sleep(60000);  // Keeps window open for 1 minute

            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
