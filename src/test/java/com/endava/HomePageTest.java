package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends TestBase {
    public HomePage homePage;

    @Test
    public void findElement() {
        homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.titleIsDisplay());
        Assert.assertEquals("Welcome", homePage.getHeaderText());
        Assert.assertTrue(homePage.imageIsPresent());

    }

}