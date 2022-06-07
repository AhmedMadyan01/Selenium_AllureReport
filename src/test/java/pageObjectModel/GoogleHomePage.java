package pageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleHomePage {
    /**
     * Locators, and Variables
     */
    private static final By google_logo = By.className("lnXdpd");

    static ChromeDriver chromeDriver = new ChromeDriver();

    private static final String google_URL = ("https://www.google.com/");


    /**
     * Methods
     */
    public static void navigateToGoogleHomePage() {
        WebDriverManager.chromedriver().setup();
        chromeDriver.get(google_URL);
    }

    public static void validateThatUserRedirectedSuccessfully() {
        Assert.assertEquals(chromeDriver.getCurrentUrl(), google_URL);
    }

    public static void validateThatGoogleLogoIconExists() {
        Assert.assertTrue(chromeDriver.findElement(google_logo).isDisplayed());
    }
}
