package testPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class TestBase extends AbstractTestNGCucumberTests {
    private static WebDriver webDriver;

    @BeforeMethod
    public static void setUpDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return webDriver;
    }

    @AfterMethod
    public static void tearDownDriver() throws IOException {
        webDriver.quit();
    }

    @BeforeSuite
    public void deleteOutDatedAllureReport() throws IOException {
        CMD.executeCommandLine("rmdir /Q /S allure-results");
    }

    @AfterSuite
    public void generateAllureReport() throws IOException {
        CMD.executeCommandLine("allure serve allure-results");
    }
}
