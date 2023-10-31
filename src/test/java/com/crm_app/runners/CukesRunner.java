package com.crm_app.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"

        },
        features = "src/test/resources/features",
        glue = "com/crm_app/step_definitions",
        dryRun = false,
        tags = "@B30G21-101",
        publish = true
)
public class CukesRunner {}


