package com.endava;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class HomePage {

    private WebElement title;
    private WebElement header;
    private WebElement image;

    public HomePage (WebDriver webDriver){
        title = webDriver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
        header = webDriver.findElement(By.xpath("//h2[contains(text(),'Welcome')]"));
        image = webDriver.findElement(By.className("img-responsive"));
    }

    public boolean titleIsDisplay(){
        return title.isDisplayed();
    }
    public String getHeaderText() {
        return header.getText();
    }
    public boolean imageIsPresent() {
        return image.isDisplayed();
    }


}
