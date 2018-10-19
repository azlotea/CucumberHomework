package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

public class SpecialtiesPage {
    private WebElement addNewSpecialityBtn;
    private List<WebElement> specialtiesNameList;
    private List<WebElement> editBtnList;
    private List<WebElement> deleteBtnList;

    public SpecialtiesPage(WebDriver webDriver) {
        addNewSpecialityBtn = webDriver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        specialtiesNameList = webDriver.findElements(By.xpath("//input[@id]"));
        editBtnList = webDriver.findElements(By.xpath("//tbody//tr//td[2]//button[1]"));
        deleteBtnList = webDriver.findElements(By.xpath("//tbody//tr//td[2]//button[2]"));
    }

    public void clickAddNewSpecialtiesBtn() {
        addNewSpecialityBtn.click();
    }

    public void editNewSpecialty(String nameSpecialty) {
        for(int i = 0; i < specialtiesNameList.size(); i++) {
           String saveSpecialty = specialtiesNameList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value");
           if(nameSpecialty.equals(saveSpecialty)) {
               editBtnList.get(i).click();
               break;
           }
        }
    }

    public void deleteNewSpeciality(String nameSpecialty) {
        for(int i = 0; i < specialtiesNameList.size(); i++) {
            String saveSpecialty = specialtiesNameList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value");
            if(nameSpecialty.equals(saveSpecialty)) {
                deleteBtnList.get(i).click();
                break;
            }
        }
    }
}
