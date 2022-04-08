package com.qa.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
	        monochrome = true,
	        features = "C:\\workspace\\near\\src\\main\\java\\com\\qa\\Features\\Login.feature",
	        plugin = { "pretty","html:target/cucumber-pretty",
	                "json:target/cucumber.json" },
	        glue = "com/qa/StepDefinations",
	        dryRun = false)
	public class TestRunner {
	}
