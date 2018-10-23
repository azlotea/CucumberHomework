package com.endava;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

        public WebDriver webDriver;

        @Before
        public void init() {
            webDriver = new ChromeDriver();
            webDriver.get("http://bhdtest.endava.com/petclinic/");
            webDriver.manage().window().maximize();
        }

        @After
        public void tearDown() {
            webDriver.quit();
        }
    }


