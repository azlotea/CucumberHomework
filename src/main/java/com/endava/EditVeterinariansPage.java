package com.endava;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EditVeterinariansPage {
    private WebElement specialities;
    private WebElement dermatologyCheckbox;
    private WebElement saveVetBtn;



    public EditVeterinariansPage(WebDriver webDriver) {
        specialities = webDriver.findElement(By.id("spec"));
        saveVetBtn = webDriver.findElement(By.xpath("//button[contains(text(), 'Save Vet')]"));
    }

    public void clickSpecialtiesDropDownField(WebDriver webDriver) {
        specialities.click();

    }

    public void editSpecialties(WebDriver webDriver) {
        dermatologyCheckbox = webDriver.findElement(By.xpath("//span[@class = 'mat-option-text' and contains(text(), 'dermatology')]"));
        dermatologyCheckbox.click();
        Actions action = new Actions(webDriver);
        action.sendKeys(Keys.ESCAPE);
    }
    public void clickSaveVetBtn() {
        saveVetBtn.click();
    }







}
