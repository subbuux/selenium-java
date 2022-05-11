import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    private static String setProperty;

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\browser-drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
