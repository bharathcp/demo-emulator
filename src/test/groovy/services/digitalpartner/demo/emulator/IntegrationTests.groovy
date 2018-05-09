package services.digitalpartner.demo.emulator

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions
import cucumber.api.CucumberOptions
import org.junit.runner.RunWith

@RunWith(ExtendedCucumber.class)
@CucumberOptions(features = "classpath:features", glue = ["classpath:services.digitalpartner.demo"])
@ExtendedCucumberOptions(jsonReport = "build/cucumber-reports/cucumber.json",
  retryCount = 3,
  detailedReport = true,
  detailedAggregatedReport = true,
  overviewReport = true,
  outputFolder = "build/cucumber-reports")
public class IntegrationTests {

}
