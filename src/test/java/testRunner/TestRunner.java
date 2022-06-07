package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/feature"}
        , glue = {"tepDefinition"}
        , tags = ("@GoogleTest")
)

public class TestRunner  extends AbstractTestNGCucumberTests {
}