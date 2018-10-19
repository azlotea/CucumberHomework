package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditPetTypePage {
    private WebElement namePetTypeField;
    private WebElement updateBtn;

    public EditPetTypePage(WebDriver webDriver) {
        namePetTypeField = webDriver.findElement(By.xpath("//input[@id='name']"));
        updateBtn = webDriver.findElement(By.xpath("//button[@type='submit']"));
    }

    public void editNewPetType(String newUpdatedPet) {
        namePetTypeField.clear();
        namePetTypeField.sendKeys(newUpdatedPet);
        updateBtn.click();
    }
}
