package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * to run one scenario tags=@mobile
 * to run Two Scenario tags=@homepage or @mobile
 * to ignore only one scenario tags=not @mobile
 * 
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureFile/amazon.feature", glue="stepdef",publish=true,tags="not @ignore")
public class Amazonrunner {

}
