package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Features",
		glue = { "com.stepDefination" },
        
		tags= {"@customerPanel"},
		//tags={"@panel1"},
		//tags={"@panel2"},
		//tags={"@panel3"},
		
		 plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" }
		)

public class PanelRunner {

}
