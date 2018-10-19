package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class OwnersPageTest extends TestBase {
    public NavigationPage navigationPage;
    public OwnersPage ownersPage;
    public AddNewOwnerPage addNewOwner;



    @Test
    public void afindOwner() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickAllOwners(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ownersPage = new OwnersPage(webDriver);

        ownersPage.isOwnerPresent("Betty Davis");

    }

    @Test
    public void bcheckErrorMessage() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickAddNewOwner(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addNewOwner = new AddNewOwnerPage(webDriver);
        addNewOwner.addOwnerWithCharactersInTlelephoneField("Adrian","Zlotea","Buciumasilor 4","Bucuresti", "numar telefon");
        Assert.assertEquals("Phone number only accept digits",addNewOwner.checkErrorMessage(webDriver));
        addNewOwner.clearTelephoneFieldAndAddNumbers("0766517862");
        addNewOwner.clickAddOwnerBtn();
        navigationPage.clickAllOwners(webDriver);
        ownersPage = new OwnersPage(webDriver);
        boolean addedOwnerIsPresent = ownersPage.isOwnerPresent("Adrian Zlotea");
        Assert.assertTrue(addedOwnerIsPresent);

    }




}


