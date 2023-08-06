//package test_runner;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import utilities.exception_handling.ExceptionHandling;
//
//import java.util.Objects;
//
//public class Test_1 {
//
//    private static WebDriver driver;
//    private static final By customerCurrency_List = By.id("customerCurrency");
//
//    @Test
//    public void test1() {
//        Objects.requireNonNull(getDriver()).navigate().to("https://demo.nopcommerce.com/");
//        Select select = new Select(driver.findElement(customerCurrency_List));
//        String defaultListSelection = select.getFirstSelectedOption().getText();
//        System.out.println("Default list selection is:" + select.getFirstSelectedOption().getText());
//    }
//
//    @BeforeTest
//    public void setUpDriver() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
//
//    public static WebDriver getDriver() {
//        try {
//            assert driver != null;
//            return driver;
//        } catch (Exception exception) {
//            ExceptionHandling.handleException(exception);
//            return null;
//        }
//    }
//
//    @AfterTest
//    public void tearDownDriver() {
//        try {
//            driver.quit();
//        } catch (Exception exception) {
//            ExceptionHandling.handleException(exception);
//        }
//    }
//}
