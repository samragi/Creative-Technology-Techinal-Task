package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Features",
		glue = { "com.stepDefination" },
        //tags= {"@CustomerDatabase"}, 
		//tags= {"@customerPanel"},
		//tags= {"@test1"},
		//tags= {"@test2"},
		//tags= {"@test3"}
		 tags={"@panel1"},
		plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" }
		)

public class DatabaseRunner {

}
