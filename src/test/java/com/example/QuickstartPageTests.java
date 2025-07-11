package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuickstartPageTests extends BaseTests{
	 
    @Test
    public void simpleTest() {
	    QuickstartPage objLoginPage = new QuickstartPage(driver);

    	Assert.assertEquals("Accelerate Your GitHub Actions with Namespace", objLoginPage.GHAText.getText());
    }
}
