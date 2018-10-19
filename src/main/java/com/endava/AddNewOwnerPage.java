package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewOwnerPage {
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement addressField;
    private WebElement cityField;
    private WebElement telephoneField;
    private WebElement errorMessage;
    private WebElement addOwnerBtn;

    public AddNewOwnerPage(WebDriver webDriver) {
        firstNameField = webDriver.findElement(By.id("firstName"));
        lastNameField = webDriver.findElement(By.xpath("//input[@id='lastName']"));
        addressField = webDriver.findElement(By.xpath("//input[@id='address']"));
        cityField = webDriver.findElement(By.xpath("//input[@id='city']"));
        telephoneField = webDriver.findElement(By.xpath("//input[@id='telephone']"));
        addOwnerBtn = webDriver.findElement(By.xpath("//button[@type='submit']"));
    }

    public void addOwnerWithCharactersInTlelephoneField(String firstName, String lastName, String address, String city, String telephone) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        addressField.sendKeys(address);
        cityField.sendKeys(city);
        telephoneField.sendKeys(telephone);
    }

    public String checkErrorMessage(WebDriver webDriver) {
        errorMessage = webDriver.findElement(By.className("help-block"));
        return errorMessage.getText();
    }

    public void clearTelephoneFieldAndAddNumbers(String telephone) {

        telephoneField.clear();
        telephoneField.sendKeys(telephone);

    }

    public void clickAddOwnerBtn() {
        addOwnerBtn.click();
    }
}

