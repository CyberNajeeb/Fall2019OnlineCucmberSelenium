package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.vytrack.step_definitions",
        features = "src/test/resources/features/fleet",
        dryRun = false,
        strict = false,
        tags = "@scenario_outline_3",
        plugin = {
                "html:target/cucumber-html-report",
                "json:target/cucumber2.json"
        }

)
        public class ActivitiesTestRunner{
}
