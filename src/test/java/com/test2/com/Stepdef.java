package com.test2.com;

import org.openqa.selenium.WebDriver;


import com.ABC_Pom.com.AdactinPom;
import com.Projectabc.BaseClass;
import com.helper.com.file_ReadManager;

import cucumber.api.java.en.*;

public class Stepdef extends BaseClass {
	public static WebDriver driver = Runner.driver;
	
	AdactinPom pom =new AdactinPom(driver); 
	
	@Given("^precondition$")
	public void precondition() throws Throwable {
		String u = file_ReadManager.getInstanceFR().getInstanceCR().geturl();
        get(u);	
	}

	@When("^username$")
	public void username() throws Throwable {
		String un = file_ReadManager.getInstanceFR().getInstanceCR().username();
	    Sendkeys(pom.getU_name(), un);
	}
	
	@When("^password$")
	public void password() throws Throwable {
		String p = file_ReadManager.getInstanceFR().getInstanceCR().password();
	  Sendkeys(pom.getPass(), p);
	}

	@Then("^click$")
	public void click() throws Throwable {
	   click(pom.getLogin());
	}


}
