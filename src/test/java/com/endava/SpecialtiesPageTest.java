package com.endava;

import org.junit.Test;

public class SpecialtiesPageTest extends TestBase {
    public NavigationPage navigationPage;
    public SpecialtiesPage specialtiesPage;
    public AddNewSpecialtyPage addNewSpecialtyPage;
    public EditSpecialtyPage editSpecialtyPage;

    @Test
    public void aaddNewSpecialty() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickSpecialties(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        specialtiesPage = new SpecialtiesPage(webDriver);
        specialtiesPage.clickAddNewSpecialtiesBtn();
        addNewSpecialtyPage = new AddNewSpecialtyPage(webDriver);
        addNewSpecialtyPage.addNewSpecialty("ortopedy");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        specialtiesPage = new SpecialtiesPage(webDriver);
        specialtiesPage.clickAddNewSpecialtiesBtn();
        addNewSpecialtyPage = new AddNewSpecialtyPage(webDriver);
        addNewSpecialtyPage.addNewSpecialty("dermatology");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void bedtiNewSpecialty() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickSpecialties(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        specialtiesPage = new SpecialtiesPage(webDriver);
        specialtiesPage.editNewSpecialty("ortopedy");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        editSpecialtyPage = new EditSpecialtyPage(webDriver);
        editSpecialtyPage.editSpecialty("ortopedy123");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void cdeleteNewSpecialty() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.clickSpecialties(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        specialtiesPage = new SpecialtiesPage(webDriver);
        specialtiesPage.deleteNewSpeciality("ortopedy123");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
