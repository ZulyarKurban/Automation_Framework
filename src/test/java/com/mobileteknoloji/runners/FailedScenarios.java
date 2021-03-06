package com.mobileteknoloji.runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/mobileteknoloji/step_definitions",
//        dryRun = false,
        plugin = {
                "json:target/json-reports/cucumber.json",
                "html:target/FailedScenarios_cucumber/",
                //"return:target/rerun.txt"
        }


)
public class FailedScenarios {

    //in this class,if there are failed scenarios,this class run failed scenarios
}
