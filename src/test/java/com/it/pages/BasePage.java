package com.it.pages;

import com.it.driver.DriverFactory;
import com.it.driver.MyDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    static protected MyDriver driver= MyDriver.getDriver();

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
