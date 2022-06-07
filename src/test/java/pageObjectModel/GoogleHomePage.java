package pageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import testPackage.TestBase;

public class GoogleHomePage {
    /**
     * Locators, and Variables
     */
    private static final By google_logo = By.className("lnXdpd");

    private static final String google_URL = ("https://www.google.com/");

    /**
     * Methods
     */
    public static void navigateToGoogleHomePage() {
        TestBase.getDriver().navigate().to(google_URL);
        TestBase.getDriver().manage().window().maximize();
    }

    public static void validateThatUserRedirectedSuccessfully() {
        Assert.assertEquals(TestBase.getDriver().getCurrentUrl(), google_URL);
    }

    public static void validateThatGoogleLogoIconExists() {
        Assert.assertTrue(TestBase.getDriver().findElement(google_logo).isDisplayed());
    }
}
