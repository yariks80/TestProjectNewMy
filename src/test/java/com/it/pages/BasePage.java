package com.it.pages;

import com.it.driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected  Logger log=Logger.getLogger(this.getClass().getSimpleName());
    static protected MyDriver driver= MyDriver.getDriver();

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
