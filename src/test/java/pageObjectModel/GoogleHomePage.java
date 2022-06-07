package pageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleHomePage {
    /**
     * Locators, and Variables
     */
    private static final By google_logo = By.className("lnXdpd");


    private static final String google_URL = ("https://www.google.com/");

    private static WebDriver chromeDriver;

    /**
     * Methods
     */
    public static void navigateToGoogleHomePage() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to(google_URL);
        chromeDriver.manage().window().maximize();
    }

    public static void validateThatUserRedirectedSuccessfully() {
        Assert.assertEquals(chromeDriver.getCurrentUrl(), google_URL);
    }

    public static void validateThatGoogleLogoIconExists() {
        Assert.assertTrue(chromeDriver.findElement(google_logo).isDisplayed());
    }
}
