package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import testPackage.CMD;
import testPackage.TestBase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@CucumberOptions(features = {"src/test/java/feature"}
        , glue = {"stepDefinition"}
        , tags = ("@GoogleTest")
        , plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)

public class TestRunner extends TestBase {

}