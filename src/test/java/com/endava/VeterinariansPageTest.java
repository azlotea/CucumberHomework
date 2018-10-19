package com.endava;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class VeterinariansPageTest extends TestBase {
    public NavigationPage navigationPage;
    public AddNewVeterinarianPage addNewVeterinarianPage;
    public VeterinariansPage veterinariansPage;
    public EditVeterinariansPage editVeterinarians;



    @Test
    public void addNewVeterians() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickAddNewVeterinarians(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addNewVeterinarianPage = new AddNewVeterinarianPage(webDriver);
        addNewVeterinarianPage.addVeterinarians("Adrian", "Zlotea");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void beditNewVeterinarians() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickAllVeterinarians(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        veterinariansPage = new VeterinariansPage(webDriver);
        veterinariansPage.editNewVet("Adrian Zlotea");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        editVeterinarians = new EditVeterinariansPage(webDriver);
        editVeterinarians.clickSpecialtiesDropDownField(webDriver);
        editVeterinarians.editSpecialties(webDriver);

        Actions actions = new Actions(webDriver);
        actions.sendKeys(Keys.ESCAPE).perform();
        editVeterinarians.clickSaveVetBtn();
    }

    @Test
    public void cdeleteNewVeterinarians() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickAllVeterinarians(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        veterinariansPage = new VeterinariansPage(webDriver);
        veterinariansPage.deleteNewVet("Adrian Zlotea");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        veterinariansPage = new VeterinariansPage(webDriver);
        boolean checkveterinarian = veterinariansPage.isVeterinarianPresent("Adrian Zlotea");

        Assert.assertFalse(checkveterinarian);
    }
}
