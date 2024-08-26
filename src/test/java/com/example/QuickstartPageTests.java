package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuickstartPageTests extends BaseTests{
	 
    @Test
    public void simpleTest() {
	    QuickstartPage objLoginPage = new QuickstartPage(driver);

    	Assert.assertEquals("Faster GitHub Actions", objLoginPage.GHAText.getText());    
    }
}
