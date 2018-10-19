package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AddNewVeterinarianPage {
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement saveVetBtn;


    public AddNewVeterinarianPage(WebDriver webDriver) {
        firstNameField = webDriver.findElement(By.id("firstName"));
        lastNameField = webDriver.findElement(By.id("lastName"));
        saveVetBtn = webDriver.findElement(By.xpath("//button[contains(text(),'Save Vet')]"));
    }

    public void addVeterinarians (String firstName, String lastName) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        saveVetBtn.click();
    }

}
