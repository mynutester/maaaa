package com.hrms.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseClass {
//driver
public static WebDriver driver;
//openApp
public static void openApplication() {
   driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php&quot;");
Reporter.log("Application Opened ");
}
//closeApp
public static void closeApplication() {
driver.quit();
Reporter.log("Application closed ");
}
}