package com.ABC_Pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom {
	
	public static WebDriver driver;
	
	@FindBy(id="login")
	private WebElement login;

	@FindBy(id="username")
	private WebElement u_name;
	
	@FindBy(id="password")
	private WebElement pass;
	
	
	public AdactinPom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getU_name() {
		return u_name;
	}

	public WebElement getPass() {
		return pass;
	}
	
	
	
}
