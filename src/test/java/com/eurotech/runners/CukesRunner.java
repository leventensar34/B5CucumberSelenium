package com.eurotech.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/eurotech/step_definitions",
        dryRun = false,
        tags = "@edit"

        /*
         Before version 4-->{"@Smoke" and "@Wip" -->and
         Before version 5 --> "@Smoke ,@Wip" --> or
         Before version 5 --> {"@Login" , "~@Wip" --> and not
         */

)

public class CukesRunner {

}
