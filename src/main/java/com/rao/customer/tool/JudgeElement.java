package com.rao.customer.tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JudgeElement {
    public boolean ElementExist(WebDriver driver,By locator){
        try {
            driver.findElement(locator);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
