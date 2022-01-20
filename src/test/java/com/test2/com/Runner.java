package com.test2.com;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Projectabc.BaseClass;
import com.helper.com.file_ReadManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\test1\\com\\", glue="com.test2.com",
plugin = {"pretty", "html:report","com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html"})

public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void SetUp() throws Throwable {
		
		String b = file_ReadManager.getInstanceFR().getInstanceCR().getbroswer();
		driver=BaseClass.launchbrowser(b);
		//which project

	}
	
}

