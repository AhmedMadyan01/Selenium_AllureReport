package test_runner;

import io.cucumber.testng.CucumberOptions;
import utilities.TestBase;

@CucumberOptions
        (
                publish = true,
                features = {"src/test/java/feature"},
                glue = {"step_definition"},
                tags = ("@Sanity"),
                plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
        )

public class TestRunner extends TestBase {

}