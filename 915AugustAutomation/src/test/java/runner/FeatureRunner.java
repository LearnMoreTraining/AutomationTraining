package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)


@CucumberOptions(

        features = {"src/test/resources/feature/SaleforceErrorMessageValidation.feature"},
        glue = {"stepdefination"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty","html:target/HTMLReport","json:target/JsonReport/JsonReport.json","junit:target/junitReport.xml"},
        tags = "@AutoSuggestive"

)


public class FeatureRunner {


}
