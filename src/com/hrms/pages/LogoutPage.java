package com.hrms.pages;
import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LogoutPage extends BaseClass{
//objects/elements
static By link_logout = By.linkText("Logout");

//fun:
public static void logout() {
driver.findElement(link_logout).click();
Reporter.log("logout completed ");
}
}