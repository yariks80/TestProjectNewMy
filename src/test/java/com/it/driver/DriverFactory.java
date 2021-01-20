package com.it.driver;

import com.it.common.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

import static com.it.common.Constants.BASE_URL;

public class DriverFactory {
    static  public WebDriver getDrive() {
         WebDriver driver;
        String driverName = System.getProperty("driver");
        if (driverName != null) {
            if ("fireFox".equals(driverName)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }else if("ie".equals(driverName)){
                WebDriverManager.iedriver().setup();
                driver= new  InternetExplorerDriver();
            }else if("edge".equals(driverName)){
                WebDriverManager.edgedriver().setup();
                driver= new EdgeDriver();
            }else if("chrome".equals(driverName)){
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
            }else {
                throw new UnsupportedOperationException();
            }
        }else{
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        return  driver;
    }
}
