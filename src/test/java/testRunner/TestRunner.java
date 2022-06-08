package testRunner;

import io.cucumber.testng.CucumberOptions;
import utilities.TestBase;

@CucumberOptions
        (
                publish = true,
                features = {"src/test/java/feature"},
                glue = {"stepDefinition"},
                tags = ("@Sanity"),
                plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
        )

public class TestRunner extends TestBase {

}