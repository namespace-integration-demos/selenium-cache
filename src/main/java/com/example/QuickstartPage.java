package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickstartPage extends BasePage{
	
	 public QuickstartPage(WebDriver driver) {
		 super(driver);
		
    }
	
    @FindBy(id = "accelerate-your-github-actions-with-namespace")
    public WebElement GHAText;
}
