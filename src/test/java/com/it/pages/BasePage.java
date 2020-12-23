package com.it.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    static protected WebDriver driver;
    static {
        WebDriverManager.chromedriver().arch64().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.i.ua/");

    }

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
