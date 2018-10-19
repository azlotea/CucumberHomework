package com.endava;

import org.junit.Test;

public class PetTypePageTest extends TestBase {
    public NavigationPage navigationPage;
    public PetTypesPage petTypePage;
    public AddNewPetTypesPage addNewPetType;
    public EditPetTypePage editPetTypePage;

    @Test
    public void aaddNewPetType() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickPetType(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        petTypePage = new PetTypesPage(webDriver);
        petTypePage.clickAddNewPetType();

        addNewPetType = new AddNewPetTypesPage(webDriver);
        addNewPetType.addPetType("Adimal");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void beditNewPetType() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickPetType(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        petTypePage = new PetTypesPage(webDriver);
        petTypePage.editNewPetType("Adimal");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        editPetTypePage = new EditPetTypePage(webDriver);
        editPetTypePage.editNewPetType("AdimalUpdated");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void cdeleteNewPetType() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickPetType(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        petTypePage = new PetTypesPage(webDriver);
        petTypePage.deleteNewPetType("AdimalUpdated");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        petTypePage.goToHomePage();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
