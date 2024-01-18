package Gratis.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumberReports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-raport/cucumber.xml",
        },
        features = "src/test/resources",
        glue = {"Gratis/stepdefinitions","Gratis/hooks"},
        tags = "@US09",
        dryRun = false

)

public class Runner {

}
