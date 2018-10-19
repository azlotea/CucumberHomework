package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class PetTypesPage {
    private WebElement addNewPetType;
    private List<WebElement> petTypesNameList;
    private List<WebElement> editBtnList;
    private List<WebElement> deleteBtnList;
    private WebElement homeBtn;

    public PetTypesPage(WebDriver webDriver) {
        addNewPetType = webDriver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        petTypesNameList = webDriver.findElements(By.xpath("//input[@id]"));
        editBtnList = webDriver.findElements(By.xpath("//tbody//tr//td[2]//button[1]"));
        deleteBtnList = webDriver.findElements(By.xpath("//tbody//tr//td[2]//button[2]"));
        homeBtn = webDriver.findElement(By.xpath("//button[contains(text(),'Home')]"));
    }

    public void clickAddNewPetType() {
        addNewPetType.click();
    }

    public void editNewPetType(String nameSpecialty) {
        for(int i = 0; i < petTypesNameList.size(); i++) {
            String saveSpecialty = petTypesNameList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value");
            if(nameSpecialty.equals(saveSpecialty)) {
                editBtnList.get(i).click();
                break;
                }
            }
        }

        public void deleteNewPetType(String petTypeName) {
            for(int i = 0; i < petTypesNameList.size(); i++) {
                String savePetName = petTypesNameList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value");
                if(petTypeName.equals(savePetName)) {
                    deleteBtnList.get(i).click();
                    break;
                }
            }
        }

        public void goToHomePage() {
        homeBtn.click();
        }





    }


