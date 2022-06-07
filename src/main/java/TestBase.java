import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends AbstractTestNGCucumberTests {
    private static WebDriver webDriver;

    @BeforeMethod
    public static void setUpDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    public static WebDriver getDriver(){
        return webDriver;
    }

    @AfterMethod
    public static void tearDownDriver() {
        webDriver.quit();
    }

}
