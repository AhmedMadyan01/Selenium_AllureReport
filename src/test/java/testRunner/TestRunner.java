package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import testPackage.TestBase;

@CucumberOptions(features = {"src/test/java/feature"}
        , glue = {"stepDefinition"}
        , tags = ("@GoogleTest")
)

public class TestRunner  extends TestBase {
}