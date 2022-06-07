package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import testPackage.TestBase;

@CucumberOptions(features = {"src/test/java/feature"}
        , glue = {"stepDefinition"}
        , tags = ("@GoogleTest")
        , plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}

)

public class TestRunner extends TestBase {
}